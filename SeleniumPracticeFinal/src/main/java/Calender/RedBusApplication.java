package Calender;

import java.time.Duration;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class RedBusApplication {

	public static void main(String[] args) throws InterruptedException {
		
		
		WebDriver driver =new ChromeDriver();

		driver.get("https://www.redbus.in/");

		driver.manage().window().maximize();
		
		driver.manage().timeouts().pageLoadTimeout(Duration.ofSeconds(30));
		
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
		
		WebElement date=driver.findElement(By.xpath("//div[@class='labelCalendarContainer']"));
		
		date.click();
		
Thread.sleep(5000);
		
		//step 8: iterate values using loops
		while(true)
		{
			//step 9: find the actual month and year
			WebElement xyz = driver.findElement(By.xpath("//div[@class='DayNavigator__IconBlock-qj8jdz-2 iZpveD'][2]"));
			
			//step 10: capture actual month and year
			String actualMonthAndYear = xyz.getText();
			Thread.sleep(2000);
			if(actualMonthAndYear.contains("Mar 2025"))
			{
				break;
			}
			else
			{
				//step 11 : find the next button
				WebElement next = driver.findElement(By.xpath("//div[@class='DayNavigator__IconBlock-qj8jdz-2 iZpveD'][3]"));
				
				//step 12: click on next button
				next.click();
			}
			
		}
		
		Thread.sleep(5000);
		

		//find all dates
		List<WebElement> allDates = driver.findElements(By.xpath("//span[@class='DayTiles__CalendarDaysSpan-sc-1xum02u-1 dkWAbH' and text()=6]"));
		////div[@class='DatePicker__MainBlock-sc-1kf43k8-1 hHKFiR']
		
      // iterate all dates
		for(WebElement pqr:allDates)
		{
			
			String actualDate = pqr.getText();
			
			 //System.out.println(actualDate);
			if(actualDate.contains("6"))
			{
			    
				pqr.click();
			   System.out.println(actualDate);
				break;
			}
			
			
			
		}
		Thread.sleep(3000);
		driver.quit();
		
	}

}
