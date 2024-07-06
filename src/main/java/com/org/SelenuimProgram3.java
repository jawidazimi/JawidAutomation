package com.org;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

public class SelenuimProgram3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
System.setProperty("webdriver.chrom.driver", ".//drivers//chrome.driver.exe");
ChromeDriver driver=new ChromeDriver();
driver.get("https://www.orangehrm.com/");
driver.getTitle();
driver.manage().window().maximize();
driver.findElement(By.id("firstname")).sendKeys("Bob");
driver.findElement(By.id("Lastname")).sendKeys("David");
driver.findElement(By.id("Email")).sendKeys("Jawid");
driver.findElement(By.id("Password")).sendKeys("John");
driver.findElement(By.id("confirmpassword")).sendKeys("Ali");
driver.findElement(By.id("Address1")).sendKeys("Peter");
driver.findElement(By.id("Address2")).sendKeys("Tom");
driver.findElement(By.id("City")).sendKeys("Masoud");
driver.findElement(By.id("state")).sendKeys("Mirwais");
driver.findElement(By.id("zipcode")).sendKeys("Basit");
		
		
	}

}
