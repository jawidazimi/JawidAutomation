package com.org;

import java.awt.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class WebTableConcept {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
System.setProperty("webdrivers.chrome.drivers", ".//drivers//chromedrivers.exe");
ChromeDriver driver=new chromedriver();
driver.get("www.facebook.com");
driver.getTitle();
driver.manage().window().maximize();
WebElement table=driver.findElement(By.xpath("//table[@id='webtable']"));
//List rows=(List) table.findElements(By.tagName("td");


}
}
