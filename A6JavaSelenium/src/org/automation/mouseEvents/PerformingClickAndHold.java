package org.automation.mouseEvents;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class PerformingClickAndHold 
{
	public static void main(String[] args) throws InterruptedException 
	{
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("file:///C:/Users/admin/Desktop/Selenium/DragDrop.html");
		
		Actions actions = new Actions(driver);
		
		WebElement capital = driver.findElement(By.xpath("//div[text()='Rome']"));
		actions.clickAndHold(capital).perform();
		
		WebElement country = driver.findElement(By.xpath("//div[text()='Spain']"));
		actions.release(country).perform();
		//actions.moveToElement(capital).clickAndHold().moveToElement(country).release().perform();
		
		
		Thread.sleep(2000);
		driver.quit();
		
	}

}
