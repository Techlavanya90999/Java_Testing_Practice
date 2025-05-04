package Calender;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;
public class goibbiboCalender {

	public static void main(String[] args) throws InterruptedException {
		WebDriver driver = new ChromeDriver();
		//open url
		driver.get("https://www.goibibo.com/");
		System.out.println();
		//maximize url
		driver.manage().window().maximize();
		WebElement close = driver.findElement(By.xpath("//span[@class='logSprite icClose']"));
		close.click();
		//find date object
		WebElement Date = driver.findElement(By.xpath("//p[@class='sc-12foipm-4 czGBLf fswWidgetTitle']/child::span[@class='sc-12foipm-8 eXKWBG fswDownArrow']"));
		//click on date object
		Date.click();
		Thread.sleep(5000);
		//iterate values using loop
		while(true)
		{
			//find actual month and year
			WebElement xyz = driver.findElement(By.xpath("))
		}
	}

}
