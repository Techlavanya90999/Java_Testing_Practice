package Practice;

import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class Demo1 {

	@BeforeMethod
	public void setup()
	{
			System.out.println("Before Method");
	}

	@Test
	public void login()
	{
			System.out.println("login TC");
	}

	@Test
	public void home()
	{
			System.out.println("home TC");
	}

	@Test
	public void admin()
	{
			System.out.println("home TC");
	}

	@AfterMethod
	public void tearDown()
	{
			System.out.println("After Method ");
	}
	

	

}
