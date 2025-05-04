package Tutorial1;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Assignment1 {
	public static void main (String []args) {
		//open chrome browser
		WebDriver driver = new ChromeDriver();
		//open a google url

		driver.get("https://www.google.com");
		//navigate to facebook url
		driver.navigate().to("https://www.facebook.com/");
		//maximize the browser
		driver.manage().window().maximize();
		//navigate to linkedin url
		driver.navigate().to("https://www.linkedin.com");
		//full the screen the browser
		driver.manage().window().fullscreen();
		//navigate to wikipedia url
		driver.navigate().to("https://www.wikipedia.org/");
		//navigate back
		driver.navigate().back();
		//refresh the browser
		driver.navigate().refresh();
		//navigate forward
		driver.navigate().forward();
		//close all window
        driver.close();
		
	}

}
