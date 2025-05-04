package testLayer;

import java.io.IOException;

import UtilityLayer.Takess;
import baseLayer.BaseClass;

public class SearchFlightTest extends BaseClass{

	public static void main(String[] args) throws InterruptedException, IOException {
BaseClass.intialization();
		
		SearchFlight srchflight=new SearchFlight();
		
		srchflight.serchflights("pune","delhi","March 2025","15",4,2,2,"economy","Student");
		
		Takess.takesScreenshot();
		
		Thread.sleep(5000);
		
		
		driver.quit();

	}

}
