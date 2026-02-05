package org.automation.testNGLearning;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class UsingTimeOutInTC 
{
	@Test(timeOut = 15000, enabled = true)
	public void launchTrimphTiger()
	{
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.triumphmotorcycles.in/motorcycles/adventure/tiger-900");
		
	}
	
	@Test(dependsOnMethods = "launchTrimphTiger")
	public void launchingPurple()
	{
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.purplle.com/");
	}
	
	

}
