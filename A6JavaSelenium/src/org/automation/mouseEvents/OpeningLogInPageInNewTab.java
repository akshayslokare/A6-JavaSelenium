package org.automation.mouseEvents;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class OpeningLogInPageInNewTab 
{
	public static void main(String[] args) throws InterruptedException 
	{
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://demowebshop.tricentis.com/");
		WebElement logInLink = driver.findElement(By.linkText("Log in"));
		
		Actions actions = new Actions(driver);		
		actions.keyDown(Keys.CONTROL).click(logInLink).keyUp(Keys.CONTROL).perform();

		Thread.sleep(5000);
		driver.quit();
	}

}
