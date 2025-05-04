package Tutorial1;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class popupDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
//open crome browser
		WebDriver driver = new ChromeDriver();
		//open url
		driver.get("https://demoqa.com/alerts");
		//maximize the browser
		driver.manage().window().maximize();
		//find 1st click me button
		WebElement wb = driver.findElement(By.id("alert Button"));
		//click on click me button
		wb.click();
	}

}
