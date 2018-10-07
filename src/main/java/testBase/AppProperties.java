package testBase;

import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStream;
import java.util.Properties;

public class AppProperties {
	public String getProperty(String key) {
		Properties property = new Properties();
		FileInputStream  input = null;
		
		try {
			input =new FileInputStream ("application.properties");
			property.load(input);
			return property.getProperty(key);
		}
		catch(IOException ex) {
			ex.printStackTrace();
			return null;
		}
		finally {
			if(input != null) {
				try {
					input.close();
				}
				catch(IOException ex) {
					ex.printStackTrace();
				}
			}
		}
	}
}
