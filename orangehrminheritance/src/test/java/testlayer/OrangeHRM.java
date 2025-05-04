package testlayer;

import baselayer.BaseClass;
import pagelayer.HomePage;
import pagelayer.LoginPage;
import pagelayer.PIMPage;

public class OrangeHRM extends BaseClass {
	public static void main(String[] args) throws InterruptedException
	{
		BaseClass.initialization();
		HomePage obj = new HomePage();
		obj.homepage();
		LoginPage.Login("Admin", "admin123");
		PIMPage obj1 = new PIMPage();
		obj1.addEmployee();
		obj1.addEmpDetails("Aarti", "Tanaji", "Chaudhari");
		String id = obj1.retriveEmpId("India", "Female", "Pune");
		obj1.searchDeleteEmpl(id);
		
	}

}
