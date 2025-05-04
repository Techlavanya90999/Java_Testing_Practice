package Practice;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class MultipleWindowHandle {

	public static void main(String[] args) {
//open chrome browser
		WebDriver driver = new ChromeDriver();
		
		//open url
		driver.get("https://prafpawar11.github.io/multiplewindows.html");
		//maximize url
		driver.manage().window().maximize();
		//add pageloadtimeout
		driver.manage().timeouts().pageLoadTimeout(Duration.ofSeconds(30));
		//add implicitlywait
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
		//capture current window id no.
		String parentid = driver.getWindowHandle();
		//find firstname text
		WebElement firstname = driver.findElement(By.name("fname"));
		firstname.sendKeys("Shriya");
		//find orange hrm link and click on it
		WebElement orangeHrm = driver.findElement(By.partialLinkText("Visit Orange HRM"));
		orangeHrm.click();
		//capture all window id no. by using windowhandles()method
		
	}

}
