package easyflow.custom.util;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.ArrayList;

import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Map.Entry;

import javax.xml.parsers.DocumentBuilder;
import javax.xml.parsers.DocumentBuilderFactory;
import javax.xml.parsers.ParserConfigurationException;
import javax.xml.transform.stream.StreamSource;
import javax.xml.validation.Schema;
import javax.xml.validation.Validator;

import org.apache.log4j.Logger;
import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.common.util.EMap;
import org.eclipse.emf.common.util.URI;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EObject;


import org.eclipse.emf.ecore.EStructuralFeature;

import org.eclipse.emf.ecore.resource.Resource;
import org.eclipse.emf.ecore.resource.ResourceSet;
import org.eclipse.emf.ecore.resource.impl.ResourceSetImpl;
import org.eclipse.emf.ecore.util.BasicExtendedMetaData;
import org.eclipse.emf.ecore.util.EcoreUtil;
import org.eclipse.emf.ecore.util.ExtendedMetaData;
import org.eclipse.emf.ecore.util.FeatureMap;
import org.eclipse.emf.ecore.util.FeatureMapUtil;
import org.eclipse.emf.ecore.xmi.XMLResource;

import org.eclipse.emf.ecore.xmi.impl.GenericXMLResourceFactoryImpl;
import org.eclipse.emf.ecore.xmi.impl.XMIResourceFactoryImpl;
import org.eclipse.emf.ecore.xml.type.AnyType;
import org.eclipse.emf.ecore.xml.type.XMLTypeFactory;

import org.w3c.dom.Document;
import org.w3c.dom.Element;
import org.w3c.dom.Node;
import org.w3c.dom.NodeList;
import org.xml.sax.SAXException;

import easyflow.EasyflowPackage;
import easyflow.core.CorePackage;

import easyflow.core.Task;

import easyflow.custom.jgraphx.editor.EasyFlowGraph;
import easyflow.tool.Data;
import easyflow.tool.DataPort;
import easyflow.tool.Parameter;
import easyflow.tool.Tool;
import easyflow.traversal.TraversalChunk;
import easyflow.traversal.TraversalEvent;



import com.mxgraph.model.mxICell;
import com.mxgraph.model.mxCell;
import com.mxgraph.view.mxGraph;


public class XMLUtil {
	
	//final static String SCHEMA_LOCATION="/usr/home/heinz/workspace/easyflow/easyflow/model/easyflow.core.xsd";
	public final static Map<String, Object> container=new HashMap<String, Object>();
	protected static final Logger logger = Logger.getLogger(XMLUtil.class);
	protected static final DocumentBuilderFactory dbFactory = DocumentBuilderFactory.newInstance();
	
	public static Object[] parseElementToArray(Element el) {
		Object[] data=new Object[5];
		NodeList nodes = el.getChildNodes();
		for(int i=0; i<data.length&&i<nodes.getLength(); i++){
			Node node = nodes.item(i);

			if(node instanceof Element){
			    data[i]=getTextFromFirstNode(node);
			 }
		}	
		return data;
	}
	

	public static String parseElementToString(Element el) {
		NodeList nodes = el.getChildNodes();
		String s="";
		for(int i=0; i<nodes.getLength(); i++){
			Node node = nodes.item(i);

			if(node instanceof Element){
				String tmp=getTextFromFirstNode(node);
				if (tmp!=null) {
				    s+=node.getNodeName()+" "+tmp+"\n";					
				}

			 }
		}	
		return s;
	}
	
	public static Map<String,List<String>> parseElementToMap(Element el) {
		NodeList nodes = el.getChildNodes();
		Map<String,List<String>> map=new HashMap<String,List<String>>();
		for(int i=0; i<nodes.getLength(); i++){
			Node node = nodes.item(i);

			if(node instanceof Element){
				String tmp=getTextFromFirstNode(node);
				if (tmp!=null) {
					List<String> curList=null;
					if (map.containsKey(node.getNodeName()))
						curList=map.get(node.getNodeName());
					else {
						curList=new ArrayList<String>();
						map.put(node.getNodeName(), curList);						
					}
					curList.add(tmp);

				}

			 }
		}

		return map;
	}

	

