package com.core;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

public class SeleniumFacebook {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrom.driver",".//driver//chrome.driver.exe");
		ChromeDriver driver=new ChromeDriver();
		driver.get("www.facebook.com/");
		driver.getTitle();
	driver.manage().window().maximize();
	driver.findElement(By.linkText("Forgoton Password"));
	//input[@name='email']
	//input[@id='email']
		

	}

}