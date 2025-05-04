package pageLayer;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

import UtilityLayer.BorderObject;
import UtilityLayer.WebClass;
import baseLayer.BaseClass;

public class SearchFlights extends BaseClass {

	public void searchFlights(String fromcity,String tocity,String Month,String Date,int Number1,int Number2,
			int Number3,String value,String catagoryvalue) 
	{

		WebElement close=driver.findElement(By.xpath("//span[@class='logSprite icClose']"));
		close.click();
		
		Thread.sleep(1000);
		
		WebElement from=driver.findElement(By.xpath("//div[@class='sc-12foipm-22 kGtxGm']/descendant::p"));
		WebClass.clickElement(from);
		BorderObject.borderobject(from);

		
		Thread.sleep(1000);
		
     	WebElement fromc=driver.findElement(By.xpath("//div[@class='sc-12foipm-25 fbAAhv']/child::input"));
		WebClass.sendKeys(fromc, fromcity);
		BorderObject.borderobject(fromc);

		Thread.sleep(1000);
	
		WebElement fromdd=driver.findElement(By.xpath("//ul[@id='autoSuggest-list']/child::li[1]"));
		WebClass.clickElement(fromdd);
		
		Thread.sleep(1000);
				
		WebElement to=driver.findElement(By.xpath("//div[@class='sc-12foipm-22 OmQvV']/descendant::p"));
		WebClass.clickElement(to);
		BorderObject.borderobject(to);

		Thread.sleep(1000);
		
		WebElement toc=driver.findElement(By.xpath("//div[@class='sc-12foipm-25 fbAAhv']/child::input"));
		WebClass.sendKeys(toc,tocity);
		
		Thread.sleep(1000);
		
		WebElement todd=driver.findElement(By.xpath("//ul[@id='autoSuggest-list']/child::li[1]"));
		WebClass.clickElement(todd);

		
		Thread.sleep(1000);
		

		WebElement cal=driver.findElement(By.xpath("//span[text()='Departure']/parent::div"));
		WebClass.clickElement(cal);
		BorderObject.borderobject(cal);
		
		Thread.sleep(1000);
		
//calender month year

		Thread.sleep(1000);
		
		WebElement month=driver.findElement(By.xpath("//div[@class='DayPicker-Month']/preceding-sibling::div/child::div[@class='DayPicker-Caption']"));
		BorderObject.borderobject(month);
		
		WebElement nxtbutton=driver.findElement(By.xpath("//div[@class='DayPicker']/descendant::span/following-sibling::span"));
		BorderObject.borderobject(nxtbutton);
		
		Calendar.handelCalendarmonth_year(month,Month,nxtbutton);
		
//Calender date

		Thread.sleep(1000);
	
		List<WebElement> dlist=driver.findElements(By.xpath("//div[@class='DayPicker-Month']/preceding-sibling::div/descendant::p"));
		Calendar.handlecalendardate(dlist, Date);

		Thread.sleep(1000);
		
	    WebElement traveller=driver.findElement(By.xpath("//span[text()='Travellers & Class']/parent::div"));
	    WebClass.clickElement(traveller);
	    BorderObject.borderobject(traveller);
	    
		Thread.sleep(1000);		
    
	    WebElement plusbutton1=driver.findElement(By.xpath("//p[text()='(Aged 12+ yrs)']/following-sibling::div/child::span[3]"));
	    TravellersLoop.travelLoop(plusbutton1,Number1);
	    BorderObject.borderobject(plusbutton1);
	    
		Thread.sleep(1000);
		
	    WebElement plusbutton2=driver.findElement(By.xpath("//p[text()='(Aged 2-12 yrs)']/following-sibling::div/child::span[3]"));
	    TravellersLoop.travelLoop(plusbutton2, Number2);
	    BorderObject.borderobject(plusbutton2);
		Thread.sleep(1000);
	
	    WebElement plusbutton3=driver.findElement(By.xpath("//p[text()='(Below 2 yrs)']/following-sibling::div/child::span[3]"));
	    TravellersLoop.travelLoop(plusbutton3, Number3);
	    BorderObject.borderobject(plusbutton3);
	    
		Thread.sleep(1000);
		
	    List<WebElement> travelclasslist=driver.findElements(By.xpath("//ul[@class='sc-12foipm-45 caZeZT']/child::li"));
	    LoopForAll.loopsForAll(travelclasslist,value);

		Thread.sleep(1000);
		
	    WebElement done=driver.findElement(By.xpath("//a[text()='Done']"));
	    WebClass.clickElement(done);
	    BorderObject.borderobject(done);
		Thread.sleep(1000);
	
	    List<WebElement>catagoryList=driver.findElements(By.xpath("//div[@class='sc-12foipm-90 dwAjmT marginL10']"));
	    LoopForAll.loopsForAll(catagoryList,catagoryvalue);

		Thread.sleep(1000);
		    
	    WebElement serch=driver.findElement(By.xpath("//span[text()='SEARCH FLIGHTS']"));
	    WebClass.clickElement(serch);
	    BorderObject.borderobject(serch);

	}

}
