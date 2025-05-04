package Tutorial1;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class guru99Assignment {

	public static void main(String[] args) throws InterruptedException {
		// open chrome browser
		WebDriver driver = new ChromeDriver();
		//open guru99 url
		driver.get("https://demo.guru99.com/test/newtours/login.php");
		Thread.sleep(3000);
		//find element for ragister button
		WebElement Register=driver.findElement(By.xpath("//a[text()='REGISTER']"));
		Register.click();
		//first name
		WebElement firstname=driver.findElement(By.xpath("//input[@name='firstName']"));
		firstname.sendKeys("lavanya");
		//enter last name
		WebElement lastname=driver.findElement(By.xpath("//input[@name='lastName']"));
		lastname.sendKeys("D");
		//add phone no.
		WebElement phone=driver.findElement(By.xpath("//input[@name='phone']"));
		phone.sendKeys("020-4256898");
        //add email id
		WebElement email=driver.findElement(By.xpath("//input[@name='userName']"));
		email.sendKeys("tech.lavanyad@gmail.com");
		Thread.sleep(5000);
		//add address
		WebElement address=driver.findElement(By.xpath("//input[@name='address1']"));
		address.sendKeys("pune");
        //add city
		WebElement city=driver.findElement(By.xpath("//input[@name='city']"));
		city.sendKeys("pune");
        //add state
		WebElement state=driver.findElement(By.xpath("//input[@name='state']"));
		state.sendKeys("MH");
		//add postal code
		WebElement postalcode=driver.findElement(By.xpath("//input[@name='postalCode']"));
		postalcode.sendKeys("411014");
		//add country
		WebElement country=driver.findElement(By.xpath("//select[@name='country']"));
		Select countryname=new Select(country);
		countryname.selectByVisibleText("INDIA");
		Thread.sleep(5000);
        
		//add username
		WebElement Username=driver.findElement(By.xpath("//input[@name='email']"));
		Username.sendKeys("lavanya");
		//add password
		WebElement password=driver.findElement(By.xpath("//input[@name='password']"));
		password.sendKeys("lavanya123");
		//add confirm password
		WebElement confrpword=driver.findElement(By.xpath("//input[@name='confirmPassword']"));
		confrpword.sendKeys("lavanya123");
		//add submit button
		WebElement submit =driver.findElement(By.xpath("//input[@name='submit']"));
		submit.click();
		Thread.sleep(5000);
		//sign in page
	    WebElement signon =driver.findElement(By.xpath("//a[@href='login.php']"));
		signon.click();
		Thread.sleep(5000);
		//Enter username
		WebElement username = driver.findElement(By.xpath("//input[@name='userName']"));
		username.sendKeys("lavanya");
		Thread.sleep(5000);
		//Enter PassWord
		WebElement password1=driver.findElement(By.xpath("//input[@name='password']"));
		password1.sendKeys("lavanya123");
		Thread.sleep(5000);
	    //click on submit button
		WebElement submit1=driver .findElement(By.xpath("//input[@name='submit']"));
		submit1.click();
				
		Thread.sleep(5000);
		driver.quit();

        }

}
