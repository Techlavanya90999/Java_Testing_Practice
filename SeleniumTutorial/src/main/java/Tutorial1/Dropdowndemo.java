package Tutorial1;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class Dropdowndemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//open browser
		WebDriver driver = new ChromeDriver();
		//open facebook url
driver.get("https://www.facebook.com/reg");
//minimize the url
driver.manage().window().minimize();
//find the month dropdown
WebElement month = driver.findElement(By.name("Birthday Month"));
//create object of Select class by passing WebElement object name or instance name or variable name.
Select XYZ = new Select(month);
//use selectByVisibleText() method by passing dropdown visible text.
XYZ.selectByVisibleText("March");
//use select by value()method by passing dropdown visible text
XYZ.selectByValue("5");
////use select by index()method by passing dropdown visible text
XYZ.selectByIndex(4);
	}

}
