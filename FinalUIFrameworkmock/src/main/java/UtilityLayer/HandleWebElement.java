package UtilityLayer;

import java.time.Duration;
import java.util.List;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import BaseLayer.BaseClass;

public class HandleWebElement extends BaseClass {
	public static WebElement visibilityOfWebElement(WebElement wb) {
		WebDriverWait wait = new WebDriverWait(getDriver(), Duration.ofSeconds(30));

		return wait.until(ExpectedConditions.visibilityOf(wb));
	}

	public static WebElement elementIsClickable(WebElement wb) {

		WebDriverWait wait = new WebDriverWait(getDriver(), Duration.ofSeconds(30));

		return wait.until(ExpectedConditions.elementToBeClickable(wb));
	}

	public static List<WebElement> allElementIsVisible(List<WebElement> list) {
		WebDriverWait wait = new WebDriverWait(getDriver(), Duration.ofSeconds(30));

		return wait.until(ExpectedConditions.visibilityOfAllElements(list));
	}

	public static void click(WebElement wb) {
		elementIsClickable(wb).click();
	}

	public static void clear(WebElement wb) {
		elementIsClickable(wb).clear();
	}

	public static void sendKeys(WebElement wb, String Value) {
		elementIsClickable(wb).sendKeys(Value);
	}

	public static void getAttribute(WebElement wb, String Value) {
		elementIsClickable(wb).getAttribute(Value);
	}

	public static void getText(WebElement wb) {
		elementIsClickable(wb).getText();
	}
	public static void submit(WebElement wb) {
		elementIsClickable(wb).submit();
	}
	public static boolean isEnabled(WebElement wb) {
		return elementIsClickable(wb).isEnabled();
	}
	public static boolean isSelected(WebElement wb) {
		return elementIsClickable(wb).isSelected();
	}
	public static String getCssValue(WebElement wb, String Value) {
		return visibilityOfWebElement(wb).getCssValue(Value);
	}
}

