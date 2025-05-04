package BaseLayer;

import java.io.IOException;
import java.time.Duration;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.edge.EdgeDriver;

import UtilityLayer.PropertiesClass;

public class BaseClass {
	
		private static ThreadLocal<WebDriver> td=new ThreadLocal<WebDriver>();
		public static WebDriver getDriver() {
			return td.get();
		}
		public static void intialization(String browsername) throws IOException {
			if(browsername.equalsIgnoreCase("chrome"))
			{
				WebDriver driver=new ChromeDriver();
				 td.set(driver);
			}
			else if(browsername.equalsIgnoreCase("edge"))
			{
				WebDriver driver=new EdgeDriver();
				 td.set(driver);
			}
			 else if(browsername.equalsIgnoreCase("incognito"))
			{
				ChromeOptions opt=new ChromeOptions();
				opt.addArguments("--incognito");
				WebDriver driver=new ChromeDriver(opt);
				 td.set(driver);
			}
			 else if (browsername.equalsIgnoreCase("headless"))
			{
				ChromeOptions opt=new ChromeOptions();
				opt.addArguments("--headless");
				WebDriver driver=new ChromeDriver(opt);
				 td.set(driver);
			}
			 else {
				System.out.println("choose valid browsername");
			}
			 getDriver().manage().window().maximize();
			 getDriver().manage().timeouts().pageLoadTimeout(Duration.ofSeconds(30));
			 getDriver().manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
			 getDriver().manage().deleteAllCookies();
			 getDriver().get(PropertiesClass.getProperty("SIT_URL"));
			
		}
	}



