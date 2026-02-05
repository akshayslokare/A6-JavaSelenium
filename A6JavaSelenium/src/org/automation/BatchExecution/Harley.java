package org.automation.BatchExecution;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Reporter;
import org.testng.annotations.Test;


public class Harley 
{
	@Test
	public void launchingIron883()
	{
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://ironsteedhd.com/showroom/4/harley-davidson/3/motorcycles/1316/22443/xl883niron883");
		Reporter.log("Launcing IRON 883", true);
		
	}

}
