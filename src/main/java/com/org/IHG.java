package com.org;

import org.openqa.selenium.chrome.ChromeDriver;

public class IHG {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
System.setProperty("webdriver.chrome.driver" ,  ".//chrome driver=new chrome driver=ChromeDriver.exe");
ChromeDriver driver=new ChromeDriver();
driver.get("https://www.IHG.com/");
driver.manage().window().maximize();
System.out.println(driver.getTitle());
System.out.println(driver.getCurrentUrl());



	}

}
