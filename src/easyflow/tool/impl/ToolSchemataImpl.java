/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package easyflow.tool.impl;

import easyflow.custom.util.URIUtil;
import easyflow.custom.util.XMLUtil;
import easyflow.tool.ToolPackage;
import easyflow.tool.ToolSchemata;
import easyflow.util.maps.MapsPackage;
import easyflow.util.maps.impl.StringToSchemaMapImpl;
import easyflow.util.maps.impl.StringToURIMapImpl;
import java.io.BufferedInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.InputStream;
import java.io.Reader;
import java.lang.reflect.InvocationTargetException;
import java.net.URI;
import javax.xml.XMLConstants;
import javax.xml.transform.Source;
import javax.xml.transform.stream.StreamSource;
import javax.xml.validation.Schema;
import org.apache.log4j.Logger;
import javax.xml.validation.SchemaFactory;
import org.apache.commons.lang.StringUtils;
import org.eclipse.emf.common.notify.NotificationChain;
import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.common.util.EMap;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EStructuralFeature;
import org.eclipse.emf.ecore.InternalEObject;
import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;
import org.eclipse.emf.ecore.util.EcoreEMap;
import org.eclipse.emf.ecore.util.InternalEList;
import org.w3c.dom.Attr;
import org.w3c.dom.Document;
import org.w3c.dom.ls.LSInput;
import org.w3c.dom.ls.LSResourceResolver;
import org.xml.sax.SAXException;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Schemata</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link easyflow.tool.impl.ToolSchemataImpl#getSchemata <em>Schemata</em>}</li>
 *   <li>{@link easyflow.tool.impl.ToolSchemataImpl#getSchemataURI <em>Schemata URI</em>}</li>
 *   <li>{@link easyflow.tool.impl.ToolSchemataImpl#getLogger <em>Logger</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class ToolSchemataImpl extends MinimalEObjectImpl.Container implements ToolSchemata {
	/**
	 * The cached value of the '{@link #getSchemata() <em>Schemata</em>}' map.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getSchemata()
	 * @generated
	 * @ordered
	 */
	protected EMap<String, Schema> schemata;

	/**
	 * The cached value of the '{@link #getSchemataURI() <em>Schemata URI</em>}' map.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getSchemataURI()
	 * @generated
	 * @ordered
	 */
	protected EMap<String, URI> schemataURI;

	/**
	 * The default value of the '{@link #getLogger() <em>Logger</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getLogger()
	 * @generated not
	 * @ordered
	 */
	protected static final Logger LOGGER_EDEFAULT = Logger.getLogger(ToolSchemata.class);
	/**
	 * The cached value of the '{@link #getLogger() <em>Logger</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getLogger()
	 * @generated
	 * @ordered
	 */
	protected Logger logger = LOGGER_EDEFAULT;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected ToolSchemataImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return ToolPackage.Literals.TOOL_SCHEMATA;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EMap<String, Schema> getSchemata() {
		if (schemata == null) {
			schemata = new EcoreEMap<String,Schema>(MapsPackage.Literals.STRING_TO_SCHEMA_MAP, StringToSchemaMapImpl.class, this, ToolPackage.TOOL_SCHEMATA__SCHEMATA);
		}
		return schemata;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EMap<String, URI> getSchemataURI() {
		if (schemataURI == null) {
			schemataURI = new EcoreEMap<String,URI>(MapsPackage.Literals.STRING_TO_URI_MAP, StringToURIMapImpl.class, this, ToolPackage.TOOL_SCHEMATA__SCHEMATA_URI);
		}
		return schemataURI;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Logger getLogger() {
		return logger;
	}

	private SchemaFactory createSchemaFactory(final boolean isFromJar)
	{
		SchemaFactory schemaFactory = SchemaFactory.newInstance(XMLConstants.W3C_XML_SCHEMA_NS_URI);
		schemaFactory.setResourceResolver(new LSResourceResolver() {
			
			public LSInput resolveResource(String type, String namespaceURI,
			        String publicId, String systemId, String baseURI) {
				
				logger.debug("Resolve element type: Type="+type+" namespaceURI="+namespaceURI+
						" publicID="+publicId+" systemID="+ systemId+" baseURI="+baseURI);
				if (!getSchemata().containsKey(namespaceURI))
					logger.warn("no schema found for namespaceURI.");
				
				InputStream inputStream = null;
				try {
					inputStream = URIUtil.getInputStream(getSchemataURI().get(namespaceURI), isFromJar);	
				} catch (FileNotFoundException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
				return new Input(publicId, systemId, inputStream);
			}
		});
		return schemaFactory;
		
	}
	
	/**
	 * <!-- begin-user-doc -->
	 * create and store the schema given by URI xsdSource in schemata map. store the uri as well (schemataUri map).
	 * if the xsd document has a targetNamespace, it is used as a key otherwise the key is uri.toString()
	 * The idea is to have a schema and uri reference to all targetNamespaces to resolve them later on. 
	 * <!-- end-user-doc -->
	 * @generated not
	 */
	public Schema readSchema(URI xsdSource, boolean isFromJar) throws FileNotFoundException {
		
		InputStream inputStream = URIUtil.getInputStream(xsdSource, isFromJar);
		Source schemaSource = new StreamSource(inputStream);
		
		Document doc = XMLUtil.readXML(xsdSource, isFromJar);
		String targetNamespace = null;
		if (doc.getDocumentElement().hasAttribute("targetNamespace"))
			targetNamespace = doc.getDocumentElement().getAttribute("targetNamespace");
		
		SchemaFactory schemaFactory = createSchemaFactory(isFromJar);			
		Schema schema = null;
		try {
			schema = schemaFactory.newSchema(schemaSource);
			if (targetNamespace != null)
			{
				getSchemata().put(targetNamespace, schema);
				getSchemataURI().put(targetNamespace, xsdSource);
				logger.debug("add "+targetNamespace+" to known schemata. Use target namespace.");
			}
			else
			{
				getSchemata().put(xsdSource.toString(), schema);
				getSchemataURI().put(xsdSource.toString(), xsdSource);
				logger.debug("add "+xsdSource.toString()+" to known schemata.");
			}



		} catch (SAXException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return schema;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated not
	 */
	public Schema readSchemata(final EList<URI> xsdSources, boolean isFromJar) throws FileNotFoundException {

		Source[] sources = new StreamSource[xsdSources.size()];
		for (int i = 0; i < xsdSources.size(); i++)
		{
			InputStream inputStream = URIUtil.getInputStream(xsdSources.get(i), isFromJar);
			sources[i] = new StreamSource(inputStream);
			
		}
		
		return null;
		
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated not
	 */
	public Schema getDefaultSchema() {
		return getSchemata().isEmpty() ? null : getSchemata().get(0).getValue();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated not
	 */
	public Schema getSchemaFor(Document document) {
		if (!document.getDocumentElement().hasAttribute("xsi:schemaLocation"))
		{
			logger.warn("no schema location attribute found.");
			return null;
		}
		Attr attr = document.getDocumentElement().getAttributeNode("xsi:schemaLocation");

		String[] tmp = StringUtils.split(attr.getValue(), " ");
		if (getSchemata().containsKey(tmp[0]))
			return getSchemata().get(tmp[0]);
		logger.debug(tmp[0] + " " + tmp[1]);
		Schema schema = null;
		if (tmp.length >= 2)
			schema = getSchemaForKey(tmp[0], tmp[1]);
		else
			// String schemaLocKey = tmp.length == 1 ? tmp[0] : tmp[1];
			schema = getSchemaForKey(tmp[0]);
		if (schema != null)
			return schema;
		
		return null;
	}
	private Schema getSchemaForKey(String namespace, String fileName)
	{
		
		for (String key : getSchemata().keySet())
		{
			if (key.endsWith(fileName))
				return getSchemata().get(key);
		}
		return null;
	}
	
	private Schema getSchemaForKey(String schemaLocKey)
	{
		for (String key : getSchemata().keySet())
		{
			logger.debug(key+" vs "+schemaLocKey);
			if (key.endsWith(schemaLocKey))
				return getSchemata().get(key);
		}
		return null;
	}


	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case ToolPackage.TOOL_SCHEMATA__SCHEMATA:
				return ((InternalEList<?>)getSchemata()).basicRemove(otherEnd, msgs);
			case ToolPackage.TOOL_SCHEMATA__SCHEMATA_URI:
				return ((InternalEList<?>)getSchemataURI()).basicRemove(otherEnd, msgs);
		}
		return super.eInverseRemove(otherEnd, featureID, msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case ToolPackage.TOOL_SCHEMATA__SCHEMATA:
				if (coreType) return getSchemata();
				else return getSchemata().map();
			case ToolPackage.TOOL_SCHEMATA__SCHEMATA_URI:
				if (coreType) return getSchemataURI();
				else return getSchemataURI().map();
			case ToolPackage.TOOL_SCHEMATA__LOGGER:
				return getLogger();
		}
		return super.eGet(featureID, resolve, coreType);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void eSet(int featureID, Object newValue) {
		switch (featureID) {
			case ToolPackage.TOOL_SCHEMATA__SCHEMATA:
				((EStructuralFeature.Setting)getSchemata()).set(newValue);
				return;
			case ToolPackage.TOOL_SCHEMATA__SCHEMATA_URI:
				((EStructuralFeature.Setting)getSchemataURI()).set(newValue);
				return;
		}
		super.eSet(featureID, newValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void eUnset(int featureID) {
		switch (featureID) {
			case ToolPackage.TOOL_SCHEMATA__SCHEMATA:
				getSchemata().clear();
				return;
			case ToolPackage.TOOL_SCHEMATA__SCHEMATA_URI:
				getSchemataURI().clear();
				return;
		}
		super.eUnset(featureID);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public boolean eIsSet(int featureID) {
		switch (featureID) {
			case ToolPackage.TOOL_SCHEMATA__SCHEMATA:
				return schemata != null && !schemata.isEmpty();
			case ToolPackage.TOOL_SCHEMATA__SCHEMATA_URI:
				return schemataURI != null && !schemataURI.isEmpty();
			case ToolPackage.TOOL_SCHEMATA__LOGGER:
				return LOGGER_EDEFAULT == null ? logger != null : !LOGGER_EDEFAULT.equals(logger);
		}
		return super.eIsSet(featureID);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	@SuppressWarnings("unchecked")
	public Object eInvoke(int operationID, EList<?> arguments) throws InvocationTargetException {
		switch (operationID) {
			case ToolPackage.TOOL_SCHEMATA___READ_SCHEMA__URI_BOOLEAN:
				try {
					return readSchema((URI)arguments.get(0), (Boolean)arguments.get(1));
				}
				catch (Throwable throwable) {
					throw new InvocationTargetException(throwable);
				}
			case ToolPackage.TOOL_SCHEMATA___READ_SCHEMATA__ELIST_BOOLEAN:
				try {
					return readSchemata((EList<URI>)arguments.get(0), (Boolean)arguments.get(1));
				}
				catch (Throwable throwable) {
					throw new InvocationTargetException(throwable);
				}
			case ToolPackage.TOOL_SCHEMATA___GET_DEFAULT_SCHEMA:
				return getDefaultSchema();
			case ToolPackage.TOOL_SCHEMATA___GET_SCHEMA_FOR__DOCUMENT:
				return getSchemaFor((Document)arguments.get(0));
		}
		return super.eInvoke(operationID, arguments);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String toString() {
		if (eIsProxy()) return super.toString();

		StringBuffer result = new StringBuffer(super.toString());
		result.append(" (logger: ");
		result.append(logger);
		result.append(')');
		return result.toString();
	}
	
	
	
	private class Input implements LSInput {

		private String publicId;

		private String systemId;

		public String getPublicId() {
		    return publicId;
		}

		public void setPublicId(String publicId) {
		    this.publicId = publicId;
		}

		public String getBaseURI() {
		    return null;
		}

		public InputStream getByteStream() {
		    return null;
		}

		public boolean getCertifiedText() {
		    return false;
		}

		public Reader getCharacterStream() {
		    return null;
		}

		public String getEncoding() {
		    return null;
		}

		public String getStringData() {
		    synchronized (inputStream) {
		        try {
		            byte[] input = new byte[inputStream.available()];
		            inputStream.read(input);
		            String contents = new String(input);
		            return contents;
		        } catch (IOException e) {
		            e.printStackTrace();
		            System.out.println("Exception " + e);
		            return null;
		        }
		    }
		}

		public void setBaseURI(String baseURI) {
		}

		public void setByteStream(InputStream byteStream) {
		}

		public void setCertifiedText(boolean certifiedText) {
		}

		public void setCharacterStream(Reader characterStream) {
		}

		public void setEncoding(String encoding) {
		}

		public void setStringData(String stringData) {
		}

		public String getSystemId() {
		    return systemId;
		}

		public void setSystemId(String systemId) {
		    this.systemId = systemId;
		}

		public BufferedInputStream getInputStream() {
		    return inputStream;
		}

		public void setInputStream(BufferedInputStream inputStream) {
		    this.inputStream = inputStream;
		}

		private BufferedInputStream inputStream;

		public Input(String publicId, String sysId, InputStream input) {
		    this.publicId = publicId;
		    this.systemId = sysId;
		    this.inputStream = new BufferedInputStream(input);
		}
	}


} //ToolSchemataImpl
