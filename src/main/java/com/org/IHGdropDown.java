package com.org;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class IHGdropDown {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		
		System.setProperty("webdriver.chrome.driver",   ".//drivers//chromedriver.exe");
	    ChromeDriver driver=new ChromeDriver();
	    driver.get("https://www.ihg.com/rewardsclub/us/en/enrollment/join ");
	    driver.getTitle();
	    driver.manage().window().maximize();
	    Thread.sleep(5000);
        WebElement country=driver.findElement(By.xpath("//select[@id='country']"));
        Select s=new Select(country);
      //  s.selectByIndex(3);
       // s.selectByValue("AL");
        	s.selectByVisibleText("Argentina");	

	}
	
	}

