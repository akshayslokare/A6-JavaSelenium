package org.automation.mouseEvents;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class ScrollingUntillElementIsVisibleInViewPort 
{
	public static void main(String[] args) throws InterruptedException 
	{
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://zomato.com/pune");
		WebElement dest = driver.findElement(By.xpath("//h5[text()='Koregaon Park']"));
		Actions actions = new Actions(driver);
		actions.scrollToElement(dest).perform();
		
		Thread.sleep(3000);
		driver.quit();
		
	}

}
