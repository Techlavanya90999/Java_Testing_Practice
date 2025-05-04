package TestLayer;

import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

import BaseLayer.BaseClass;
import PageLayer.ContactPage;
import PageLayer.HomePage;
import UtilityLayer.ExcelReaderPage;

public class ContactPageTest extends BaseClass {
	ContactPage contactPage;

	@Test(dataProvider = "contactTestData")
	public void validateCreatedContact(String FirstName, String LastName, String Email, String status)
			throws InterruptedException {
		Thread.sleep(5000);
		HomePage homePage = new HomePage();
		homePage.clickOnContactLink();

		contactPage = new ContactPage();
		contactPage.createContact(FirstName, LastName, Email, status);

	}

	@DataProvider(name = "contactTestData")
	public Object[][] getTestData() throws Exception {
		String path = System.getProperty("user.dir") + "//src//main//java//TestData//Cogmento Test Data.xlsx";

		ExcelReaderPage excel = new ExcelReaderPage(path, "ContactPage");

		return excel.getallTestData(0, 4);

	}



}
