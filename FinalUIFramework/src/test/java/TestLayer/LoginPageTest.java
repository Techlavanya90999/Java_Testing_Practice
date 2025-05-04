package TestLayer;

import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import com.beust.jcommander.Parameters;

import BaseLayer.BaseClass;
import PageLayer.LoginPage;

public class LoginPageTest extends BaseClass {

	@Parameters("browsername")
	@BeforeTest
	public void setUp(String browsername) throws Exception {

		BaseClass.initialization(browsername);
	}

	@Test
	public void validateLoginFunctionality() {
		LoginPage login = new LoginPage();
		login.loginFunctionality("prafulp1010@gmail.com", "Pr@ful0812");
	}

	@AfterTest
	public void tearDown() {
		getDriver().quit();
	}


}
