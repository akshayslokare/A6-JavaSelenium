package org.automation.WebDriverMethods;

import java.util.Set;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WindowType;
import org.openqa.selenium.chrome.ChromeDriver;

public class SwitchingToPerticularTab 
{
	public static void main(String[] args) throws InterruptedException 
	{
		String ExpectedURL="https://www.rolex.com/";
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.fossil.com/");
		
		driver.switchTo().newWindow(WindowType.TAB);
		driver.get("https://www.titan.co.in/");
		driver.switchTo().newWindow(WindowType.WINDOW);
		driver.get("https://www.rolex.com/");
		driver.switchTo().newWindow(WindowType.WINDOW);
		driver.get("https://jokerandwitch.com/");
		
		//---------------------------------------------
		//capturing window id's or handles of all the tab
		Set<String> allWindowIDs=driver.getWindowHandles();
		System.out.println(allWindowIDs);
		// Loop through each window ID one by one
		for(String windowID : allWindowIDs) 
		{
			driver.switchTo().window(windowID);
			Thread.sleep(2000);
			String actualURL =driver.getCurrentUrl();
			//condition to break the loop and stop switching
			if(ExpectedURL.equals(actualURL))
			{
				break;
			}
		}
		
	}

}
