package org.automation.GroupExecutionClasses;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Reporter;
import org.testng.annotations.Test;

public class SRK
{
	@Test(groups = {"BFI"})
	public void launchWikiPedia()
	{
		Reporter.log("Launching SRK Page", true);
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://en.wikipedia.org/wiki/Shah_Rukh_Khan");
	}
	

}
