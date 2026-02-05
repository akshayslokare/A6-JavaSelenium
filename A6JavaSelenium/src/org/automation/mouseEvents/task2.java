package org.automation.mouseEvents;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.interactions.WheelInput.ScrollOrigin;

public class task2 
{
	public static void main(String[] args) throws InterruptedException 
	{
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://demoqa.com/droppable");
		WebElement target = driver.findElement(By.xpath("//div[text()='Drag me']"));
		WebElement droppable = driver.findElement(By.xpath("//div[@id='droppable']"));
		Actions actions = new Actions(driver);
		
		ScrollOrigin scrOrigin = ScrollOrigin.fromElement(target);
		
		//actions.scrollFromOrigin(ScrollOrigin.fromElement(target), 0, 200).perform();
		actions.scrollFromOrigin(scrOrigin, 0, 200).perform();
		actions.dragAndDrop(target, droppable).perform();
		
		Thread.sleep(3000);
		driver.quit();
		
		
	}

}
