package pagelayer;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

import baselayer.baseclass;

public class loginpage extends baseclass {
	public static void login(String name, String pass) {
	WebElement user = driver.findElement(By.xpath("//input[@name='username']"));
	user.sendKeys(name);
	WebElement password = driver.findElement(By.xpath("//input[@name='password']"));
	password.sendKeys(pass);
	WebElement login = driver.findElement(By.xpath("//button[text()=' Login ']"));
	login.click();	
}
}
