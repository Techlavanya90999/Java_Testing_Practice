package UtilityLayer;

import java.io.File;
import java.io.IOException;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;

import baseLayer.BaseClass;

public class Takess extends BaseClass {
public void takess() throws IOException {
	TakesScreenshot ts= (TakesScreenshot)driver;
	
	File src=ts.getScreenshotAs(OutputType.FILE);
	
	File dest=new File("C:\\Users\\Dell\\OneDrive\\Desktop\\sss\\goss.png");
	
	FileUtils.copyFile(src, dest);
}

}

