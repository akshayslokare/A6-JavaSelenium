package org.automation.BatchExecution;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Reporter;
import org.testng.annotations.Test;

public class Kawasaki 
{
	@Test
	public void launchingZ900()
	{
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.kawasaki-india.com/en/motorcycles/z/Z900-2026.html");
		Reporter.log("Launching Z900",true);
		
	}

}
