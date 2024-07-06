package com.core;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class ActionProgram1 {

	private static final WebElement WebElement = null;

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
System.setProperty("webdriver.chrome.driver", ".//drivers//chromedriver.exe");
ChromeDriver driver=new ChromeDriver();
driver.get("https://demo.guru99.com/test/simple_context_menu.html");
driver.manage().window().maximize();
Thread.sleep(6000);
WebElement button2 = driver.findElement(By.xpath("//button [text()= 'Double-Click Me To See Alert']"));
Actions a=new Actions(driver);
a.doubleClick(button2).build().perform();
Alert at= driver.switchTo().alert();
at.accept();

 WebElement button1= driver.findElement(By.xpath("//span[text()='right click me']"));
a.contextClick(button1).build().perform();


	
	}

}
