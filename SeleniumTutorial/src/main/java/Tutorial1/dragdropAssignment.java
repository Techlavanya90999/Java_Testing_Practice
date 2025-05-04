package Tutorial1;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class dragdropAssignment {

	public static void main(String[] args) throws InterruptedException {
//open Browser chrome
		WebDriver driver = new ChromeDriver();
		
		//open Url
		driver.get("http://www.dhtmlgoodies.com/scripts/drag-drop-custom/demo-drag-drop-3.html#google_vignette");
		
//maximize the url
		driver.manage().window().maximize();
		
		//add page load time out
		driver.manage().timeouts().pageLoadTimeout(Duration.ofSeconds(30));
		
		//add implicitly wait
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
		
		//find madrid box
		WebElement madrid = driver.findElement(By.xpath("//div[@id=\'box7\']"));
		
		//find element by release loacation or spain box location
		WebElement spain = driver.findElement(By.xpath("//div[@id='box107']"));
		
		//create object of Actions class by passing WebDriver instance
		Actions xyz = new Actions(driver);
		
		//use clickAndHold() method by passing hold web element instance and
		// use release() method by passing release element location and to combine
		// multiple actions use build() method and use perform() to execute the each and
		// every action
		xyz.clickAndHold(madrid).release(spain).build().perform();
		
		//capture background colour for madrid box
		String a = madrid.getCssValue("background-color");
		System.out.println(a);
		
		//wait for 5 seconds
		Thread.sleep(5000);
		//close browser wind and terminate the session
		driver.quit();
	}

}
