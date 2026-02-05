package org.automation.mouseEvents;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

class ScrollingNaukri 
{
	public static void main(String[] args) throws InterruptedException 
	{
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.naukri.com/");
		WebElement target = driver.findElement(By.xpath("//span[text()='Resume writing']"));
		Actions actions = new Actions(driver);
		//we use this to perform some actions on elements which is behind the adds
		actions.scrollToElement(target).scrollByAmount(0, 250).perform();
		target.click();
		
		Thread.sleep(3000);
		driver.quit();
		
	}
}
