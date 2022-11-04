package genericUtilities;

import java.io.FileInputStream;
import java.io.IOException;
import java.util.Properties;

public class FileUtility {
	public String getPropertyData(String key) throws IOException 
	{
		FileInputStream file = new FileInputStream("./src/test/resources/testProperties.txt");
		Properties prop = new Properties();
		prop.load(file);
		String value = prop.getProperty(key);
		return value;

	}

}
