package com.org;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class DropDownFacebook {

	private static final WebElement Gender = null;

	public static void main(String[] args) throws InterruptedException {
		
		System.setProperty("webdriver.chrome.driver", ".//drivers//chromedriver.exe");
		ChromeDriver driver=new ChromeDriver();
		driver.get("https://www.facebook.com/");
		driver.getTitle();
		driver.manage().window().maximize();
		Thread.sleep(5000);
		WebElement button = driver.findElement(By.xpath("//a[text()='Create new account']"));
		button.click();
		Thread.sleep(8000);
		WebElement month = driver.findElement(By.xpath("//select[@id='month']"));
		Select s=new Select(month);
		s.selectByValue("4");
	
        
	}

	
	}


