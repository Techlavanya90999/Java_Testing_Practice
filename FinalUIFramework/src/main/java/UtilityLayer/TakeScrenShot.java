package UtilityLayer;

import java.io.File;
import java.io.IOException;

import org.apache.commons.io.FileUtils;
import org.apache.poi.hwpf.usermodel.DateAndTime;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;

import BaseLayer.BaseClass;

public class TakeScrenShot extends BaseClass{
	public static String captureScreenshot(String folderName, String tcnanme) {

		TakesScreenshot ts = (TakesScreenshot) getDriver();

		File src = ts.getScreenshotAs(OutputType.FILE);

		String path = System.getProperty("user.dir") + "//screenshot//" + DateAndTime.getYear() + "//"
				+ DateAndTime.getMonthYear() + "//" + DateAndTime.getDateMonthYear() + "//" + folderName + "//"
				+ tcnanme + DateAndTime.getDateTime() + ".png";

		File dest = new File(path);

		try {
			FileUtils.copyFile(src, dest);
		} catch (IOException e) {
			e.printStackTrace();
		}

		return path;
	}

}
