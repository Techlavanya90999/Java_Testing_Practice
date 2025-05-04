package finalURIDemo1;

import java.io.IOException;
import java.net.HttpURLConnection;
import java.net.URL;
import java.net.URLConnection;

public class class07 {
	public static void main(String []args) throws IOException {
//Access the URL information by creating object of URL class by passing actual url
URL url = new URL ("https://www.google.com/");
//create connection to url using open connection()method
URLConnection urlcon = url.openConnection();
//convert url connection itno http url connection to hit different http
//request or downcasting
HttpURLConnection httpurl = (HttpURLConnection) urlcon;
//connect http url using connect() method
httpurl.connect();
//capture status code or response code
int a = httpurl.getResponseCode();
System.out.println(a);
	}
	
}
 