package com.ng;

import org.testng.annotations.Test;

public class FruitsTest {

	@Test(priority=2)
	public void mango()
	{
		System.out.println("Mango fruit");
	}
	
	@Test(priority=1)
	public void grapes()
	{
		System.out.println("Grapes fruit");
	}
	
	@Test(priority=3)
	public void banana()
	{
		System.out.println("Banana Fruit");
	}
}
