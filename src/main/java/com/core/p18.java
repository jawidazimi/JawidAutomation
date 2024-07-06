package com.core;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class p18 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
System.setProperty("webdriver.chrome.driver",".//drivers//chromedriver.exe");
ChromeDriver driver=new ChromeDriver();
//driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);

driver.get("https://opensource-demo.orangehrmlive.com/index.php/dashboard");
driver.manage().window().maximize();
System.out.println(driver.getCurrentUrl());
System.out.println(driver.getTitle());
JavascriptExecutor js=(JavascriptExecutor)driver;
//js.executeScript("documrny.getElementById('txtUsername').value'ramarao';");
WebElement user=driver.findElement(By.xpath("//input@id='textUsername';"));
js.executeScript("arguments[0].value='ramaro';" ,user);
js.executeScript("document.getElementById('txtpassword').value=ramarao';");
	}

}
