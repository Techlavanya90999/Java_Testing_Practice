package UtilityLayer;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;

import baseLayer.BaseClass;

public class WebClass extends BaseClass{
public void webclass(WebElement wb) {
	Actions act=new Actions(driver);
	
	if(wb.isDisplayed() && wb.isEnabled())
	{

		act.click(wb).perform();
		
	}
	
}

public static void sendKeys(WebElement wb, String value)
{
	Actions act= new Actions(driver);
	
	wb.sendKeys(value);
	

}
}
