package Tutorial2;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class javaScript1 {

	public static void main(String[] args) throws InterruptedException {
		//open browser
		WebDriver driver = new ChromeDriver();

		//open url
		driver.get("https://www.facebook.com/r.php");
		
		Thread.sleep(3000);

		//maximize the browser
		driver.manage().window().maximize();
		
		Thread.sleep(3000);

		//convert Webdriver object into javascrpit executor
		JavascriptExecutor js = (JavascriptExecutor) driver;
		
		//use executeScript()method by passing window.location='https://www.facebook.com/'
		js.executeScript("window.location='https://www.facebook.com/r.php';");
		
		Thread.sleep(3000);

		//find firstname text box
		WebElement firstname = driver.findElement(By.name("firstname"));
	
		//enter value in firstname textbox using javascript executor
		js.executeScript("arguments[0].value='Lavanya';",firstname);
		
		Thread.sleep(3000);

		//find last name textbox
		WebElement lastname = driver.findElement(By.name("lastname"));

		//enter value in lastname textbox
		js.executeScript("arguments[0].value='D';",lastname);
		
		Thread.sleep(3000);

		//find gender female button
		WebElement female = driver.findElement(By.xpath("//input[@name='sex']/parent::label[text()='Female']"));

		//select radio button using javascript ececutor
		js.executeScript("arguments[0].click();",female);
		
		Thread.sleep(3000);

		//find email textbox
		WebElement email = driver.findElement(By.name("reg_email__"));

		//enter value in email text box
		js.executeScript("arguments[0].value='tech.lavanyad@gmail.com';",email);
		
		Thread.sleep(3000);

		//find new password text box
		WebElement password = driver.findElement(By.name("reg_passwd__"));

		//enter value in password textbox
		js.executeScript("arguments[0].value='Lavanya@12';",password);
		
		Thread.sleep(3000);

		//find signup button
		WebElement signup = driver.findElement(By.xpath("//div[@class='_9bq4']/preceding-sibling::div[@class='_1lch']/child::button[text()='Sign Up']"));

		//click on signup button using javascript executor
		js.executeScript("argument[0].click();",signup);
	}

}
