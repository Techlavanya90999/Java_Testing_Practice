package UtilityLayer;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.Set;

import BaseLayer.BaseClass;

public class WindowHelperClass extends BaseClass {
	public static void handleWindow(Set<String> allSetWindow, int windowIndex) {
		ArrayList<String> allArrayWindow = new ArrayList<String>();

		Iterator<String> it = allSetWindow.iterator();

		while (it.hasNext()) {
			String actualValue = it.next();

			allArrayWindow.add(actualValue);
		}

		getDriver().switchTo().window(allArrayWindow.get(windowIndex));

	}

}
