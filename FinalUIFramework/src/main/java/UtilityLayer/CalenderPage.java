package UtilityLayer;

import java.util.List;

import org.openqa.selenium.WebElement;

import BaseLayer.BaseClass;

public class CalenderPage extends BaseClass {

	public static void selectMonthAndYear(WebElement wb, String expectedValue, WebElement next) {

		while (true) {
			String actualValue = wb.getText();

			if (actualValue.equalsIgnoreCase(expectedValue)) {
				break;
			} else {
				WebElementHelperClass.click(next);
			}
		}

	}

	public static void selectDate(List<WebElement> list, String expectedDate) {

		for (WebElement wb : WebElementHelperClass.visibilityOfAllElements(list)) {
			String actualDate = wb.getText();

			if (actualDate.equalsIgnoreCase(expectedDate)) {
				WebElementHelperClass.click(wb);
				break;
			}

		}

	}


}
