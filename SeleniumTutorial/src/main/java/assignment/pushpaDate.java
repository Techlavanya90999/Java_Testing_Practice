package assignment;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class pushpaDate {

	public static void main(String[] args) {
//open chrome browser
		WebDriver driver =new ChromeDriver();	
		
//open url
		driver.get("https://www.google.com/search?q=Pushpa%3A+The+Rise&rlz=1C1VDKB_enIN1016IN1016&sourceid=chrome&ie=UTF-8");	
		
//maximize the url
	driver.manage().window().maximize();
	
//add page load time outs
	driver.manage().timeouts().pageLoadTimeout(Duration.ofSeconds(30));

//add implicitly wait
	driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
	
//capture current window id number
	String parentId = driver.getWindowHandle();
	
	
//find element pushpa the rise and click on it
	WebElement pushpaWikipedia=driver.findElement(By.xpath("//h3[text()='Pushpa: The Rise']"));
	pushpaWikipedia.click();

//find element release date1
	WebElement releasedate1 =driver.findElement(By.xpath("//div[@class='plainlist film-date']"));
	String date1 = releasedate1.getText();
	System.out.println(date1);

	
	driver.navigate().back();

	//find element release date
		WebElement releasedate2 =driver.findElement(By.xpath("	//span[text()='Release date']/following-sibling::span/child::span"));
		String date2 = releasedate2.getText();
		System.out.println(date2);

		if(date2.contains(date1)) {
			System.out.println("Test case is Pass");
			
		}else {
			System.out.println("Test case is Fail");
		}
		driver.quit();

	
	
	
	}

}
