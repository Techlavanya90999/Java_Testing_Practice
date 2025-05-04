package pagelayer;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;

import baselayer.baseclass;

public class pimpage extends baseclass {
	public void addemployee() throws InterruptedException
	{
		Actions act = new Actions(driver);
		WebElement pim = driver.findElement(By.xpath("//span[text()='PIM']"));
		pim.click();
		WebElement add = driver.findElement(By.xpath("//button[@class='oxd-button oxd-button--medium oxd-button--secondary']"));
		add.click();
		Thread.sleep(5000);
	}
	public void addempdetails(String first,String middle,String last) throws InterruptedException
	{
		WebElement fname = driver.findElement(By.xpath("//input[@name='firstName']"));
		fname.sendKeys(first);
		WebElement mname = driver.findElement(By.xpath("//input[@name='middleName']"));
		mname.sendKeys(middle);
		WebElement lname = driver.findElement(By.xpath("//input[@name='lastName']"));
		lname.sendKeys(last);
		Thread.sleep(5000);
		WebElement save = driver.findElement(By.xpath("//button[@class='oxd-button oxd-button--medium oxd-button--secondary orangehrm-left-space']"));
		save.click();
	}
		
	public String retriveEmpId (String country, String gender, String city) throws InterruptedException 
	{
Actions act = new Actions(driver);
		
		WebElement empId= driver.findElement(By.xpath("//label[text()='Employee Id']/parent::div/following-sibling::div/child::input"));
		String empID = empId.getAttribute("value");
		if(gender.equalsIgnoreCase("Female"))
		{
		WebElement femaleXpath = driver.findElement(By.xpath("//input[@value=2]/following-sibling::span"));
		femaleXpath.click();
		}
	else
		{
		WebElement maleXpath = driver.findElement(By.xpath("//input[@value=1]/following-sibling::span"));
		maleXpath.click();
		}
Thread.sleep(5000);
WebElement contactDetails = driver.findElement(By.xpath("//a[text()='Contact Details']"));
act.click(contactDetails).build().perform();
Thread.sleep(5000);
WebElement con = driver.findElement(By.xpath("//div[text()='-- Select --']"));
con.click();
List<WebElement> countryList = driver.findElements(By.xpath("//div[@class='oxd-select-option']/span"));
while(true)
{
for(WebElement country1:countryList)
{
	String countryValue = country1.getText();
	System.out.println(countryValue);
	if(countryValue.equalsIgnoreCase(country))
		{
		country1.click();
		break;
		}
}
break;
}
WebElement city1 = driver.findElement(By.xpath("//label[text()='City']/parent::div/following-sibling::div/child::input"));
act.sendKeys(city1,city).build().perform();

return empID;
	
	
		
	}
	public void searchDeleteEmpl(String id)
	{
		Actions act = new Actions(driver);
		WebElement empList = driver.findElement(By.xpath("//a[text()='Employee List']"));
		empList.click();
		WebElement EmpId = driver.findElement(By.xpath("//label[text()='Employee Id']/parent::div/following-sibling::div/child::input"));
		act.sendKeys(EmpId,id).build().perform();
		WebElement search = driver.findElement(By.xpath("//button[@class='oxd-button oxd-button--medium oxd-button--secondary orangehrm-left-space']"));
		search.click();
		WebElement delete = driver.findElement(By.xpath("//div[@class='oxd-table-row oxd-table-row--with-border oxd-table-row--clickable']/child::div/descendant::button[2]"));
		delete.click();
		WebElement deleteConfirm = driver.findElement(By.xpath("//button[@class='oxd-button oxd-button--medium oxd-button--label-danger orangehrm-button-margin']"));
		deleteConfirm.click();
	}

}
