package Tutorial1;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Assignment3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//open url
		WebDriver driver = new ChromeDriver();
		driver.get("https://copyright.gov.in/UserRegistration/frmNewUser.aspx");
		//Find Element and assign value
				WebElement wb=driver.findElement(By.id("ctl00_ContentPlaceHolder1_txtFName"));
				wb.sendKeys("Lavanya");
				
				WebElement wb1=driver.findElement(By.id("ctl00_ContentPlaceHolder1_txtLName"));
				wb1.sendKeys("D");
				WebElement wb2=driver.findElement(By.id("ctl00_ContentPlaceHolder1_txtAddress"));
				wb2.sendKeys("Kharadi");
				
				WebElement wb3=driver.findElement(By.id("ctl00_ContentPlaceHolder1_txtAddress2"));
				wb3.sendKeys("Pune");
				
				WebElement wb4=driver.findElement(By.id("ctl00_ContentPlaceHolder1_txtCity"));
				wb4.sendKeys("Pune");
				
				WebElement wb5=driver.findElement(By.id("ctl00_ContentPlaceHolder1_txtNationality"));
				wb5.sendKeys("Indian");
				
				WebElement wb6=driver.findElement(By.id("ctl00_ContentPlaceHolder1_txtPinCode"));
				wb6.sendKeys("411014");
				
				WebElement wb7=driver.findElement(By.id("ctl00_ContentPlaceHolder1_txtEmail"));
				wb7.sendKeys("tech.lavanya@gmail.com");
				
				WebElement wb8=driver.findElement(By.id("ctl00_ContentPlaceHolder1_txtPhoneNumber"));
				wb8.sendKeys("220-123456");
				
				WebElement wb9=driver.findElement(By.id("ctl00_ContentPlaceHolder1_txtMobileNum"));
				wb9.sendKeys("9960767979");
				
			
				WebElement wb10=driver.findElement(By.id("ctl00_ContentPlaceHolder1_txtAnswer"));
				wb10.sendKeys("2");
				
				
				WebElement w=driver.findElement(By.id("ctl00_ContentPlaceHolder1_rdoSociety"));
				w.click();
				
				
				WebElement wb11=driver.findElement(By.id("ctl00_ContentPlaceHolder1_txtUserId"));
				wb11.sendKeys("lavanya12345");
				
				WebElement wb12=driver.findElement(By.id("ctl00_ContentPlaceHolder1_txtPassword"));
				wb12.sendKeys("lavanya1212");
				
				WebElement wb13=driver.findElement(By.id("ctl00_ContentPlaceHolder1_txtConfirmPwd"));
				wb13.sendKeys("lavanya1212");
				
				
				driver.quit();

	}

}
