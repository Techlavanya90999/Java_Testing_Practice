package Tutorial1;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class guru99contextAssignment {

	public static void main(String[] args) throws InterruptedException {
		// open browser
		WebDriver driver = new ChromeDriver();
		//open chrome url
		driver.get("https://demo.guru99.com/test/simple_context_menu.html\r\n");
		//maximize the url
		driver.manage().window().maximize();
		Thread.sleep(5000);
		//find the right click m button
		WebElement rightclick = driver.findElement(By.xpath("//span[text()='right click me']"));
        
	}

}