	public static String getTextFromFirstNode(Node node) {
		String text=null;
		NodeList nodes = node.getChildNodes();
		for(int i=0; i<nodes.getLength(); i++){
			Node curNode = nodes.item(i);
			return curNode.getNodeValue();
		}
		return text;
	}

	public static void printMxCell(mxICell cell)
	{
		printXMLElement((Element)((mxCell)cell).getValue());
	}
	
	public static void printXMLTextNode(Node node) {
		NodeList nodes = node.getChildNodes();
		for(int i=0; i<nodes.getLength(); i++){
			Node curNode = nodes.item(i);
			System.out.println(curNode.getNodeValue());
			//curNode.setNodeValue("testSetDummy");

		}		
	}
	public static void printXMLElement(Element el) {
		NodeList nodes = el.getChildNodes();
		for(int i=0; i<nodes.getLength(); i++){
			Node node = nodes.item(i);

			if(node instanceof Element){
				//a child element to process
			    Element child = (Element) node;
			    String attribute = child.getAttribute("width");
			    System.out.println(node
			    		+" "+node.getNodeName()
			    		+" "+node.getNodeValue()
			    		+" "+node.getChildNodes().getLength());
			    printXMLTextNode(node);
			    //printXMLElement(el);
			 //} else if (node instanceof Node) {
				// System.out.println(node.getTextContent());
			 }
			
		}
		
		/*
		System.out.println(doc+" "+el+" "+resource+" "+resourceSet);
		System.out.println("nodename: "+el.getNodeName()+" (NS: "+EasyflowPackage.eNS_PREFIX+") "+
				"tagname: "+el.getTagName()+" "+
				"attrib name: "+el.getAttribute("name")+
				"child elems: "+el.getChildNodes()+
				"some elements: "+
				doc.getElementsByTagName("dataFormatIn").item(0).getNodeName()+" "+
				doc.getElementsByTagName("dataFormatIn").item(0).getFirstChild()+" "+
				doc.getElementsByTagName("tool").getLength()+" "+
				doc.getElementsByTagName("sortOrder"));
		*/
		
	}
	
