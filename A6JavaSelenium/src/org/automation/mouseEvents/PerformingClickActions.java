package org.automation.mouseEvents;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class PerformingClickActions 
{
	public static void main(String[] args) throws InterruptedException 
	{
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.reliancedigital.in/");
		WebElement popup = driver.findElement(By.xpath("//button[@class='No thanks']"));
		
		//click() from webelement
		//popup.click();
		
		Actions actions = new Actions(driver);
		//click(WebElements) from Actions
		//actions.click(popup).perform();
		
		actions.moveToElement(popup).click().perform(); //click() from Actions
		
		Thread.sleep(5000);
		driver.quit();
	}

}
