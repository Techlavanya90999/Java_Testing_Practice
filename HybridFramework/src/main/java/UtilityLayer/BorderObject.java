package UtilityLayer;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebElement;

import baseLayer.BaseClass;

public class BorderObject extends BaseClass {

	public static void borderobject(WebElement wb){
JavascriptExecutor js=(JavascriptExecutor)driver;
		
		js.executeScript("arguments[0].style.border='3px solid purple';",wb);
	}

}
