package com.core;

import org.openqa.selenium.chrome.ChromeDriver;

public class Instagram {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver", ".//drivers//chromedriver.exe");
		ChromeDriver Driver=new ChromeDriver();
		Driver.get("https://www.instagram.com");
		Driver.manage().window().maximize();
	
	}

}
