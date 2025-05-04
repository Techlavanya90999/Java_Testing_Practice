package Demo;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Demo1 {
public void SelectDate(String date, String MonthYear) 
System.setProperty("webDriver.chrome.driver","path/to/chromedriver");
WebDriver driver = new ChromeDriver();
try
{
	driver.get("https://www.redbus.in/");
	driver.manage().window().maximize();
	driver.findElement(By.id("onwardCal")).click();
	while(true){
		WebElement MonthYearElement = driver.findElement ( By.className("monthTitle"));
		String displayMonthYear = MonthYearElement.getText();
		if(displayMonthYear.equalsIgnoreCase(MonthYear));
		break;
	}
	else {
		driver.findElement(By.className("next")).click();
		
		
	}
	
}


	public static void main(String[] args) {
			}

		

	}


