<?xml version="1.0" encoding="UTF-8"?>

<xsl:stylesheet version="2.0"
xmlns:xsl="http://www.w3.org/1999/XSL/Transform"
xmlns:xs="http://www.w3.org/2001/XMLSchema">
<xsl:output method="xml" indent="yes"/>
<xsl:param name="assume_short_key" as="xs:boolean" select="false()" required="no"/>
<xsl:param name="assume_optional" as="xs:boolean" select="false()" required="no"/>
<xsl:param name="assume_optional_if_default_value_is_defined" as="xs:boolean" select="false()" required="no"/>
<xsl:param name="infer_option_from_help_attribute" as="xs:boolean" select="false()" required="no"/>
<xsl:param name="infer_option_from_repeat_tag" as="xs:boolean" select="false()" required="no"/>
<xsl:param name="source"/>



<!--
<xsl:param name="separator" as="xs:string" select="" required="no"/> 
<xsl:variable name="key_type_determined" type="xs:boolean" select="false"/>
<xsl:variable name="key_name_determined" type="xs:boolean" select="false"/>

options: \-\-assume_short_key (boolean), default: false, if the option type (short or long key name) cannot derived which one should be assumed ?
         \-\-separator (string) <sep string> //default: space specify default parameter to be set in the output xml
         \-\-assume_optional (boolean), default: false, if the parameter isnt known to be optional or not, what should be assumed ?
         \-\-infer_option_from_help_attribute (boolean), extract type and key of the option from help attribute (e.g. "-I,\-\-input_file &amp;lt;input_file&amp;gt;"))
         \-\-infer_option_from_repeat_tag (boolean)
         \-\-assume_optional_if_default_value_is_defined

<tools:tool>
		<description>tool definition example</description> 
		<format name=bam></format>
		<data id=abc format=bam></data>
		<param optional=true data=abc>
			<key>short_key</key>            //deduce from the paramname: 1.) check truevalue attrib -> boolean param, 
											//                           2.) find from help attribute
											//                           3.) fallback: use the name attribute and assume long option
			<key long=true>long_key</key>   //In principal its defined in the command tag (parse options to find prefix - or \-\-), however its hard to grab out
		</param>
		<param >
	</tools:tool>
 -->
<!-- todo: 
-conditional tag to define option depending on something, 
e.g. the input/output file (-format) that has to be chosen
vcf_tools/intersect.xml,
what follows is a 
    <conditional name="format_type">
      <param name="format" type="select" label="intersect with file of format">
        <option value="vcf">VCF</option>
        <option value="bed">BED</option>
      </param>
      <when value="vcf">
        <param name="input2" label="second VCF file" type="data" format="vcf"/>
      </when>
      <when value="bed">
        <param name="input2" label="second BED file" type="data" format="bed"/>
      </when>
    </conditional>
    
    
    
-options tags: dynamically creates a list of options whose values can be obtained from a predefined file stored locally 
or a dataset selected from the current history. tag is used within param tag
	<options from_data_table="tophat2_indexes">
            <filter type="sort_by" column="2"/>
            <validator type="no_options" message="No genomes are available for the selected input dataset"/>
    </options>

-macros (import tags from a external xml tool definition):
  -> import macros in the same way as galaxy does. (define import tag)
  -> process marco definition xml file with the same stylesheet
-expand macro (parameterise an imported macro)
  -> take as it is
-->

<xsl:template match="/tool">
 
<tool>
	<description>
		<xsl:value-of select="description"/>
	</description>
	<command>
		<xsl:apply-templates select="command">
		</xsl:apply-templates>
	</command>
		<xsl:apply-templates select="outputs">
		</xsl:apply-templates>
		<xsl:apply-templates select="inputs">
		</xsl:apply-templates>
</tool>

</xsl:template>

<xsl:template match="command">
	<xsl:attribute name="interpreter">
    	<xsl:value-of select="@interpreter"/>
  	</xsl:attribute>
</xsl:template>

<!-- xsl:template match="inputs">
	<xsl:apply-templates select=".//param"></xsl:apply-templates>
</xsl:template>
 
<xsl:template match="outputs">
	<xsl:apply-templates select="data"></xsl:apply-templates>
