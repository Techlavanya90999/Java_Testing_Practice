package UtilityLayer;

import java.util.List;

import org.openqa.selenium.WebElement;

import BaseLayer.BaseClass;

public class UtilsClass extends BaseClass {
	public static void radioButton(List<WebElement> lists, String expectecValue) {

		for (WebElement wb : WebElementHelperClass.visibilityOfAllElements(lists)) {
			String actualValue = wb.getText();

			if (actualValue.equalsIgnoreCase(expectecValue)) {
				WebElementHelperClass.click(wb);
				break;
			}
		}
	}

}
