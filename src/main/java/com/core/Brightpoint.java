package com.core;

import org.openqa.selenium.chrome.ChromeDriver;

public class Brightpoint {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver/", ".//drivers//chromedriver.exe");
		ChromeDriver driver=new ChromeDriver();
		driver.get("https://www.brightpoint.com/ ");
		driver.manage().window().maximize();
		System.out.println(driver.getTitle());
		System.out.println(driver.getTitle());
		
	}

}
