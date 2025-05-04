package finalURIDemo1;

import java.io.IOException;
import java.net.HttpURLConnection;
import java.net.URL;
import java.net.URLConnection;

public class demo {
public static void main(String []args) throws IOException
{
	// Access url information by creating object of ulr class by passing actual url
	URL url = new URL ("https://www.faceboo0k.com/");
	
	//create connect to url using openconnection() method
	URLConnection urlcon = url.openConnection();
	
	//convert url connection into http url connection
	HttpURLConnection httpurl = (HttpURLConnection) urlcon;
	
	//connect to http url using connect()method
	httpurl.connect();
	
	//capture status code or response code
	int a = httpurl.getResponseCode();
	System.out.println(a);
	}
}
