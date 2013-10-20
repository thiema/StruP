<?xml version="1.0" encoding="UTF-8"?>

<xsl:stylesheet version="2.0"
	xmlns:xsl="http://www.w3.org/1999/XSL/Transform" xmlns:xs="http://www.w3.org/2001/XMLSchema"
	xmlns:xsi="http://www.w3.org/2001/XMLSchema-instance" xmlns="urn:de.thiema.easyflow/types">

	<xsl:output method="xml" indent="yes" />

	<xsl:param name="assume_short_key" as="xs:boolean" select="false()"
		required="no" />
	<xsl:param name="assume_optional" as="xs:boolean" select="false()"
		required="no" />
	<xsl:param name="assume_optional_if_default_value_is_defined"
		as="xs:boolean" select="false()" required="no" />
	<xsl:param name="infer_option_from_help_attribute" as="xs:boolean"
		select="false()" required="no" />
	<xsl:param name="infer_option_from_repeat_tag" as="xs:boolean"
		select="false()" required="no" />
	<xsl:param name="change_macro_file_name_in_import_tag" as="xs:boolean"
		select="true()" required="no" />
	<xsl:param name="source" />


	<!-- identity transformation by default <xsl:template match="node()|@*"> 
		<xsl:copy> <xsl:apply-templates select="node()|@*"/> </xsl:copy> </xsl:template> -->
	<xsl:template match="*">
		<xsl:element name="{node-name(.)}">
			<xsl:apply-templates select="@*|node()"/>
		</xsl:element>
	</xsl:template>

	<xsl:template match="@*">
		<xsl:attribute name="{node-name(.)}">
      		<xsl:value-of select="." />
	    </xsl:attribute>
	</xsl:template>

	<xsl:template match="*" mode="param">
		<xsl:element name="{node-name(.)}">
			<xsl:apply-templates select="@*|node()"/>
		</xsl:element>
	</xsl:template>

	<xsl:template match="@*" mode="param">
		<xsl:attribute name="{node-name(.)}">
      		<xsl:value-of select="." />
	    </xsl:attribute>
	</xsl:template>

	<!-- <xsl:template match="node()" name="identity"> <xsl:choose> <xsl:when 
		test="name()"> <xsl:element name="NAME"> <xsl:copy-of select="@*"/> <xsl:value-of 
		select="name()"></xsl:value-of> ACHTUNG=<xsl:apply-templates select="node()" 
		/> </xsl:element> </xsl:when> <xsl:otherwise> <xsl:copy> <xsl:apply-templates 
		select="node()"/> </xsl:copy> </xsl:otherwise> </xsl:choose> </xsl:template> -->



	<!-- these elements (and its children) are discarded -->
	<xsl:template match="command|help|tests|trackster_conf"></xsl:template>

	<xsl:template match="import">
		<xsl:element name="import">
			<xsl:apply-templates select="@*"/>
			<xsl:choose>
			<xsl:when test="$change_macro_file_name_in_import_tag">
				<xsl:value-of select="replace(node(),'.xml', '_easyflow.xml')"></xsl:value-of>
			</xsl:when>
			<xsl:otherwise>
				<xsl:apply-templates select="node()"/>
			</xsl:otherwise>
			</xsl:choose>
		</xsl:element>
	</xsl:template>
	<!-- transparently process element -->
	<xsl:template match="inputs|outputs">
		<xsl:apply-templates select="node()|@*" mode="param" />
		<xsl:if test="name()='outputs'">
			<xsl:apply-templates select="node()|@*" mode="data"/>
		</xsl:if>
	</xsl:template>

	<xsl:template match="tool">
		<xsl:element name="tool">

			<xsl:attribute name="xsi:schemaLocation">urn:de.thiema.easyflow/types Easyflow.xsd</xsl:attribute>
			<xsl:copy-of select="@*" />


			<!-- name="{name()}" namespace="urn:de.thiema.easyflow/types" <xsl:attribute 
				name="xmlns:ms">urn:de.thiema.easyflow/types</xsl:attribute> <xsl:namespace 
				name="">urn:de.thiema.easyflow/types</xsl:namespace> -->
			<xsl:apply-templates select="@*|node()"/>
		</xsl:element>
	</xsl:template>

	<xsl:template match="repeat" mode="param">
		<xsl:apply-templates select="child::*">
			<xsl:with-param name="name" select="@name" />
			<xsl:with-param name="min" select="@min" />
			<xsl:with-param name="max" select="@max" />
			<xsl:with-param name="help" select="@help" />
			<xsl:with-param name="title" select="@title" />
			<xsl:with-param name="multiple" select="true()" />
			<xsl:with-param name="mode" select="'param'" />
		</xsl:apply-templates>
	</xsl:template>

	<xsl:template match="repeat">
		<xsl:apply-templates select="child::*">
			<xsl:with-param name="name" select="@name" />
			<xsl:with-param name="min" select="@min" />
			<xsl:with-param name="max" select="@max" />
			<xsl:with-param name="help" select="@help" />
			<xsl:with-param name="title" select="@title" />
			<xsl:with-param name="multiple" select="true()" />
			<xsl:with-param name="mode" select="'param'" />
		</xsl:apply-templates>
	</xsl:template>

	<xsl:template match="conditional" mode="param">
		<xsl:param name="name" />
		<xsl:param name="min" />
		<xsl:param name="max" />
		<xsl:param name="help" />
		<xsl:param name="title" />

		<xsl:choose>
		
			<xsl:when test="param/option/@value=$source">
				<xsl:apply-templates select="when[@value=$source]/*"></xsl:apply-templates>
			</xsl:when>
			<xsl:otherwise>
				<xsl:element name="{name()}">
					<xsl:copy-of select="@*" />
					<xsl:apply-templates select="node()">
						<xsl:with-param name="name" select="@name" />
						<xsl:with-param name="min" select="@min" />
						<xsl:with-param name="max" select="@max" />
						<xsl:with-param name="help" select="@help" />
						<xsl:with-param name="title" select="@title" />
					</xsl:apply-templates>
				</xsl:element>
				<!-- this adds an empty namespace because a default global namespace 
					is defined. <xsl:copy> <xsl:apply-templates select="node()"/> </xsl:copy> -->
			</xsl:otherwise>
		</xsl:choose>
		<!--debug: ############ <xsl:value-of select="param/option/@value"></xsl:value-of>
		############ <xsl:value-of select="$source"></xsl:value-of> -->
	</xsl:template>

	<xsl:template match="param" mode="param">
		<xsl:call-template name="param"/>
	</xsl:template>
	
	<xsl:template match="param" name="param">
		<xsl:param name="name" />
		<xsl:param name="min" />
		<xsl:param name="max" />
		<xsl:param name="help" />
		<xsl:param name="title" />
		<xsl:param name="format" />
		<xsl:param name="type" />
		<xsl:param name="output" />
		<xsl:param name="multiple" />
		<xsl:param name="mode" />

		<xsl:element name="param">
			<xsl:choose>
				<xsl:when test="@name">
					<xsl:attribute name="name"><xsl:value-of
						select="@name" /></xsl:attribute>
				</xsl:when>
				<xsl:when test="$name">
					<xsl:attribute name="name"><xsl:value-of
						select="$name" /></xsl:attribute>
				</xsl:when>
			</xsl:choose>

			<xsl:choose>
				<xsl:when test="@type">
					<xsl:attribute name="type"><xsl:value-of
						select="@type" /></xsl:attribute>
				</xsl:when>
				<xsl:when test="$type">
					<xsl:attribute name="type"><xsl:value-of
						select="$type" /></xsl:attribute>
				</xsl:when>
			</xsl:choose>
			
			<xsl:choose>
				<xsl:when test="@type='data' and @format">
					<xsl:attribute name="format"><xsl:value-of
						select="@format" /></xsl:attribute>
				</xsl:when>
				<xsl:when test="$format">
					<xsl:attribute name="format"><xsl:value-of
						select="$format" /></xsl:attribute>
				</xsl:when>
			</xsl:choose>

			<xsl:choose>
				<xsl:when test="@help">
					<xsl:attribute name="help"><xsl:value-of
						select="@help" /></xsl:attribute>
				</xsl:when>
				<xsl:when test="$help">
					<xsl:attribute name="help"><xsl:value-of
						select="$help" /></xsl:attribute>
				</xsl:when>
			</xsl:choose>

			<xsl:if test="@label">
				<xsl:attribute name="label"><xsl:value-of select="@label"/></xsl:attribute>
			</xsl:if>
			<!-- this indicates a repeat tag -->
			<xsl:if test="$multiple">
				<xsl:attribute name="multiple"><xsl:value-of select="true()"/></xsl:attribute>
			</xsl:if>
			<xsl:if test="$min">
				<xsl:attribute name="min_occur"><xsl:value-of select="$min"/></xsl:attribute>
			</xsl:if>
			<xsl:if test="$max">
				<xsl:attribute name="max_occur"><xsl:value-of select="$max"/></xsl:attribute>
			</xsl:if>
			<xsl:if test="$output">
				<xsl:attribute name="output"><xsl:value-of select="true()"/></xsl:attribute>
			</xsl:if>
			<xsl:if test="@optional">
				<xsl:attribute name="optional">
					<xsl:choose>
					<xsl:when test="@optional='False'"><xsl:value-of select="false()"/></xsl:when>
					<xsl:when test="@optional='True'"><xsl:value-of select="true()"/></xsl:when>
					<xsl:otherwise><xsl:value-of select="@optional"/></xsl:otherwise>
					</xsl:choose>
				</xsl:attribute>
				
			</xsl:if>

			<xsl:choose>
				<xsl:when test="$infer_option_from_repeat_tag and parent::repeat">
					<xsl:choose>
						<xsl:when test="parent::repeat/@min >= 1">
							<xsl:attribute name="optional"><xsl:value-of select="false()"/></xsl:attribute>
						</xsl:when>
						<xsl:otherwise>
							<xsl:attribute name="optional"><xsl:value-of select="true()"/></xsl:attribute>
						</xsl:otherwise>
					</xsl:choose>
				</xsl:when>
			</xsl:choose>
			<xsl:call-template name="output_default" />
			<xsl:call-template name="output_option_key" />

			<xsl:if test="$mode=param">
				<xsl:apply-templates select="node()"/>
			</xsl:if>
			<!-- <xsl:call-template name="test_call_template"/> <xsl:apply-templates 
				select="node()|@*"/> <xsl:call-template name="output_option_key"/> <xsl:call-template 
				name="identity"></xsl:call-template> -->
		</xsl:element>
	</xsl:template>

	<xsl:template name="output_default">
		<xsl:choose>
			<xsl:when test="attribute::truevalue">
				<xsl:attribute name="defaultValue"><xsl:value-of select="true()"/></xsl:attribute>
			</xsl:when>
			<xsl:when test="attribute::falsevalue">
				<xsl:attribute name="defaultValue"><xsl:value-of select="false()"/></xsl:attribute>
			</xsl:when>
		</xsl:choose>
	</xsl:template>

	<xsl:template name="helpfunc_output_option_key">
		<xsl:param name="key" />

		<xsl:element name="key">
			<xsl:choose>
				<xsl:when test="starts-with($key,'--')">
					<xsl:attribute name="type">long</xsl:attribute>
					<xsl:value-of select="substring($key,3)" />
				</xsl:when>
				<xsl:when test="starts-with($key,'-')">
					<xsl:attribute name="type">short</xsl:attribute>
					<xsl:value-of select="substring($key,2)" />
				</xsl:when>
				<xsl:otherwise>
					<xsl:value-of select="$key" />
				</xsl:otherwise>

			</xsl:choose>
		</xsl:element>
	</xsl:template>

	<xsl:template name="output_option_key">

		<xsl:variable name="key">
			<xsl:choose>
				<xsl:when test="attribute::truevalue">
					<xsl:value-of select="attribute::truevalue" />
				</xsl:when>
				<xsl:when test="attribute::falsevalue">
					<xsl:value-of select="attribute::falsevalue" />
				</xsl:when>
			</xsl:choose>
		</xsl:variable>
		<xsl:if test="$key!=''">
			<xsl:call-template name="helpfunc_output_option_key">
				<xsl:with-param name="key" select="$key" />
			</xsl:call-template>
		</xsl:if>

		<xsl:if test="$infer_option_from_help_attribute and @help">
			<xsl:variable name="keys"
				select="tokenize(tokenize(@help, '\s+')[1], ',')" />
			<xsl:for-each select="$keys">
				<xsl:variable name="cur_key" select="." />
				<xsl:if test="$key!=$cur_key">
					<xsl:call-template name="helpfunc_output_option_key">
						<xsl:with-param name="key" select="$cur_key" />
					</xsl:call-template>
				</xsl:if>
			</xsl:for-each>
		</xsl:if>

	</xsl:template>


	<xsl:template match="data" mode="param">

		<xsl:call-template name="param">
			<xsl:with-param name="name" select="@name" />
			<xsl:with-param name="format" select="@format" />
			<xsl:with-param name="output" select="true()" />
			<xsl:with-param name="type" select="'data'"/>
		</xsl:call-template>
	</xsl:template>

	<xsl:template match="data" mode="data">

		<xsl:element name="data">
			<xsl:attribute name="name"><xsl:value-of select="@name" /></xsl:attribute>
			<xsl:attribute name="format"><xsl:value-of select="@format" /></xsl:attribute>
			<xsl:attribute name="label"><xsl:value-of select="@label" /></xsl:attribute>
			<xsl:apply-templates select="node()|@*" mode="param"/>
		</xsl:element>
	</xsl:template>


</xsl:stylesheet>
