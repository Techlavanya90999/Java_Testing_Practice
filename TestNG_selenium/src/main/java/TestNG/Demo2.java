package TestNG;

import org.testng.annotations.Ignore;
import org.testng.annotations.Test;

public class Demo2 {
	@Test(priority=1)
	public void Contact()
	{
		System.out.println("Contact Tc");
	}
	@Test(priority=1)
	public void ABC()
	{
		System.out.println("ABC");
	}
	@Test(timeOut=1000)
	public void LMN()
	{
		System.out.println("LMN");
	}

}