</xsl:template>
 
 -->
<xsl:template match="conditional">
	<xsl:choose>
	<xsl:when test="param/option/@value=$source">
		
		<xsl:call-template name="param"></xsl:call-template>
		<xsl:element name="dummy2"><xsl:value-of select="$source"></xsl:value-of></xsl:element>
	</xsl:when>
	<xsl:otherwise>
		<xsl:copy>
			<xsl:apply-templates select="@* | node()"/>
			<xsl:element name="dummy1"></xsl:element>
		</xsl:copy>
	</xsl:otherwise>
	</xsl:choose>
</xsl:template>
 
<xsl:template name="param" match="param">
	<!-- ($source='' and not(ancestor::when[1]/preceding-sibling::when[1])) 
		or ($source!='' and (not(ancestor::when[1]) or ancestor::when[1]/option/@value=$source)) -->

	<xsl:if test="not(ancestor::when[1]/preceding-sibling::when[1])">
		<xsl:element name="param">
			<xsl:attribute name="name"><xsl:value-of select="@name" /></xsl:attribute>
			<xsl:attribute name="type"><xsl:value-of select="@type" /></xsl:attribute>
			<xsl:if test="@type='data' and @format">
				<xsl:attribute name="format"><xsl:value-of select="@format" /></xsl:attribute>
			</xsl:if>
			<xsl:attribute name="label"><xsl:value-of select="@label" /></xsl:attribute>


			<xsl:if test="@help">
				<xsl:attribute name="help"><xsl:value-of select="@help" /></xsl:attribute>
			</xsl:if>

			<!-- xsl:if test="ancestor::conditional[1]"> <xsl:attribute name="dependency"><xsl:value-of 
				select="ancestor::conditional[1]/@name" /></xsl:attribute> </xsl:if> -->
			<xsl:variable name="option_property_determined">
				<xsl:if test="attribute::truevalue">
					<xsl:attribute name="optional">true</xsl:attribute>
					<xsl:value-of select="true()" />
				</xsl:if>

 				<xsl:if test="parent::repeat">
					<xsl:attribute name="multiple">true</xsl:attribute>
					<xsl:choose>
						<xsl:when test="parent::repeat/@min">
							<xsl:attribute name="min"><xsl:value-of
								select="parent::repeat/@min" /></xsl:attribute>

							<xsl:if test="$infer_option_from_repeat_tag and parent::repeat">
								<xsl:value-of select="true()" />
								<xsl:choose>
									<xsl:when test="parent::repeat/@min >= 1">
										<xsl:attribute name="optional">false</xsl:attribute>
									</xsl:when>
									<xsl:otherwise>
										<xsl:attribute name="optional">true</xsl:attribute>
									</xsl:otherwise>
								</xsl:choose>
							</xsl:if>
						</xsl:when>
						<xsl:otherwise>
							<xsl:value-of select="false()" />
						</xsl:otherwise>
					</xsl:choose>
 				</xsl:if>

			</xsl:variable>
			<xsl:if
				test="$assume_optional_if_default_value_is_defined and not($option_property_determined)">
				<xsl:choose>
					<xsl:when test="attribute::value">
						<xsl:attribute name="optional">false</xsl:attribute>
					</xsl:when>
					<xsl:otherwise>
						<xsl:attribute name="optional">true</xsl:attribute>
					</xsl:otherwise>
				</xsl:choose>
			</xsl:if>

			<xsl:if test="$infer_option_from_help_attribute">
				<xsl:variable name="keys"
					select="tokenize(tokenize(@help, '\s+')[1], ',')" />
				<xsl:for-each select="$keys">
					<xsl:element name="key">
						<xsl:value-of select="."></xsl:value-of>
					</xsl:element>
				</xsl:for-each>
			</xsl:if>

		</xsl:element>

	</xsl:if>
</xsl:template>

	<xsl:template match="data">
		<xsl:element name="data">
			<xsl:attribute name="name"><xsl:value-of select="@name" /></xsl:attribute>
			<xsl:attribute name="format"><xsl:value-of select="@format" /></xsl:attribute>
			<xsl:attribute name="output">true</xsl:attribute>

		</xsl:element>
	</xsl:template>

</xsl:stylesheet>
