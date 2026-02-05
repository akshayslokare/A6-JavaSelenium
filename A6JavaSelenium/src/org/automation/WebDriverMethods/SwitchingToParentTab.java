package org.automation.WebDriverMethods;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WindowType;
import org.openqa.selenium.chrome.ChromeDriver;

public class SwitchingToParentTab 
{
	public static void main(String[] args) 
	{
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.fossil.com/");
		//capturing the window id or handle of parent or main tab
		String ParentWindowID=driver.getWindowHandle();
		System.out.println("Parent Window ID :"+ParentWindowID);
		
		driver.switchTo().newWindow(WindowType.TAB);
		driver.get("https://www.titan.co.in/");
		driver.switchTo().newWindow(WindowType.WINDOW);
		driver.get("https://www.rolex.com/");
		
		//switching to parent tab using the parent tabs window id
		driver.switchTo().window(ParentWindowID);
		
		
	}

}
