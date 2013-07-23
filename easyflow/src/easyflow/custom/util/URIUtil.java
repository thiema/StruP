package easyflow.custom.util;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.net.URI;
import java.net.URISyntaxException;

import org.apache.log4j.Logger;

public class URIUtil {

	protected static final Logger logger = Logger.getLogger(URIUtil.class);
	
	public static InputStream getInputStream(URI uri, boolean isFromJar) throws FileNotFoundException
	{
		InputStream inputStream;
		if (isFromJar)
			inputStream = URIUtil.class.getResourceAsStream(uri.toString());
		else
			inputStream = new FileInputStream(new File(uri.toString()));
		
		return inputStream;
		
	}
	
	public static InputStreamReader getInputStreamReader(URI uri, boolean isFromJar) throws FileNotFoundException
	{
		InputStreamReader isReader; 
		if (isFromJar)
		{			
			isReader = new InputStreamReader(URIUtil.class.getResourceAsStream(uri.toString()));
		}
		else
		{
			isReader = new FileReader(uri.toString());
		}
		return isReader;
	}
	
	public static URI createURI(String basePath, String fileName) throws URISyntaxException
	{
		logger.trace("crate uri: "+basePath+" "+fileName);
		return new URI(fileName == null ?
								basePath :
								new File(basePath +"/" +fileName).getPath());
	}
	
	public static String createPath(String basePath, String fileName)
	{
		logger.trace("crate path: "+basePath+" "+fileName);
		return fileName == null ?
								basePath :
								new File(basePath +"/" +fileName).getPath();
	}
	
	public static String getBasename(String path)
	{
		File file = new File(path);
		if (file.isDirectory())
			return path;
		else 
			return file.getParent();
	}
	
	public static String getFilename(String path)
	{
		File file = new File(path);
		if (file.isFile())
			return file.getName();
		else return null;
	}
	
	public static URI addToURI(URI uri, String name) throws URISyntaxException
	{
		
		String path = createPath(uri.getPath(), name);
		return new URI(uri.getScheme(), uri.getHost(), path, uri.getFragment());
	}
}
