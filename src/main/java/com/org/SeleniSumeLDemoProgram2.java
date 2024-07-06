package com.org;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

public class SeleniSumeLDemoProgram2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
System.setProperty("webdriver.chrome.driver", ".//drivers//chrome.driver.exe");
ChromeDriver driver=new ChromeDriver();
driver.getTitle();
driver.get("https://www.automationtesting.in/");
	driver.manage().window().maximize();
	System.out.println(driver.getCurrentUrl());
//driver.findElement(By.id("email")).sendkeys("Jawid")
 driver.findElement(By.id("Enterbtn"));
	
	}

}
