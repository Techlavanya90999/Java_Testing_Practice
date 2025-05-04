package utilitylayer;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;

import baselayer.baseclass;

public class HandleDropdownClass extends baseclass {
	public static void handelDropDown(WebElement dist, String district )
	{
		//dist.click();
		Select obj = new Select(dist);
		obj.selectByVisibleText(district);
	}

}
