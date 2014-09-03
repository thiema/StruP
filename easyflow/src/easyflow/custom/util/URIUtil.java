package easyflow.custom.util;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.net.URI;
import java.net.URISyntaxException;
import java.net.URL;
import java.net.URLDecoder;
import java.util.ArrayList;
import java.util.Enumeration;
import java.util.HashSet;
import java.util.Set;
import java.util.jar.JarEntry;
import java.util.jar.JarFile;

import org.apache.commons.io.FilenameUtils;
import org.apache.log4j.Logger;

public class URIUtil {

	protected static final Logger logger = Logger.getLogger(URIUtil.class);
	
	
	public static boolean isFromJar(String pathToMain)
	{
		URL url = ClassLoader.getSystemResource(pathToMain);
		logger.debug(url.getProtocol());
		
		if (url.getProtocol().equalsIgnoreCase("file"))
			return false;
		else
			return true;
	}

	
	public static InputStream getInputStream(URI uri, boolean isFromJar) throws FileNotFoundException
	{
		InputStream inputStream;
		logger.debug("uri="+uri.toString()+" normalized path="+FilenameUtils.normalize(uri.getPath())+" fromJar="+isFromJar);
		if (isFromJar)
			inputStream = URIUtil.class.getResourceAsStream(FilenameUtils.normalize(uri.getPath()));
		else
			inputStream = new FileInputStream(new File(uri.getPath()));
		return inputStream;
		
	}
	
	public static InputStreamReader getInputStreamReader(URI uri, boolean isFromJar) throws FileNotFoundException
	{
		InputStreamReader isReader;
		
		logger.debug("uri="+uri.toString()+" normalized path="+FilenameUtils.normalize(uri.getPath())+" fromJar="+isFromJar);
		if (isFromJar)
		{			
			isReader = new InputStreamReader(URIUtil.class.getResourceAsStream(FilenameUtils.normalize(uri.getPath())));
		}
		else
		{
			isReader = new FileReader(uri.getPath());
		}
		return isReader;
	}
	
