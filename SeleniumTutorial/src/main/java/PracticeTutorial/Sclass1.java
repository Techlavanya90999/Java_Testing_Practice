package PracticeTutorial;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Sclass1 {

	public static void main(String[] args) throws InterruptedException {
		
                                            //open chrome browse
		WebDriver driver = new ChromeDriver();
		
		                                    //open url
		driver.get("https://www.facebook.com/");
		
		Thread.sleep(3000);
		
		                                   //navigate from one url to another
		driver.navigate().to("https://www.google.com/");
		                         
		Thread.sleep(3000);

		
		                                   //navigate back
		driver.navigate().back();
		
		Thread.sleep(3000);
		
		                                    //navigate forword to next page
		driver.navigate().forward();
		
		Thread.sleep(3000);

		                                      //refresh the browser
		driver.navigate().refresh();
		
		Thread.sleep(3000);

		
		                                      //maximize the browser
		driver.manage().window().maximize();
		
		Thread.sleep(3000);

		                                      //minimize the browser
		driver.manage().window().minimize();
		
		Thread.sleep(3000);

		
		                                      //fullscreen the window
		driver.manage().window().fullscreen();
		
		                                      //close the focused browser window
		driver.close();
		                                      //close all window
		driver.quit();
		
	}

}
