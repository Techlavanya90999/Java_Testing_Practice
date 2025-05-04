package Tutorial1;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Demo2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// step 1: open a chrome browser

				WebDriver driver = new ChromeDriver();
				//step 2: open a google url
				driver.get("https://www.google.com");
				
				//step 3: navigate from google url to amazon url
				
				driver.navigate().to("https://www.amazon.com");
				//navigate back to previous page (google url)

				driver.navigate().back();
				// navigate forward to next page or (amazon url)

					driver.navigate().forward();
					//refresh the browser

					driver.navigate().refresh();
					//minimize browser
					driver.manage().window().minimize();
					//maximize the browser
					driver.manage().window().maximize();
					//fullscreen the browser
					driver.manage().window().fullscreen();
					
					//close a focused window
					driver.close();
					//close all window which is open in current scripts

					driver.quit();

	}

}
