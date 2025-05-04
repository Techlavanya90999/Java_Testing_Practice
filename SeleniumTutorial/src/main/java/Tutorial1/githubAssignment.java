package Tutorial1;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class githubAssignment {

	public static void main(String[] args) throws InterruptedException {
//open ChromeBrowser
		WebDriver driver = new ChromeDriver();
		
		//open url
		driver.get("https://praf002.github.io/");
		
		//maximize the url
		driver.manage().window().maximize();
		
		//add pageloadtime out
		driver.manage().timeouts().pageLoadTimeout(Duration.ofSeconds(30));
		
		//add implicitly
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
		
		//find the full name text box
		WebElement fname = driver.findElement(By.xpath("//input[@name='name']"));
		Thread.sleep(3000);

	//add name in text box
		fname.sendKeys("Ram");
		
		//switch focus to mobile frame
		driver.switchTo().frame("mobileFrame");
		
		// Step 10: switch focus to check box frame
		driver.switchTo().frame("showcheckbox");
		
		// wait for 3 seconds
		Thread.sleep(3000);
		
		// Step 11: find the github checkbox 
		WebElement git = driver.findElement(By.xpath("//input[@id='GitHub']"));
		
		// Step 12: click on the github check box
		git.click();
		
		//switch focus to main window or top window
		driver.switchTo().defaultContent();
		
		//switch to focus to address
		driver.switchTo().frame("addressframe");
		
		//switch to focus to toolname frame
		driver.switchTo().frame("Toolname");
		
		//add toolname
	//	toolname.sendKeys();
		
		//find the mobile no.
				WebElement abc3 = driver.findElement(By.xpath("//input[@name='add'']"));
				//add address
				abc3.sendKeys();
				
	}

}
