package com.org;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

public class SelenumProgram1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		System.setProperty("webdriver.chrome.driver",".//drivers//chromedriver.exe");
		ChromeDriver driver=new ChromeDriver();
		driver.get ("https://www.facebook.com/");
		driver.manage().window().maximize();
		System.out.println(driver.getTitle());
		System.out.println(driver.getCurrentUrl());
		driver.findElement(By.id("email")).sendKeys("Ahmad");
		driver.findElement(By.name("pass")).sendKeys("Walid");
		driver.findElement(By.name("login")).click();
        //driver.findElement(By.phone("phone")).sendkeys("Ali");
       // driver.findElement(By.value("male")).sendkeys("Tom");

	}

}
