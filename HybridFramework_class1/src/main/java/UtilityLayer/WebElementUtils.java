package UtilityLayer;

import java.util.List;

import org.openqa.selenium.WebElement;

import BaseLayer.BaseClass;


public class WebElementUtils extends BaseClass {

	
	public static void sendKeys(WebElement wb, String value)
	{
		if(wb.isDisplayed() && wb.isEnabled())
		{
			wb.sendKeys(value);
		}
	}
	
	public static void click(WebElement wb)
	{
		if(wb.isDisplayed() && wb.isEnabled())
		{
			wb.click();
		}
	}
	
	public static void handleRadioButton(List<WebElement> list,String value)
	{
	
		for(WebElement wb: list)
		{
			String actualValue = wb.getText();
			
			if(actualValue.trim().equalsIgnoreCase(value))
			{
				WebElementUtils.click(wb);
			}
		}
		
	}
	
	
	
	
	
	
	
}