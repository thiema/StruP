<?xml version="1.0" encoding="UTF-8"?>

<xsl:stylesheet version="2.0"
xmlns:xsl="http://www.w3.org/1999/XSL/Transform">
<xsl:output method="xml" indent="yes"/>


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

<xsl:template match="inputs">
	<xsl:apply-templates select=".//param"></xsl:apply-templates>
</xsl:template>
 
<xsl:template match="outputs">
	<xsl:apply-templates select="data"></xsl:apply-templates>
</xsl:template>

<xsl:template match="param">
	<!-- xsl:value-of select="ancestor::when[1]"/-->
	<!-- xsl:if test="ancestor::when[1]">
			found ancester when
	</xsl:if>

	
	<xsl:if test="ancestor::when[1]/following-sibling::when">
			has a following sibling
	</xsl:if> -->
	<xsl:if test="not(ancestor::when[1]/preceding-sibling::when[1])">	
		<xsl:element name="param">
			<xsl:attribute name="name"><xsl:value-of select="@name" /></xsl:attribute>
			<xsl:attribute name="type"><xsl:value-of select="@type" /></xsl:attribute>
			<xsl:attribute name="label"><xsl:value-of select="@label" /></xsl:attribute>
			<xsl:if test="@help">
				<xsl:attribute name="help"><xsl:value-of select="@help" /></xsl:attribute>
			</xsl:if>
			
			<!-- xsl:if test="ancestor::conditional[1]">
				<xsl:attribute name="dependency"><xsl:value-of select="ancestor::conditional[1]/@name" /></xsl:attribute>
			</xsl:if> -->
			<xsl:choose>
				<xsl:when test="parent::repeat">
					<xsl:attribute name="multiple">true</xsl:attribute>
					<xsl:if test="parent::repeat/@min">
						<xsl:attribute name="min"><xsl:value-of select="parent::repeat/@min" /></xsl:attribute>
					</xsl:if>
					<xsl:choose>
						<xsl:when test="parent::repeat/@min >= 1">
							<xsl:attribute name="optional">false</xsl:attribute>
						</xsl:when>
						<xsl:otherwise>
							<xsl:attribute name="optional">true</xsl:attribute>
						</xsl:otherwise>
					</xsl:choose>
				</xsl:when>
				<xsl:when test="attribute::value">
					<xsl:attribute name="optional">false</xsl:attribute>
				</xsl:when>
				<xsl:otherwise>
					<xsl:attribute name="optional">true</xsl:attribute>
				</xsl:otherwise>
			</xsl:choose>
			<!-- xsl:variable name="keys" select="tokenize(substring-before(@help, '\s+'), ',')"/>
			 -->
			<xsl:variable name="keys" select="tokenize(tokenize(@help, '\s+')[1], ',')" />
			<xsl:for-each select="$keys">
				<xsl:element name="key">
					<xsl:value-of select="."></xsl:value-of>
				</xsl:element>
			</xsl:for-each>
			
		</xsl:element>
						
	</xsl:if>
</xsl:template>

<xsl:template match="data">
	<xsl:element name="data">
		<xsl:attribute name="name"><xsl:value-of select="@name"/></xsl:attribute>
		<xsl:attribute name="format"><xsl:value-of select="@format"/></xsl:attribute>
		<xsl:attribute name="output">true</xsl:attribute>
		
	</xsl:element>
</xsl:template>

</xsl:stylesheet> 