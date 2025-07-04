package PracticeTutorial;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Sclass2Assignment {

	public static void main(String[] args) throws InterruptedException {
//open Chromebrowser
		WebDriver driver = new ChromeDriver();
		
//open url
		driver.get("https://www.saucedemo.com/");
		Thread.sleep(3000);
		
//maximize url
		driver.manage().window().maximize();
		Thread.sleep(3000);

//find element username
		WebElement username = driver.findElement(By.name("user-name"));
		username.sendKeys("standard_user");
		Thread.sleep(3000);

//find element password
		WebElement password = driver.findElement(By.name("password"));
		password.sendKeys("secret_sauce");
		Thread.sleep(3000);

//find element login
		WebElement login = driver.findElement(By.name("login-button"));
		login.click();
		Thread.sleep(3000);

//find element product1
		WebElement product1 = driver.findElement(By.name("add-to-cart-sauce-labs-backpack"));
		product1.click();
		Thread.sleep(3000);

//find element product2
		WebElement product2 = driver.findElement(By.name("add-to-cart-sauce-labs-bike-light"));
		product2.click();
		Thread.sleep(3000);

//find element shopping cart
		WebElement shoppingcart = driver.findElement(By.xpath("//a[@class='shopping_cart_link']"));
		shoppingcart.click();
		Thread.sleep(3000);

//find element checkout
		WebElement checkout = driver.findElement(By.name("checkout"));
		checkout.click();
		Thread.sleep(3000);
		
//find element firstname
		WebElement fname = driver.findElement(By.name("firstName"));
		fname.sendKeys("lavanya");
		Thread.sleep(3000);

//find element lname
		WebElement lname = driver.findElement(By.name("lastName"));
		lname.sendKeys("D");
		Thread.sleep(3000);
		
//find element zip code
		WebElement zipcode = driver.findElement(By.name("postalCode"));
		zipcode.sendKeys("411014");
		Thread.sleep(3000);

//find Element continue
		WebElement cont = driver.findElement(By.name("continue"));
		cont.click();
		Thread.sleep(3000);
		
//find element finish
		WebElement finish = driver.findElement(By.name("finish"));
		finish.click();
		Thread.sleep(3000);
		
//close browser window
		driver.close();
	}

}
