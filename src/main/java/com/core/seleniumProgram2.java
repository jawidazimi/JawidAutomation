package com.core;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

public class seleniumProgram2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver", ".//drivers//chromedriver.exe");
		ChromeDriver driver=new ChromeDriver();
		driver.get("www.walmart.com/");
		driver.getTitle();
		driver.manage().window().maximize();
		driver.findElement(By.id("react-aria-1")).sendKeys("Ahmad");
		driver.findElement(By.className("email")).sendKeys("Nancy");
		driver.findElement(By.id("login")).sendKeys("Ajmal");
		

	}

}
