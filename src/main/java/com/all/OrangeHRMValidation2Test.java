package com.all;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;

public class OrangeHRMValidation2Test {

	@Test
	public void hrm() throws InterruptedException
	{
		System.setProperty("webdriver.chrome.driver", ".//drivers//chromedriver.exe");
		ChromeDriver driver=new ChromeDriver();
		OrangeHRMImagesTest hrm=new OrangeHRMImagesTest();
		driver.get("https://opensource-demo.orangehrmlive.com/web/index.php/auth/login");
		driver.manage().window().maximize();
		String exp="https://opensource-demo.orangehrmlive.com/web/index.php/auth/log";
		String act = driver.getCurrentUrl();
		Thread.sleep(5000);
		SoftAssert sa=new SoftAssert();
		sa.assertTrue(exp.equals(act));
		driver.findElement(By.xpath("//input[@name='username']")).sendKeys("Admin");
		driver.findElement(By.xpath("//input[@name='password']")).sendKeys("admin123");
	}
}
