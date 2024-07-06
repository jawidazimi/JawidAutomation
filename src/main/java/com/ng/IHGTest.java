package com.ng;

import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class IHGTest {
   
	
	@Test
	public void IHG ()
	{
	   System.setProperty("webdriver.chrome.driver" ,  ".//chrome driver=new chrome driver=ChromeDriver.exe");
	   ChromeDriver driver=new ChromeDriver();
	   driver.get("https://www.IHG.com/");
	   driver.manage().window().maximize();
	   System.out.println(driver.getTitle());
	   System.out.println(driver.getCurrentUrl());
	

	}
	
}
