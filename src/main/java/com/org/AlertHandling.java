package com.org;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class AlertHandling {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
System.setProperty("webdriver.chrome.driver", ".//drivers//chromedriver.exe");
ChromeDriver driver=new ChromeDriver();
driver.get("https://demo.automationtesting.in/Alerts.html");
driver.manage().window().maximize();
Thread.sleep(4000);
System.out.println(driver.getCurrentUrl());
WebElement button1 = driver.findElement(By.xpath("//button[text()[contains(.,'click the button to display an  alert box:')]]"));
button1.click();
Alert abc = driver.switchTo().alert();
abc.accept();
Thread.sleep(3000);
WebElement bb = driver.findElement(By.xpath("//a[text()[contains(.,'Alert with OK & Cancel')]]"));
bb.click();
Thread.sleep(3000);
WebElement button2 = driver.findElement(By.xpath("//button[text()[contains(.,'click the button to display a confirm box')]]"));
button2.click();
abc.accept();

WebElement bc = driver.findElement(By.xpath("//a[text()[contains(.,'Alert with Textbox')]]"));
bc.click();
Thread.sleep(3000);
WebElement button3 = driver.findElement(By.xpath("//button[text()[contains(.,'click the button to demonstrate the prompt box')]]"));
button3.click();
abc.sendKeys("ramarao");
abc.accept();
	
	}

}
