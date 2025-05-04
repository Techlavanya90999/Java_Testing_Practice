package UtilityLayer;

import java.util.List;

import org.openqa.selenium.WebElement;

import baseLayer.BaseClass;

public class Calender extends BaseClass{
public void handelCalendarmonth_year(WebElement wb,String value,WebElement nxtbutton) {
	while(true)
	 {	 
		 String name = wb.getText();

	if(name.contains(value))
	{
		break;
	}
	else
	{
		WebClass.clickElement(nxtbutton);
	}
	

}
}

//for date method

public static void handlecalendardate(List<WebElement>dlist,String value)
{
	for(WebElement dd:dlist)
	{
		String date=dd.getText();
	
		if(date.contains(value))
		{
			WebClass.clickElement(dd);
			break;
		}
	}
	
}

}
