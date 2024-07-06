package com.core;

import org.openqa.selenium.chrome.ChromeDriver;

public class Roblox {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver", "//drivers//chromdriver.exe");
		ChromeDriver driver=new ChromeDriver();
		driver.get("https://www.roblox.com/home");
		driver.manage().window().maximize();
		System.out.println(driver.getCurrentUrl());
		System.out.println(driver.getTitle());

	}

}
