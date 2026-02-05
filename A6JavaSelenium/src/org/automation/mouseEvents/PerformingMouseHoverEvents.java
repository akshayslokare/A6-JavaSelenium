package org.automation.mouseEvents;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class PerformingMouseHoverEvents 
{
	public static void main(String[] args) throws InterruptedException 
	{
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://demowebshop.tricentis.com/");
		WebElement electronicsLink = driver.findElement(By.partialLinkText("ELECTRONICS"));
		
		Actions actions = new Actions(driver);
		actions.moveToElement(electronicsLink).perform();
		
		//actions.moveToLocation(374,197).perform();
		
		//actions.moveByOffset(487-374, 197-197);
		actions.moveByOffset(113, 0);
		
		Thread.sleep(3000);
		driver.quit();
		
	}

}
