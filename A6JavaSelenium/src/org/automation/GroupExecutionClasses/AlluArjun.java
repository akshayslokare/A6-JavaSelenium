package org.automation.GroupExecutionClasses;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Reporter;
import org.testng.annotations.Test;

public class AlluArjun 
{
	@Test(groups = {"PAN India", "TFI"})
	public void launchWikiPedia()
	{
		Reporter.log("Launching Allu Arjun Page", true);
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://en.wikipedia.org/wiki/Allu_Arjun");
	}

}
