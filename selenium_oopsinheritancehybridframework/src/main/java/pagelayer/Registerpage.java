package pagelayer;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;


import baselayer.baseclass;
import utilitylayer.DropdownClass;
import utilitylayer.UtilsClass;
import utilitylayer.calender;

public class Registerpage extends baseclass {

	public void personalinfo(String nm,String hname,String pla,String local,String phone,String anum,String month1,String year1,
			String date1,String gender1,String district) throws InterruptedException
	{
		WebElement name = driver.findElement(By.xpath("//input[@name=\"userName\"]"));
		name.sendKeys(nm);
		WebElement houseName = driver.findElement(By.xpath("//input[@name=\"houseno_name\"]"));
		houseName.sendKeys(hname);
		WebElement place = driver.findElement(By.xpath("//input[@id='place']"));
		place.sendKeys(pla);
		WebElement locality = driver.findElement(By.xpath("//input[@id='locality']"));
		locality.sendKeys(local);
		WebElement mobileNumber = driver.findElement(By.xpath("//input[@id='mobileNo']"));
		mobileNumber.sendKeys(phone);
		WebElement aadhar = driver.findElement(By.xpath("//input[@id='uid']"));
		aadhar.sendKeys(anum);
		
		Thread.sleep(5000);
		WebElement date = driver.findElement(By.xpath("//i[@class='fa fa-calendar-alt	 icon-calendar']"));
		date.click();
		WebElement yearDropDown = driver.findElement(By.xpath("//span[@id='spanYear']/child::img"));
		yearDropDown.click();
		List<WebElement> years = driver.findElements(By.xpath("//div[@id='selectYear']/descendant::tr/child::td"));
		calender.calendar(years,year1);
		WebElement monDropDown = driver.findElement(By.xpath("//span[@id='spanMonth']/child::img"));
		monDropDown.click();
		List<WebElement> months = driver.findElements(By.xpath("//div[@id='selectMonth']/descendant::tr/child::td"));
		calender.calendarMonth(months, month1);
		List<WebElement> dates = driver.findElements(By.xpath("//span[@id='CalContent']/descendant::tbody/descendant::a"));
		calender.calendarDate(dates, date1);
		
		
		Thread.sleep(5000);
		List<WebElement> genderValues = driver.findElements(By.xpath("//div[@class='form-radio']/descendant::input"));
		UtilsClass.handleRadioButton(genderValues, gender1);
		
		Thread.sleep(5000);
		WebElement dist = driver.findElement(By.xpath("//select[@id ='districtCbo']"));
		DropdownClass.handelDropDown(dist, district);
		
	}
	
	
		public void usernameandpassword(String loginName,String pass,String confirmPass)
		{
			WebElement name = driver.findElement(By.xpath("//input[@id='loginName']"));
			name.sendKeys(loginName);
			WebElement password= driver.findElement(By.xpath("//input[@id='password']"));
			password.sendKeys(pass);
			WebElement confirmPassword = driver.findElement(By.xpath("//input[@id='confirmPassword']"));
			confirmPassword.sendKeys(confirmPass);
			
		}
		
		public void recovery(String recoverQ,String recoverA)
		{
			WebElement listRecoverQ= driver.findElement(By.xpath("//select[@id='securityQnsCbo']"));
			DropdownClass.handelDropDown(listRecoverQ, recoverQ);
			WebElement answer = driver.findElement(By.xpath("//input[@id='securityAns']"));
			answer.sendKeys(recoverA);
		}
	
}