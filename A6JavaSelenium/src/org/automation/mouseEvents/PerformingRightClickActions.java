package org.automation.mouseEvents;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class PerformingRightClickActions 
{
	public static void main(String[] args) throws InterruptedException 
	{
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.ilovepdf.com/");
		WebElement compressedPDFLink = driver.findElement(By.xpath("//a[text()='Compress PDF']"));
		
		Actions actions = new Actions(driver);
		
		//actions.contextClick(compressedPDFLink).perform();
		actions.moveToElement(compressedPDFLink).contextClick().perform();
		
		Thread.sleep(2000);
		driver.quit();
		
	}
	

}
