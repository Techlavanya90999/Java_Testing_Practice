package UtilityLayer;

import org.openqa.selenium.WebElement;

import baseLayer.BaseClass;

public class TravellersLoop extends BaseClass {
public void travellerloop(WebElement wb,int value) {
	for(int i=0; i<value; i++)
	{
		WebClass.clickElement(wb);
	}
}

}
