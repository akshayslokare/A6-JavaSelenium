package org.automation.BatchExecution;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Reporter;
import org.testng.annotations.Test;



public class Jawa 
{
	@Test
	public void launchingBobber()
	{
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.jawayezdimotorcycles.com/search?type=product&q=bobber");
		Reporter.log("Launching Bobber",true);
		
	}

}
