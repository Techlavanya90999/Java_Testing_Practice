package TestLayer;

import org.testng.annotations.Test;

import com.aventstack.extentreports.util.Assert;

import BaseLayer.BaseClass;
import PageLayer.HomePage;

public class HomeTestPage extends BaseClass {
	private HomePage homePage;

	@Test(priority = 1)
	public void validateLogo() {
		homePage = new HomePage();
		boolean actualLogo = homePage.checkLogoStatus();
		Assert.assertEquals(actualLogo, true);
	}

	@Test(priority = 2)
	public void clickOnContacts() {
		homePage.clickOnContactLink();
	}


}
