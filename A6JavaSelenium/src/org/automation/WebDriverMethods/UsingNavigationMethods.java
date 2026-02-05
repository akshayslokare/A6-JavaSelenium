package org.automation.WebDriverMethods;

import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.WebDriver;

public class UsingNavigationMethods 
{
	public static void main(String[] args) throws InterruptedException 
	{
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.flipkart.com");
		driver.get("https://www.zeptonow.com");
		Thread.sleep(2000);
		//navigate back flipkart
		driver.navigate().back();
		Thread.sleep(2000);
		//navigate forward zepto
		driver.navigate().forward();
		Thread.sleep(2000);
		//reload & refresh
		driver.navigate().refresh();
		
		
		
	}

}
