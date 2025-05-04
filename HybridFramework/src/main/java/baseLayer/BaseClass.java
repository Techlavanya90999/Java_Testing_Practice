package baseLayer;

import java.time.Duration;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class BaseClass {
	protected static WebDriver driver;

	public static void intialization()
 {
driver = new ChromeDriver();
driver.manage().window().maximize();
driver.manage().timeouts().pageLoadTimeout(Duration.ofSeconds(30));
driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
driver.get("https://www.goibibo.com/");


	}

}
