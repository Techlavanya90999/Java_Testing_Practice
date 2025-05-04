package pagelayer;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

import baselayer.BaseClass;

public class LoginPage extends BaseClass {
public static void Login(String Username, String password) {
	WebElement uname = driver.findElement(By.name("username"));
uname.sendKeys("Admin");
	WebElement pwd = driver.findElement(By.name("password"));
	pwd.sendKeys("admin123");
	WebElement login = driver.findElement(By.xpath("//button[text()=' Login ']"));
	login.click();
}
}
