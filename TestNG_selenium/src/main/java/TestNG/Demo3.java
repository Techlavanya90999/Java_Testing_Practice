package TestNG;

import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class Demo3 {
	@BeforeMethod
	public void setUp() {
		System.out.println("Before Method");
	}

	@AfterMethod
	public void tearDown() {
		System.out.println("After Method");
		System.out.println("----------------------------");
	}

	@Test
	public void testcase1() {
		System.out.println("Test Cases 1");
	}

	@Test
	public void testcase2() {
		System.out.println("Test Cases 2");
	}

	@Test
	public void testcase3() {
		System.out.println("Test Cases 3");
	}
}
