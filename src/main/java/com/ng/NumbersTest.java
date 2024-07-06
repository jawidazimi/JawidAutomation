package com.ng;

import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class NumbersTest {
    @Test
	public void one()
	{
		System.out.println("one number method");
	}
	@AfterMethod
	public void two()
	{
		System.out.println("two number method");
	}
	@BeforeMethod
	public void three()
	{
		System.out.println("Three number method");
	}
	@AfterClass
	public void Four()
	{
		System.out.println("Four number method");
	}
	@BeforeClass
	public void Five()
	{
		System.out.println("Five number method");
	}
	@AfterTest
	public void six()
	{
		System.out.println("six number method");
	}
	@BeforeTest
	public void seven()
	{
		System.out.println("seven number method");
	}
	@AfterSuite
	public void Eight()
	{
		System.out.println("Eight number method");
	}
	@BeforeSuite
	public void Nine()
	{
		System.out.println("Nine number method");
	}
			
		
}


