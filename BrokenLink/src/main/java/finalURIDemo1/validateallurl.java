package finalURIDemo1;
import java.io.IOException;
import java.net.HttpURLConnection;
import java.net.URL;
import java.net.URLConnection;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
public class validateallurl {
public static void main(String []args) throws IOException
{
//step 1: Up casting
		WebDriver driver = new ChromeDriver();

		// step 2: open a url
		driver.get("https://www.flipkart.com");

		//step 3: find all link
		List<WebElement> list =driver.findElements(By.xpath("//a"));
		int totalLink = list.size();
		int invalidLink = 0;
		int validLink = 0;
		
		
		//step 4: iterate all list
		
		for(WebElement wb: list)
		{
			//step 5: capture actual url usin getAttribute() method
			String actualUrl = wb.getAttribute("href");
			
			//step 6:create object of URL class by passing actual URL
			//URL class is used to access the information about the URL
			
			URL url =new URL(actualUrl);
			
			
			///step 7: create connection using openConnection() method
			URLConnection urlcon = url.openConnection();
			
			//step 8: convert URLConnection into HttpURLConnection using down casting
			HttpURLConnection httpurl = (HttpURLConnection)urlcon;
			
			
			//step 9:connect to HTTP URL
			httpurl.connect();
			
			//step 10: capture response code using getResponseCode();
			
			int statusCode = httpurl.getResponseCode();
			
			
			//step 11: check link is valid or broken or invalid
			if(statusCode<400)
			{
				System.out.println("Link is valid "+actualUrl);
				validLink++;
			}
			else
			{
				System.err.println("Link is broken or invalid "+actualUrl);
				invalidLink++;
			}

	}
	System.out.println(totalLink);
	System.out.println(validLink);
	System.out.println(invalidLink);
}
}
