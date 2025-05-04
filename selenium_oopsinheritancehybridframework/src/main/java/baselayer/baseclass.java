package baselayer;

import java.time.Duration;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class baseclass {
//declare WebDriver globally protected static
	protected static WebDriver driver;
//static initialization mathod
	public static void initialization()
	{
//upcasting
WebDriver driver = new ChromeDriver();
//maximize 
driver.manage().window().maximize();
//pageload time out
driver.manage().timeouts().pageLoadTimeout(Duration.ofSeconds(30));
//implicitlyWait
driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
//delete all cookies
driver.manage().deleteAllCookies();
//open url
driver.get("https://edistrict.kerala.gov.in/registerPortalUser.do");

}
}
