package Tutorial2;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class class21 {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver","path of chrome driver");
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.facebook.com");
		driver.manage().window().maximize();
		WebElement email = driver.findElement(By.name("email"));
	}

}