	static void testFileLookup() 
	{
		Enumeration<URL> en;
		try {
			en = URIUtil.class.getClassLoader().getResources("META-INF");
		if (en.hasMoreElements()) {
		    URL metaInf=en.nextElement();
		    File fileMetaInf;
			try {
				logger.debug(metaInf.toURI());
				//fileMetaInf = new File(metaInf.toURI());
			

		    //File[] files=fileMetaInf.listFiles();
		    //or 
		    //String[] filenames=fileMetaInf.list();
		    //logger.debug("filenames="+filenames);
			} catch (URISyntaxException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

		}
	
	 /**
	   * List directory contents for a resource folder. Not recursive.
	   * This is basically a brute-force implementation.
	   * Works for regular files and also JARs.
	   * 
	   * @author Greg Briggs
	   * @param clazz Any java class that lives in the same place as the resources you want.
	   * @param path Should end with "/", but not start with one.
	   * @return Just the name of each member item, not the full paths.
	   * @throws URISyntaxException 
	   * @throws IOException 
	   */
	  static String[] getResourceListing(Class clazz, String path) throws URISyntaxException, IOException {
		  
		  
	      URL dirURL = clazz.getClassLoader().getResource(path);
	      
	      logger.debug(dirURL+" "+clazz.getResourceAsStream(path));
	      if (dirURL != null && dirURL.getProtocol().equals("file")) {
	        /* A file path: easy enough */
	        return new File(dirURL.toURI()).list();
	      } 

	      if (dirURL == null) {
	        /* 
	         * In case of a jar file, we can't actually find a directory.
	         * Have to assume the same jar as clazz.
	         */
	        String me = clazz.getName().replace(".", "/")+".class";
	        logger.debug("load resource="+me);
	        dirURL = URIUtil.class.getClassLoader().getResource("./easyflow.jar");
	        //dirURL = clazz.getClassLoader().getResource(me);
	      }
	      logger.debug(dirURL);
	      if (dirURL.getProtocol().equals("jar")) {
	        /* A JAR path */
	        String jarPath = dirURL.getPath().substring(5, dirURL.getPath().indexOf("!")); //strip out only the JAR file
	        logger.debug(jarPath);
	        JarFile jar = new JarFile(URLDecoder.decode(jarPath, "UTF-8"));
	        Enumeration<JarEntry> entries = jar.entries(); //gives ALL entries in jar
	        Set<String> result = new HashSet<String>(); //avoid duplicates in case it is a subdirectory
	        while(entries.hasMoreElements()) {
	          String name = entries.nextElement().getName();
	          if (name.startsWith(path)) { //filter according to the path
	            String entry = name.substring(path.length());
	            int checkSubdir = entry.indexOf("/");
	            if (checkSubdir >= 0) {
	              // if it is a subdirectory, we just return the directory name
	              entry = entry.substring(0, checkSubdir);
	            }
	            result.add(entry);
	          }
	        }
	        return result.toArray(new String[result.size()]);
	      } 
	        
	      throw new UnsupportedOperationException("Cannot list files for URL "+dirURL);
	  }
	
	public static URI createURI(String basePath, String fileName) throws URISyntaxException
	{
		logger.trace("create uri: "+basePath+" "+fileName);
		return new URI(fileName == null ?
								basePath :
								new File(basePath +"/" +fileName).getPath());
	}
	
	public static String createPath(String basePath, String fileName)
	{
		logger.trace("create path: "+basePath+" "+fileName);
		if (basePath == null)
			return fileName;
		
		return fileName == null ?
								basePath :
								new File(basePath +"/" +fileName).getPath();
	}
	
	public static URI getDirnameUri(URI uri) throws URISyntaxException
	{
		//logger.trace("create dirname with uri: uri="+uri.toString()+" dirname="+getDirname(uri));
		return new URI(uri.getScheme(), uri.getHost(), 
				getDirname(uri), 
				uri.getFragment());
	}
	
	public static String getDirname(URI uri)
	{
		return getDirname(uri.getPath());
	}
	
	public static boolean isDirectory(URI uri)
	{
		File file = new File(uri.getPath());
		logger.debug("determine file type from file="+file.toString()+" "+file.isDirectory()+" "+file.listFiles());
		return file.isDirectory();
	}
	
	public static String getDirname(String path)
	{
		File file = new File(path);
		//file = file.getAbsoluteFile();
		if (file.isDirectory())
			return path;
		else
		{
			logger.debug(file.getAbsolutePath()+" "+file.getParent());
			return file.getParent();
		}
	}
	
	public static String getFilename(String path)
	{
		File file = new File(path);
		if (file.isFile())
			return file.getName();
		else return null;
	}
	public static Set<URI> getSources(URI uri, boolean isFromJar)
	{
		Set<URI> sources=new HashSet<URI>();
		if (isFromJar)
			try {
				logger.debug("Not yet implemented, to pick multiple resources from jar.");
				throw new IOException();
				//testFileLookup();
				//logger.debug(getResourceListing(URIUtil.class, "dummy").length);
			//} catch (URISyntaxException e) {
				// TODO Auto-generated catch block
				//e.printStackTrace();
			} catch (IOException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		else
			if (isDirectory(uri))
			{
				logger.debug("foudn directory="+uri.toString());
				File folder=new File(getDirname(uri));
				for (File file:folder.listFiles())
				{
					logger.debug("check file="+file.getPath()+" "+file.getAbsolutePath());
					if (file.isFile())
					{
						sources.add(file.toURI());
					}
				}
			}
			else
			{
				logger.debug("foudn file="+uri.toString());
				sources.add(uri);
			}
		return sources;
			
	}
	
	public static URI addToURI(URI uri, String name) throws URISyntaxException
	{
		
		String path = createPath(uri.getPath(), name);
		return new URI(uri.getScheme(), uri.getHost(), path, uri.getFragment());
	}
	public static URI addExtensionToURI(URI uri, String ext, boolean replace) throws URISyntaxException
	{
		String str = uri.getPath();
		//path.replaceFirst("[.][^.]+$", ext);
		if (replace)
		{
			int pos = str.lastIndexOf(".");
	        // If there wasn't any '.' just return the string as is.
	        if (pos != -1) 
	        str = str.substring(0, pos);
		}

		
		str+="."+ext.toLowerCase();
		return new URI(uri.getScheme(), uri.getHost(), str, uri.getFragment());
	}
	
	public static URI addPathToUri(String path, URI uri) throws URISyntaxException
	{
		if (path != null && !path.isEmpty())
			return new URI(uri.getScheme(), uri.getHost(), createPath(path, uri.getPath()), uri.getFragment());
		else
			return uri;
	}
}
