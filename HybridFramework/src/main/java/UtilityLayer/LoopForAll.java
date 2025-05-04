package UtilityLayer;

import java.util.List;

import org.openqa.selenium.WebElement;

import baseLayer.BaseClass;

public class LoopForAll extends BaseClass  {
public void loopforAll(List<WebElement> list,String value) {
	for(WebElement ll:list)
	{
		String tlist=ll.getText();
	
		if(tlist.contains(value))
		{
			WebClass.clickElement(ll);
		}
	
	
	}
}

}