	public static Element getElementAnyType(Task task) {
		ResourceSet resourceSet = new ResourceSetImpl();
		
		final ExtendedMetaData extendedMetaData =
			     new BasicExtendedMetaData(resourceSet.getPackageRegistry());
			  resourceSet.getLoadOptions().put
			    (XMLResource.OPTION_EXTENDED_META_DATA, extendedMetaData);
		
		EStructuralFeature rootNodeFeature = 
			    extendedMetaData.demandFeature(EasyflowPackage.eNS_URI, "rootNode", true);
		EClass documentRootClass = rootNodeFeature.getEContainingClass();
		EObject documentRoot = EcoreUtil.create(documentRootClass);
		EMap xmlnsPrefixMap = 
			    (EMap)documentRoot.eGet
			      (extendedMetaData.getXMLNSPrefixMapFeature(documentRootClass));
			  xmlnsPrefixMap.put(EasyflowPackage.eNS_PREFIX, EasyflowPackage.eNS_URI);

		AnyType rootTreeNode = XMLTypeFactory.eINSTANCE.createAnyType();
		documentRoot.eSet(rootNodeFeature, rootTreeNode);
		
		EStructuralFeature labelAttribute = extendedMetaData.demandFeature(null, "label", false);
		rootTreeNode.eSet(labelAttribute, "root");
		
		FeatureMap rootMixed = rootTreeNode.getMixed();
		
		EStructuralFeature childNodeFeature = 
				   extendedMetaData.demandFeature(EasyflowPackage.eNS_URI, "childNode", true);
		AnyType textChildTreeNode = XMLTypeFactory.eINSTANCE.createAnyType();
		FeatureMapUtil.addText(rootMixed, "n ");
		rootMixed.add(childNodeFeature, textChildTreeNode);
		textChildTreeNode.eSet(labelAttribute, "text");
		FeatureMapUtil.addText(textChildTreeNode.getMixed(), "text");
		
		//FeatureMapUtil.addText(featureMap, text);
		
		/*To serialize the instance, we register an appropriate default resource factory. Here we choose to use GenericXMLResourceFactoryImpl which already sets the options needed to process any XML document. After registering the resource factory, we need to create a resource to hold our instance, add the instance to the resource, and save it.
		 * 
		 */

		resourceSet.getResourceFactoryRegistry().getExtensionToFactoryMap().put
		    (Resource.Factory.Registry.DEFAULT_EXTENSION, 
		     new GenericXMLResourceFactoryImpl());
		    
		Resource resource = 
		    resourceSet.createResource(URI.createFileURI("DATA_FOLDER" + "EMFDOMTreeNode.xml"));
		  resource.getContents().add(documentRoot);
		  try {
			resource.save(System.out, null);
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

		Document doc=((XMLResource)resource).save(null, null, null);
		
		Element el=doc.getDocumentElement();
		return el;
		
	}
	private static Map getOptions() {
		Map<String, Object> options = new HashMap<String, Object>();
		options.put(XMLResource.OPTION_LAX_FEATURE_PROCESSING, true);
		return options;
	}
	
	public static Element getElement(Task task) {
		
		//task.setFullName(task.getUniqueString());
		//logger.debug("XMLUtil(): "+task);
		ResourceSet resourceSet = new ResourceSetImpl();
		resourceSet.getResourceFactoryRegistry().getExtensionToFactoryMap().put
			(Resource.Factory.Registry.DEFAULT_EXTENSION, new XMIResourceFactoryImpl());

		// Register the package to ensure it is available during loading.
		resourceSet.getPackageRegistry().put
			(CorePackage.eNS_URI, 
			 CorePackage.eINSTANCE);
		Resource resource = resourceSet.createResource(URI.createURI(new File("document.xml").getAbsolutePath()));
		
		resource.getContents().add(task);
		//EcoreUtil.resolveAll(resource);
		if (!task.isRoot())
		{
		resource.getContents().addAll(task.getTools().values());
		resource.getContents().addAll(task.getTraversalEvents().values());
		resource.getContents().addAll(task.getInDataPorts());
		resource.getContents().addAll(task.getOutDataPorts());
		resource.getContents().addAll(task.getToolMatches().values());
		for (EList<TraversalChunk> chunks : task.getChunks().values())
			resource.getContents().addAll(chunks);
		//resource.getContents().addAll(task.getChunks().values());
		Iterator<DataPort> it=task.getInDataPorts().iterator();
		while (it.hasNext()) {
			DataPort dataPort = it.next();
			resource.getContents().addAll(dataPort.getGroupingCriteria());
			resource.getContents().addAll(dataPort.getDataFormats().values());
			
		}
		it=task.getOutDataPorts().iterator();
		while (it.hasNext()) {
			DataPort dataPort = it.next();
			resource.getContents().addAll(dataPort.getGroupingCriteria());
			resource.getContents().addAll(dataPort.getDataFormats().values());
		}
		Iterator<TraversalEvent> it1=task.getTraversalEvents().values().iterator();
		
		while (it1.hasNext()) {
			TraversalEvent traversalEvent=it1.next();
			//traversalEvent.setMetaData(null);
			if (traversalEvent.getTraversalCriterion()!=null)
			{
				resource.getContents().add(traversalEvent.getTraversalCriterion());
				if (traversalEvent.getTraversalCriterion().getOperation()!=null)
				{
					resource.getContents().add(traversalEvent.getTraversalCriterion().getOperation());
					//logger.debug(traversalEvent.getTraversalCriterion().getOperation());
				}
				if (traversalEvent.getTraversalCriterion().getChunks()!=null)
					resource.getContents().addAll(traversalEvent.getTraversalCriterion().getChunks().values());
				/*if (traversalEvent.getMetaData()!=null) {
					resource.getContents().add(traversalEvent.getMetaData());
					for (EReference eReference:traversalEvent.getMetaData().eClass().getEReferences()) {
						resource.getContents().addAll((Collection<? extends EObject>) ((EMap<String, Object>)eReference).values());
					}
				}*/
			}
		}
		Iterator<Tool> it2=task.getTools().values().iterator();
		while (it2.hasNext())
		{
			Tool tool = it2.next();
			if (tool.getCommand() != null)
			{
				if (tool.getCommand().getParameters() != null)
				{
					resource.getContents().addAll(tool.getCommand().getParameters().values());
					for (Parameter param:tool.getCommand().getParameters().values())
					{
						if (param.getKeys()!=null)
							resource.getContents().addAll(param.getKeys());
					}
				}
				
			}
			if (tool.getRequirements()!=null)
				resource.getContents().addAll(tool.getRequirements());
			if (tool.getPackage() != null)
				resource.getContents().add(tool.getPackage());
			for (Data data:tool.getData().values())
			{
				resource.getContents().add(data);
				resource.getContents().add(data.getPort());
				resource.getContents().addAll(data.getPort().getDataFormats().values());
				
			}
			
		}
			
		}
		//EcoreUtil.resolveAll(resource);
		
		//options.put(XMLResource.OPTION_SCHEMA_LOCATION, Boolean.TRUE);
		//options.put(XMLResource.OPTION_EXTENDED_META_DATA, Boolean.TRUE);
		//options.put(XMLResource.OPTION_XML_MAP, );
		/*
		options.put(XMLResource.OPTION_EXTENDED_META_DATA, Boolean.TRUE);
		options.put(XMLResource.OPTION_KEEP_DEFAULT_CONTENT, Boolean.TRUE);
		options.put(XMLResource.OPTION_ENCODING, "UTF-8");*/
		//logger.debug(new SDOFactoryImpl().getSDOPackage());
		//options.put("OPTION_ANY_TYPE", new SDOFactoryImpl().getSDOPackage().getEDataObjectAnyType());
		
		Document doc=((XMLResource)resource).save(null, getOptions(), null);
		
/*		
		ResourceSet resourceSet1 = new ResourceSetImpl();
		resourceSet1.getResourceFactoryRegistry().getExtensionToFactoryMap().put
		(Resource.Factory.Registry.DEFAULT_EXTENSION, 
		 new XMIResourceFactoryImpl());

		// Register the package to ensure it is available during loading.
		resourceSet1.getPackageRegistry().put
			(CorePackage.eNS_URI, 
			 CorePackage.eINSTANCE);
		Resource resource1 = resourceSet1.createResource(URI.createURI(new File("document.xml").getAbsolutePath()));

		try {
			((XMLResource) resource1).load(doc, null);
			return doc.getDocumentElement();
			//System.out.println(resource1.getContents().size()+" ("+resource.getContents().size()+")");
		} catch (IOException e1) {
			// TODO Auto-generated catch block
			e1.printStackTrace();
		}
		*/
		Element el=doc.getDocumentElement();
		
		//XMLUtil.printXMLElement(el);
/*		
		logger.debug("saveXML()");
		try {
			//resource.save(System.out, options);
			((XMLResource)resource).save(System.out, getOptions());
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
*/	
		//logger.debug(el);
		return el;
		//return doc;
	}

	public static Task loadTaskFromVertex(Object mxcell) {
		return loadTaskFromElement((Element) ((mxICell)mxcell).getValue());
	}

	public static Task loadTaskFromValue(Object value) {
		return loadTaskFromElement((Element) value);
	}


	public static Task loadTaskFromElement(Element element) {
		if (element == null)
			return null;
		ResourceSet resourceSet = new ResourceSetImpl();
		
		/*
	    final ExtendedMetaData extendedMetaData = new BasicExtendedMetaData(resourceSet.getPackageRegistry());
	    resourceSet.getLoadOptions().put(XMLResource.OPTION_EXTENDED_META_DATA, extendedMetaData);
	    resourceSet.getResourceFactoryRegistry().getExtensionToFactoryMap().put
	      (Resource.Factory.Registry.DEFAULT_EXTENSION, 
	       new GenericXMLResourceFactoryImpl());
	    //Resource resource=new EcoreResourceFactoryImpl().createResource(URI.createFileURI(SCHEMA_LOCATION));
	     */
		// Create a resource set to hold the resources.
		
		// Register the appropriate resource factory to handle all file extensions.
		resourceSet.getResourceFactoryRegistry().getExtensionToFactoryMap().put
				(Resource.Factory.Registry.DEFAULT_EXTENSION, 
				 new XMIResourceFactoryImpl());

		// Register the package to ensure it is available during loading.
		resourceSet.getPackageRegistry().put
					(CorePackage.eNS_URI, 
					 CorePackage.eINSTANCE);
		Resource resource = resourceSet.createResource(
				URI.createFileURI(new File("document.xml").getAbsolutePath()));
		Map<String, Object> options = new HashMap<String, Object>();
		
		try {
			((XMLResource) resource).load(element, options);
		} catch (IOException e1) {
			// TODO Auto-generated catch block
			e1.printStackTrace();
		}
		/*
		try {
			logger.debug("loadXML()");
			((XMLResource)resource).save(System.out, getOptions());
		} catch (IOException e1) {
			// TODO Auto-generated catch block
			e1.printStackTrace();
		}
		*/
		//for (EObject eobject:resource.getContents()) {
			//System.out.println(eobject.getClass().getCanonicalName());			
		//}

		Task task=(Task) resource.getContents().get(0);
		//System.out.println(task.getUniqueString()+" "+task+" ");
		//if (((EMap<String,Task>)container.get("tasks")).get(task.getUniqueString())==null) {
			//logger.debug(task.getUniqueString()+" "+((EMap<String,Task>)container.get("tasks")).keySet());
		//}
		
		//if (((EMap<String,Task>)container.get("tasks")).containsKey(task.getUniqueString()))
		String tmp = task.getUniqueString();

		
		//logger.debug(tmp+" "+task.getChunks().keySet()+" in: "+((EMap<String,Task>)container.get("tasks")).keySet());
		if (container.get("tasks") != null)
			task=((EMap<String,Task>)container.get("tasks")).get(task.getUniqueString());
		if (task == null) 
			logger.warn("XMLUtil(): return null for "+tmp);
		return task;
	}
	
	public static void testMxGraphXML(mxGraph mxgraph, Object firstNode) {
		mxICell cell=(mxICell) firstNode;
		System.out.println(cell+" "+loadTaskFromElement((Element) cell.getValue()));
		//mxgraph.traverse(mxgraph, directed, visitor)
		
	}
	
	public static Document readXML(java.net.URI xmlSource, boolean isFromJar)
	{
		
		try {
			DocumentBuilder dBuilder = dbFactory.newDocumentBuilder();
			Document doc = dBuilder.parse(URIUtil.getInputStream(xmlSource,
					isFromJar));
			return doc;
		} catch (ParserConfigurationException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (SAXException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return null;
		
	}
	
	public static void validateXML(java.net.URI xmlSource, Schema schema, boolean isFromJar) throws FileNotFoundException, SAXException, IOException
	{
		Validator validator = schema.newValidator();
		validator.validate(new StreamSource(URIUtil.getInputStream(xmlSource, isFromJar)));
	}
}
