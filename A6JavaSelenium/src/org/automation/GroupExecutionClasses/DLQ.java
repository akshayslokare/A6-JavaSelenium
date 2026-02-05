package org.automation.GroupExecutionClasses;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Reporter;
import org.testng.annotations.Test;

public class DLQ 
{
	@Test(groups = {"TFI"})
	public void launchWikiPedia()
	{
		Reporter.log("Launching Dulquer Salmaan Page", true);
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://en.wikipedia.org/wiki/Dulquer_Salmaan");
	}

}
