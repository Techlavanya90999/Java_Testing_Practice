package baselayer;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class baseclass {
protected static WebDriver driver;
@SuppressWarnings("deprecation")
public static void initialization()
{
	WebDriver driver = new ChromeDriver();
	 driver.manage().window().maximize();
	 driver.manage().timeouts().pageLoadTimeout(30,TimeUnit.SECONDS);
	 driver.manage().timeouts().implicitlyWait(30,TimeUnit.SECONDS);
	 driver.get("https://opensource-demo.orangehrmlive.com/web/index.php/auth/login");
	
}
}
