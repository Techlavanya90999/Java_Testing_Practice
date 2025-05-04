package Tutorial1;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class demo {

	public static void main(String[] args) throws InterruptedException {
		// Step 1: open a browser
		WebDriver driver = new ChromeDriver();
		
		// Step 2: open an URL
		driver.get("https://praf002.github.io/");
		
		// Step 3: maximize the browser
		driver.manage().window().maximize();
		
		//wait for 3 seconds
		Thread.sleep(3000);
		
		// Step 4: add a page load time out
		driver.manage().timeouts().pageLoadTimeout(Duration.ofSeconds(30));
		
		// Step 5: add a implicitly Wait
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
		
		//Step 7: find the text box
		WebElement abc = driver.findElement(By.xpath("//input[@id='name']"));
				
		// Step 8: enter full name in the full name text box
		abc.sendKeys("kunal gajare");
		
		// wait for 3 seconds
		Thread.sleep(3000);
		
		// Step 9: switch focus to mobile frame
		driver.switchTo().frame("mobileFrame");
		
		// Step 10: switch focus to check box frame
		driver.switchTo().frame("showcheckbox");
		
		// wait for 3 seconds
		Thread.sleep(3000);
		
		// Step 11: find the github checkbox 
		WebElement git = driver.findElement(By.xpath("//input[@id='GitHub']"));
		
		// Step 12: click on the github check box
		git.click();
		
		// wait for 3 seconds
		Thread.sleep(3000);
		
		// Step 13: switch focus to main window or top window
		driver.switchTo().defaultContent();
		
		// Step 14: switch focus to address
		driver.switchTo().frame("addressframe");
		
		// Step 15: switch focus to tool name frame
		driver.switchTo().frame("toolframe");
		
		// Step 16:  find the tools name drop down 
		WebElement tol = driver.findElement(By.xpath("//select[@name='course']"));
		
		// Step 17: create object of select class by using web element instance name or object name or variable name
		Select xyz = new Select(tol);
		
		// Step 18: use selectByVisibleText() method by passing web element instance name
		xyz.selectByVisibleText("Database Automation");
		
		// wait for 3 seconds
	    Thread.sleep(3000);
	    
	    // Step 19: switch focus to main window or top window
	    driver.switchTo().defaultContent();
	    
	    // Step 20: switch focus to mobile frame
	 	driver.switchTo().frame("mobileFrame");
	 	
	 	// Step 21: Find the mobile number text box
	 	WebElement mob = driver.findElement(By.xpath("//input[@name='mob']"));
	 	
	 	// Step 22: enter the mobile number into the mobile number text box
	 	mob.sendKeys("9955662456");
	 	
	 	// wait for 3 seconds
	 	Thread.sleep(3000);
	 	
	 	// Step 23: switch focus to main window or top window
	 	driver.switchTo().defaultContent();
	 	
	 	// Step 24: switch focus to address
		driver.switchTo().frame("addressframe");
		
		// Step 25: find the address text box
		WebElement add = driver.findElement(By.xpath("//input[@name='add']"));
		
		// Step 26: enter address in the address text box
		add.sendKeys("Pune");
		
		// wait for 3 seconds
		Thread.sleep(3000);
		
		// Step 27: switch focus to main window or top window
	    driver.switchTo().defaultContent();
		
	    // Step 28: switch focus to mobile frame
	 	driver.switchTo().frame("mobileFrame");
	 		
	 	// Step 29: switch focus to check box frame
	 	driver.switchTo().frame("showcheckbox");
	 		
	    // Step 30: find the github checkbox 
	 	WebElement nit = driver.findElement(By.xpath("//input[@id='GitHub']"));
	 		
	 	// Step 31: unselect the github checknox
	 	nit.click();
	 	
	 	// wait for 3 seconds
	 	Thread.sleep(3000);
	 	
	    // Step 32: switch focus to main window or top window
	    driver.switchTo().defaultContent();
	    
	    // Step 33: switch focus to address
	 	driver.switchTo().frame("addressframe");
	 	
	    // Step 34: switch focus to tool name frame
	 	driver.switchTo().frame("toolframe");
	 	
	 	// Step 35: switch focus to selenium frame
	 	driver.switchTo().frame("seleniumFrame");
	 	
	 	// Step 36: find the selenium click button
	 	WebElement mno = driver.findElement(By.xpath("//a[text()='Selenium']"));
	 	
	 	// Step 37: click on selenium button
	 	mno.click();
	 	
	 	// wait for 3 seconds
	 	Thread.sleep(3000);
	 	
	 	// Step 38: switch focus to main window or top window
	 	driver.switchTo().defaultContent();
	 	
	 	// Step 39: find the text box
	 	WebElement poi = driver.findElement(By.xpath("//input[@id='name']"));
	 	
	 	// Step 41: clear the name text box
	 	poi.clear();
	 					
	 	// Step 42: enter full name in the full name text box
	 	poi.sendKeys("yash patil");
	 	
	 	// wait for 3 seconds
	 	Thread.sleep(3000);
	 	
	    // Step 43: switch focus to address
	 	driver.switchTo().frame("addressframe");
	 		
	 	// Step 44: find the address text box
	 	WebElement toy = driver.findElement(By.xpath("//input[@name='add']"));
	 	
	 	// Step 45: clear the address text box
	 	toy.clear();
	 		
	 	// Step 45: enter address in the address text box
	 	toy.sendKeys("mumbai");
	 	
	 	// wait for 5 seconds
	 	Thread.sleep(5000);
	 	
	 	// Step 46: close and terminate the window 
	 	driver.quit();
	 	
	 	

	}

}
