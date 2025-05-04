package UtilityLayer;

import java.time.Duration;
import java.util.List;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import BaseLayer.BaseClass;

public class WebElementHelperClass extends BaseClass{
	public static WebElement visibilityOf(WebElement wb) {

		return new WebDriverWait(getDriver(), Duration.ofSeconds(30))
				.until(ExpectedConditions.visibilityOf(WaitHelperClass.fluentWait(wb)));
	}

	public static List<WebElement> visibilityOfAllElements(List<WebElement> lists) {

		return new WebDriverWait(getDriver(), Duration.ofSeconds(30))
				.until(ExpectedConditions.visibilityOfAllElements(lists));
	}

	public static WebElement elementToBeClickable(WebElement wb) {

		return new WebDriverWait(getDriver(), Duration.ofSeconds(30))
				.until(ExpectedConditions.elementToBeClickable(WaitHelper.fluentWait(wb)));
	}

	public static void click(WebElement wb) {
		elementToBeClickable(wb).click();
	}

	public static void sendKeys(WebElement wb, String value) {
		visibilityOf(wb).sendKeys(value);
	}

	public static void clear(WebElement wb) {
		visibilityOf(wb).clear();
	}

	public static String getText(WebElement wb) {
		return visibilityOf(wb).getText();

	}

	public static String getAttribute(WebElement wb, String keyname) {
		return visibilityOf(wb).getAttribute(keyname);
	}

	public static void submit(WebElement wb) {
		elementToBeClickable(wb).submit();
	}

	public static boolean isEnabled(WebElement wb) {
		return visibilityOf(wb).isEnabled();
	}

	public static boolean isSelected(WebElement wb) {
		return visibilityOf(wb).isSelected();
	}

	public static String getCssValue(WebElement wb, String value) {
		return visibilityOf(wb).getCssValue(value);
	}


}
