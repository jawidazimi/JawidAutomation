package com.all;

import java.io.File;
import java.io.IOException;
import java.util.Random;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class OrangeHRMImagesTest {
	public static int i=0;
	public static ChromeDriver driver;
	@Test
	public void hrm() throws InterruptedException, IOException
	{
		System.setProperty("webdriver.chrome.driver", ".//drivers//chromedriver.exe");
		driver=new ChromeDriver();
		OrangeHRMImagesTest hrm=new OrangeHRMImagesTest();
		driver.get("https://opensource-demo.orangehrmlive.com/web/index.php/auth/login");
		driver.manage().window().maximize();
		String parent = driver.getWindowHandle();
		hrm.snap();
		System.out.println(parent);
		Thread.sleep(5000);
		driver.findElement(By.xpath("//input[@name='username']")).sendKeys("Admin");
		hrm.snap();
		driver.findElement(By.xpath("//input[@name='password']")).sendKeys("admin123");
		hrm.snap();
	}
	
	public void snap() throws IOException
	{
		Random r=new Random();
		if(r.nextInt()!=0)
		{
			i=i+1;
		}
		File src=driver.getScreenshotAs(OutputType.FILE);
		File dest=new File(".//images//pic"+i+".png");
		FileUtils.copyFile(src, dest);
	}

}
