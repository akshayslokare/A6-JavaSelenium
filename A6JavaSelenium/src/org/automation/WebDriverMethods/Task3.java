package org.automation.WebDriverMethods;

import java.util.Set;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WindowType;
import org.openqa.selenium.chrome.ChromeDriver;

public class Task3 
{
	public static void main(String[] args) throws InterruptedException 
	{
		String ExpectedURL="https://www.flipkart.com/";
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.amazon.in/");
		driver.switchTo().newWindow(WindowType.TAB);
		driver.get("https://www.flipkart.com/");
		driver.switchTo().newWindow(WindowType.TAB);
		driver.get("https://www.decathlon.in/");
		Set<String> allWindowIDs=driver.getWindowHandles();
		System.out.println(allWindowIDs);
		
		for(String windowID : allWindowIDs) 
		{
			driver.switchTo().window(windowID);
			Thread.sleep(2000);
			String actualURL =driver.getCurrentUrl();
			//condition to break the loop and stop switching
			if(!ExpectedURL.equals(actualURL))
			{
				driver.close();
					
			}
			
		}
		
	}

}
