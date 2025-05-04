package utilitylayer;

import java.util.List;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;

import baselayer.baseclass;

public class UtilsClass extends baseclass {

	public static void handleRadioButton(List<WebElement> genderValues, String gender)
	{
		Actions act = new Actions(driver);
		for(WebElement gen:genderValues)
		{
			String value = gen.getAttribute("value");
			if(value.contains(gender))
			{
				act.click(gen).perform();
				break;
			}
		}
	}
}
