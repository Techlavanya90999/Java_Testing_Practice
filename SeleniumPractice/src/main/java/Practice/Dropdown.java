package Practice;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class Dropdown {

	public static void main(String[] args) {
//open chrome browser
		WebDriver driver = new ChromeDriver();
		//open url
		driver.get("https://www.facebook.com/reg");
		//maximize url
		driver.manage().window().maximize();
		//find month dropdown using name locator
		WebElement month = driver.findElement(By.name("birthday_month"));
		//create object of select class by passing month drop down webelement
		//instance name variable name object name
		Select xyz = new Select (month);
		//use selectByVisibleText() method by passing drop down visible text
		// value
		xyz.selectByVisibleText("Feb");
		
		
	}

}
