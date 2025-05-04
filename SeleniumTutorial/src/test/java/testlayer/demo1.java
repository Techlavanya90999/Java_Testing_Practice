package testlayer;

import baselayer.baseclass;
import pagelayer.homepage;
import pagelayer.loginpage;
import pagelayer.pimpage;

public class demo1 extends baseclass {
	public static void main(String[] args) throws InterruptedException
	{
		{
			baseclass.initialization();
			homepage obj = new homepage();
			obj.homepage();
			loginpage.login("Admin", "admin123");
			pimpage obj1 = new pimpage();
			obj1.addemployee();
			obj1.addempdetails("Lavanya", "Mayuresh", "Devanpalli");
			String id = obj1.retriveEmpId("India", "Female", "Pune");
			obj1.searchDeleteEmpl(id);
		}
	}

}
