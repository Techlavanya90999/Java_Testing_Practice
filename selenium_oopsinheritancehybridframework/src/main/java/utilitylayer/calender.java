package utilitylayer;

import java.util.List;

import org.openqa.selenium.WebElement;

import baselayer.baseclass;

public class calender extends baseclass {

	public static void calendar(List<WebElement> listYear,String Year)
	{
		//date.click();
		//year.click();
		for(WebElement yr:listYear)
		{
			String value = yr.getText();
			if(value.contains(Year))
			{
				yr.click();
				break;
			}
		}
		
		
		
	}
	
	public static void calendarMonth(List<WebElement> listMonth,String Month)
	{
		//date.click();
		//year.click();
		for(WebElement yr:listMonth)
		{
			String value = yr.getText();
			if(value.contains(Month))
			{
				yr.click();
				break;
			}
		}
		
		
		
	}

	public static void calendarDate(List<WebElement> listDate,String Date)
	{
		//date.click();
		//year.click();
		for(WebElement yr:listDate)
		{
			String value = yr.getText();
			if(value.contains(Date))
			{
				yr.click();
				break;
			}
		}
		
		
		
	}
	
}