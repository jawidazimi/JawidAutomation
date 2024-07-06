package com.core;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

public class SeleniumProgram4 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver ", " .//drivers//chrome.driver.exe");
		ChromeDriver driver=new ChromeDriver();
		driver.get("www.kroger.com /");
		driver.getTitle();
		driver.manage();
		driver.findElement(By.className("Sign in name")).sendKeys("Wali");
		driver.findElement(By.id("Password")).sendKeys("Qadir");
		driver.findElement(By.id("Forgot password")).sendKeys("Hamid");
		//driver.findElement(By.id("next")).sendKeys("Arian);

	}

}
