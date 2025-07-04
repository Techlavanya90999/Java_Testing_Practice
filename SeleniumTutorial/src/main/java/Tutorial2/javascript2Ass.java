package Tutorial2;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class javascript2Ass {

	public static void main(String[] args) throws InterruptedException {
		//open chrome browser
		WebDriver driver = new ChromeDriver();

		//open url
		driver.get("https://www.irctc.co.in/nget/train-search");

		//maximize the url
		driver.manage().window().maximize();

		Thread.sleep(5000);

		//find element from
		WebElement from = driver.findElement(By.name("origin"));

		//convert webdriver object into javascript excutor
		JavascriptExecutor js = (JavascriptExecutor)driver;

		//use executescript()method by passing arguments[0].value='Expected value' and webelement instance name
		js.executeScript("arguments[0].value='Pune';", from);
	}

}
