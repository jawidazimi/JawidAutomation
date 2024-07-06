package com.all;

import java.io.File;
import java.io.IOException;
import java.util.Random;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.Test;

import com.relevantcodes.extentreports.ExtentReports;
import com.relevantcodes.extentreports.ExtentTest;
import com.relevantcodes.extentreports.LogStatus;

public class HRMReports {
	public static int i=0;
	public static ChromeDriver driver;
	public static ExtentReports report;
	public static ExtentTest test;
	
	@BeforeSuite
	public void begin()
	{
		report=new ExtentReports(".//reports//JawidReport.html",true);
		test=report.startTest("Verify user is able to login OrangeHRM ");
	}
	
	@Test
	public void hrm() throws InterruptedException, IOException
	{
		System.setProperty("webdriver.chrome.driver", ".//drivers//chromedriver.exe");
		driver=new ChromeDriver();
		OrangeHRMImagesTest hrm=new OrangeHRMImagesTest();
		driver.get("https://opensource-demo.orangehrmlive.com/web/index.php/auth/login");
		driver.manage().window().maximize();
		String parent = driver.getWindowHandle();
		
		System.out.println(parent);
		Thread.sleep(5000);
		driver.findElement(By.xpath("//input[@name='username']")).sendKeys("Admin");
		test.log(LogStatus.PASS, "EnteredUserName:"+test.addScreenCapture(snap()));
		driver.findElement(By.xpath("//input[@name='password']")).sendKeys("admin123");
		test.log(LogStatus.PASS, "Entered Password:"+test.addScreenCapture(snap()));
		
	}
	
	public static String snap() throws IOException
	{
		Random r=new Random();
		String dummy="";
		if(r.nextInt()!=0)
		{
			i=i+1;
		}
		File src=driver.getScreenshotAs(OutputType.FILE);
		File dest=new File(".//images//pic"+i+".png");
		FileUtils.copyFile(src, dest);
		return dummy=dest.getAbsolutePath();
	}
	
	@AfterSuite()
	public void last()
	{
		report.endTest(test);
		report.flush();
	}
}
