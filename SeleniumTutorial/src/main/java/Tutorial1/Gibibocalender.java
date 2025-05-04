package Tutorial1;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Gibibocalender {

	public static void main(String[] args) {
     WebDriver driver = new ChromeDriver();
     
     driver.get("https://www.goibibo.com/");
     
     //maximize the url
     driver.manage().window().maximize();
     
     ////add pageTimeout
     
     

	}

}
