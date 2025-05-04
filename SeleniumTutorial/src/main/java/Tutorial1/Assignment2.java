package Tutorial1;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Assignment2 {
	public static void main (String[]args) throws InterruptedException {
		
		//open a url
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.saucedemo.com/");
		
		//find webelement username
		WebElement wb = driver.findElement(By.id("user-name"));
		wb.sendKeys("standard_user");
		
		//find password text box using id or name locator		
				WebElement wb1 = driver.findElement(By.id("password"));
				//enter value in first name text box

				wb1.sendKeys("secret_sauce");
				Thread.sleep(5000);
				//find element for login button
				WebElement wb2=driver.findElement(By.id("login-button"));
				wb2.click();
				//find the Sauce Labs Backpack add to cart button using id or name locator
				WebElement wb3=driver.findElement(By.id("add-to-cart-sauce-labs-backpack"));
				wb3.click();
				WebElement wb4=driver.findElement(By.id("add-to-cart-sauce-labs-bike-light"));
				wb4.click();
				
				
				WebElement wb5=driver.findElement(By.id("add-to-cart-sauce-labs-bolt-t-shirt"));
				wb5.click();
				WebElement wb6=driver.findElement(By.id("add-to-cart-sauce-labs-fleece-jacket"));
				wb6.click();

				//Webelement for cart 
				
	
				WebElement wb7=driver.findElement(By.xpath("//a[@class='shopping_cart_link']"));
				wb7.click();
				
				
				
				//webelemnt for Checkout
				
				driver.manage().window().maximize();
				WebElement wb8 = driver.findElement(By.id("checkout"));
				wb8.click();
						
				
				
				//find webelement
				WebElement wb9=driver.findElement(By.id("first-name"));
				wb9.sendKeys("Lavanya");
				
				WebElement wb10=driver.findElement(By.id("last-name"));
				wb10.sendKeys("D");
				
				WebElement wb11=driver.findElement(By.id("postal-code"));
				wb11.sendKeys("411014");
				
				
				WebElement wb12=driver.findElement(By.id("continue"));
				wb12.click();
				
				
			
				WebElement wb13=driver.findElement(By.id("finish"));
				wb13.click();
				
				driver.quit();



		
			
	}

}
