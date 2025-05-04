package TestNG;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class hyrtutorial {
@Test
public void Google()
{
//WebDriverManager.ChromeDriver().setup()
	WebDriver driver = new ChromeDriver();
driver.manage().window().maximize();
driver.get("https://www.google.co.in/");
driver.findElement(By.name("q")).sendKeys("facebook",Keys.ENTER);
System.out.println(driver.getTitle());
driver.quit();
}
@Test
public void facebook()
{
	WebDriver driver = new ChromeDriver();
	driver.manage().window().maximize();
	driver.get("https://www.facebook.com/");
	driver.findElement(By.name("email")).sendKeys("tech.lavanya@gmail.com");
	driver.findElement(By.name("pass")).sendKeys("mayuresh@12");
	System.out.println(driver.getTitle());
	driver.quit();
	

}
}
