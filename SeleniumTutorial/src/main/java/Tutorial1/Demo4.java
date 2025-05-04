package Tutorial1;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Demo4 {
	public static void main (String[]args) {
		//open a browser
		WebDriver driver = new ChromeDriver();
		//open a url
		driver.get("https://copyright.gov.in/UserRegistration/frmNewUser.aspx");
		//maximize the browser
		driver.manage().window().maximize();
		//find society user button using radio button
		WebElement wb = driver.findElement(By.id("ctl00_ContentPlaceHolder1_rdoSociety"));
		//check radio button is selected or not
		boolean a = wb.isSelected();
		System.out.println(a);
		//minimize the browser
		driver.manage().window().minimize();
		
	}

}
