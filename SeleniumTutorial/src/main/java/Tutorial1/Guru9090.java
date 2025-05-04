package Tutorial1;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Guru9090 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		WebDriver driver=new ChromeDriver();
		
		//open Url
		driver.get("https://demo.guru99.com/test/newtours/register.php");
		
		driver.manage().window().maximize();
		//Find webelement and assign value
		
		WebElement wb=driver.findElement(By.name("firstName"));
		wb.sendKeys("Lavanya");
		
		WebElement wb1=driver.findElement(By.name("lastName"));
		wb1.sendKeys("D");
		
		WebElement wb2=driver.findElement(By.name("phone"));
		wb2.sendKeys("022-458697");
		
		WebElement wb3=driver.findElement(By.name("userName"));
		wb3.sendKeys("tech.lavanyad@gmail.com");
	
		WebElement wb4=driver.findElement(By.name("address1"));
		wb4.sendKeys("pune");
		
		WebElement wb5=driver.findElement(By.name("city"));
		wb5.sendKeys("pune");
		
		WebElement wb6=driver.findElement(By.name("state"));
		wb6.sendKeys("MH");
		
		WebElement wb7=driver.findElement(By.name("postalCode"));
		wb7.sendKeys("411014");
		
		
		WebElement wb8=driver.findElement(By.name("email"));
		wb8.sendKeys("lavanya123");
		
		WebElement wb9=driver.findElement(By.name("password"));
		wb9.sendKeys("lavanya1212");
		
		WebElement wb10=driver.findElement(By.name("confirmPassword"));
		wb10.sendKeys("lavanya1212");
		
		
		WebElement wb11=driver.findElement(By.name("submit"));
		wb11.click();
		
	
		driver.quit();


	}

}
