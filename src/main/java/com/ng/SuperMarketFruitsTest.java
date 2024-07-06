package com.ng;

import org.testng.annotations.Test;

public class SuperMarketFruitsTest {
	@Test(dependsOnMethods= {"grapes"})
	public void mango()
	{
		System.out.println("Mango fruit");
	}
	
	@Test()
	public void grapes()
	{
		System.out.println("Grapes fruit");
	}
	
	@Test(dependsOnMethods= {"mango"})
	public void banana()
	{
		System.out.println("Banana Fruit");
	}
}
