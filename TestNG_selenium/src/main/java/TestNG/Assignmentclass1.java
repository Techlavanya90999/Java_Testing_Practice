package TestNG;

import org.testng.annotations.Ignore;
import org.testng.annotations.Test;

public class Assignmentclass1 {
	@Test(invocationCount=5)
	public void abc()
	{
		System.out.println("abc");
	}
	@Test(priority=-1)
	public void pqr()
	{
		System.out.println("pqr");
	}
	@Ignore
	public void xyz()
	{
		System.out.println("xyz");
	}
	@Test(enabled=false)
	public void std()
	{
		System.out.println("std");
	}
	@Test(expectedExceptions=NullPointerException.class)
	public void lmd()
	{
        String a=null;
		
		System.out.println(a.length());//NullPointerException
		
		System.out.println("lmd TC");//2
	}

}
