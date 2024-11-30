package utility;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Properties;

import org.testng.annotations.Test;

public class FileRead {
	
	
	@Test
	public static String propertiesFileRead(String path , String value)  {
		
		FileInputStream objm = null;
		try {
			objm = new FileInputStream(new File("./src/test/java/config/"+path+".properties"));
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		
		Properties propObj = new Properties();
		try {
			propObj.load(objm);
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return propObj.getProperty(value);
		
	}

}
