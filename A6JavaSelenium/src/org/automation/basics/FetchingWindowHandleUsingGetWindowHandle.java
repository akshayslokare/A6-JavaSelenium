package org.automation.basics;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class FetchingWindowHandleUsingGetWindowHandle 
{
	public static void main(String[] args) 
	{
		WebDriver driver=new ChromeDriver();
		driver.get("www.zomato.com/");
		String windowsId = driver.getWindowHandle();
		System.out.println(windowsId);
		
	}

}
