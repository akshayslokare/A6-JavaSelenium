package org.automation.WebElementMethods;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class UsingClearMethodInDWS 
{
	public static void main(String[] args) throws InterruptedException 
	{
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.facebook.com");
		WebElement value = driver.switchTo().activeElement();
		value.sendKeys("akshayslokare@gmail.com");
		Thread.sleep(2000);
		value.clear();
		value.sendKeys("lokareakshay76@gmail.com");
			
		
	}

}
