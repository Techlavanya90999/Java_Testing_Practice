package Practice;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class handleFrame {

	public static void main(String[] args) throws InterruptedException {
//open chrome browser
		WebDriver driver = new ChromeDriver();
		//open url
		driver.get("https://prafpawar11.github.io/mainFrame.html");
		//maximize url
		driver.manage().window().maximize();
		//add page load timeout
		driver.manage().timeouts().pageLoadTimeout(Duration.ofSeconds(30));
		//add implicitly wait
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
		//find text name box
		WebElement name = driver.findElement(By.id("name"));
		name.sendKeys("Shriya");
		Thread.sleep(3000);
		// switch focus to the frame using switchTo().frame();
				// driver.switchTo().frame(0);
				//driver.switchTo().frame("mainframe");
				WebElement lmo  =driver.findElement(By.xpath("//iframe[@id='mainframe']"));
				driver.switchTo().frame(lmo);

				// find the cucumber check box
				WebElement abc2 = driver.findElement(By.xpath("//input[@id='Cucumber']"));

				// click on check box
				abc2.click();

				// switch focus to window or main window
				// driver.switchTo().defaultContent();
				driver.switchTo().parentFrame();

				Thread.sleep(2000);

				// clear the name text
				name.clear();

				Thread.sleep(6000);
				driver.quit();
	}

}
