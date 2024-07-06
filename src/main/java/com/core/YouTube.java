package com.core;

import org.openqa.selenium.chrome.ChromeDriver;

public class YouTube {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver" , ".//drivers//chromedriver.exe");
		ChromeDriver driver =new ChromeDriver();
driver.get("https://www.youtube.com/");
System.out.println(driver.getTitle());
System.out.println(driver.getCurrentUrl());
	}

}
