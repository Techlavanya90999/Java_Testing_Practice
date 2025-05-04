package UtilityLayer;

import java.time.Duration;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.FluentWait;

import com.google.common.base.Function;

import BaseLayer.BaseClass;

public class WaitHelperClass {
	public class WaitHelper extends BaseClass {

		// Fluent wait

		public static WebElement fluentWait(WebElement wb) {
			FluentWait<WebDriver> wait = new FluentWait<WebDriver>(getDriver()).withTimeout(Duration.ofSeconds(30))
					.pollingEvery(Duration.ofSeconds(5)).ignoring(Exception.class);

			return wait.until(new Function<WebDriver, WebElement>() {

				public WebElement apply(WebDriver driver) {
					return wb;
				}
			});
		}
	}
}


