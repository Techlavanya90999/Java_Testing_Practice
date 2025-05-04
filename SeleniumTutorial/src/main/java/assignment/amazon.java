package assignment;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class amazon {

public static void main(String[] args) throws InterruptedException {
//open chrome browser
		WebDriver driver = new ChromeDriver();
		
//open url
		driver.get("https://www.amazon.in/");
		
//maximize url
		driver.manage().window().maximize();
		
//add page load time
		driver.manage().timeouts().pageLoadTimeout(Duration.ofSeconds(30));
		
//add implicitly wait
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
		
		WebElement search=driver.findElement(By.xpath("//input[@id='twotabsearchtextbox']"));
		search.sendKeys("samsung galaxy A35");
		
		Thread.sleep(3000);
		WebElement product =driver.findElement(By.xpath("//input[@id='nav-search-submit-button']"));
		product.click();
		
		WebElement prize = driver.findElement(By.xpath("//div[@id='a-popover-sp-info-popover-B0CQYMVLQ4']/ancestor::div[@data-cy='title-recipe']/following-sibling::div[2]/descendant::span[@class='a-price-whole']"));
		
		String Actualprize = prize .getText();
		System.out.println(Actualprize);
		
		String rev="";
		
		for(int i=Actualprize.length()-1;i>=0;i--) {
			
			rev=rev+Actualprize.charAt(i);
			
		}
		if(Actualprize.equals(rev)) {
			
			System.out.println("String is Palindrome String");
		}
		
		else {
			
			System.out.println("String is Not Palindrome");
		}

driver.quit();
}
}


