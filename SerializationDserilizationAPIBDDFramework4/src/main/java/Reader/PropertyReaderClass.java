package Reader;

import java.util.Properties;

import io.restassured.internal.support.FileReader;

public class PropertyReaderClass {
public static String getProperty(String keyName) {
String path = System.getProperty("user.dir")+"/src/main/resources/ConfigurationLayer/config.properties";
Properties prop = new Properties();
try {
	FileReader file = new FileReader(path);
	prop.load(file);
}

catch(Exception e){
	e.printStackTrace();
}
return prop.getProperty(keyName);
}
}
