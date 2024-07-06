package com.org;

import java.util.Iterator;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

public class OrangeHrmWindow {

	public static String parent,fbicon,licon,yicon,ticon;
	public static Set<String> all;
	public static Iterator<String> it;
	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
System.setProperty("webdriver.chrome.driver", ".//drivers//chromedriver.exe");
ChromeDriver driver=new ChromeDriver();
driver.get("https://opensource-demo.orangehrmlive.com/web/index.php/auth/login");
driver.manage().window().maximize();
String parent = driver.getWindowHandle();
System.out.println(parent);
Thread.sleep(5000);
driver.findElement(By.xpath("//input[@name='username']")).sendKeys("Admin");
driver.findElement(By.xpath("//input[@name='password']")).sendKeys("admin123");
Thread.sleep(6000);
driver.findElement(By.xpath("(//a[@target='_blank'])[2]")).click();
System.out.println(driver.getTitle());
 all = driver.getWindowHandles();
it = all.iterator();
while(it.hasNext())
{
	fbicon = it.next();
	if(!parent.equals(fbicon))
	{
		driver.switchTo().window(fbicon);
	}
}
System.out.println(driver.getTitle());
Thread.sleep(5000);
driver.findElement(By.xpath("//input[@name='email']")).sendKeys("fbuser");
driver.switchTo().window(parent);
driver.findElement(By.xpath("(//a[@target='_blank'])[1]")).click();
System.out.println(driver.getTitle());// orange hrm window title
all = driver.getWindowHandles();
it = all.iterator();
while(it.hasNext())
{
	licon = it.next();
	if(!parent.equals(licon))
	{
		driver.switchTo().window(licon);
	}
}
System.out.println(driver.getTitle()); //linkedIn window title
driver.switchTo().window(fbicon);
System.out.println(driver.getTitle());


	}

}
