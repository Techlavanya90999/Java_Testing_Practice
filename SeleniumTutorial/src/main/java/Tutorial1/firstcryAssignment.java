package Tutorial1;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class firstcryAssignment {

	public static void main(String[] args) {
//open Chrome Browser
		WebDriver driver = new ChromeDriver();
		
		//open url
		driver.get("https://www.firstcry.com/");
		
		//maximize the browser
		driver.manage().window().maximize();
		
		//add pageload time out
		driver.manage().timeouts().pageLoadTimeout(Duration.ofSeconds(30));
		
		//add implicitly Wait
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
		
		//find element allcategories
		WebElement all = driver.findElement(By.xpath("//a[text()=' All Categories']"));
		
		//create object of action by passing webdriver instance
		Actions wb1 = new Actions(driver);
		wb1.moveToElement(all).perform();
		
		all.click();
		//find element toys
		WebElement toys = driver.findElement(By.xpath("//span[@id=\"menu4\"]"));
		
		//create object of action by passing webdriver instance
		Actions wb2 = new Actions(driver);
		wb2.moveToElement(toys).perform();
		toys.click();
		
		//find element colouring sequencing //shopchoic spacedown ////div[@class="sort-select-content L12_42"]
		//WebElement c1 = driver.findElement(By.xpath("//div[@class='option-container submenu1-4']//a[text()='Coloring, Sequencing & Engraving Art']"));
		WebElement c1 = driver.findElement(By.xpath("//div[@class=\"sort-select-content L12_42\"]//a[text()='Coloring, Sequencing & Engraving Art']"));
		c1.click(); 	
		
		//find element sortby
		WebElement c2 = driver.findElement(By.xpath("//div[@class=\"sort-select-content L12_42\"]"));
		Actions wb3 = new Actions(driver);
		wb3.moveToElement(c2).perform();
		
		//find top rated element
		WebElement c3 =driver.findElement(By.xpath("//*[@sort-select\"]"));
		Actions wb4 = new Actions(driver);
		wb4.moveToElement(c2).perform();
		
	    
	   	}

}
