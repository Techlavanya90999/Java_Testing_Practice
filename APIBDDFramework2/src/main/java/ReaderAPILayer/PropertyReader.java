package ReaderAPILayer;

import java.io.FileReader;
import java.util.Properties;

public class PropertyReader {

	public static String getProperty(String keyName) throws Exception {

		Properties prop = new Properties();
		String path = System.getProperty("user.dir") + "//src//main//resources//config.properties";

		FileReader file = new FileReader(path);
		prop.load(file);

		return prop.getProperty(keyName);
	}

}

