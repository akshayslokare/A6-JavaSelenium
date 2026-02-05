package org.automation.mouseEvents;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class PerformingDragAndDrop1 
{
	
		public static void main(String[] args) throws InterruptedException 
		{
			WebDriver driver = new ChromeDriver();
			driver.manage().window().maximize();
			driver.get("file:///C:/Users/admin/Desktop/Selenium/DragDrop.html");
			
			WebElement draggable = driver.findElement(By.xpath("//div[text()='Rome']"));
			WebElement droppable = driver.findElement(By.xpath("//div[text()='Italy']"));
			
			Thread.sleep(1000);
			Actions actions = new Actions(driver);
			actions.dragAndDrop(draggable, droppable).perform();
			
			Thread.sleep(1000);
			WebElement draggable2 = driver.findElement(By.xpath("//div[text()='Madrid']"));
			WebElement droppable2 = driver.findElement(By.xpath("//div[text()='United States']"));
			
			Thread.sleep(1000);
			actions.dragAndDrop(draggable2, droppable2).perform();
			
			Thread.sleep(1000);
			WebElement draggable3 = driver.findElement(By.xpath("//div[text()='Seoul']"));
			WebElement droppable3 = driver.findElement(By.xpath("//div[text()='Sweden']"));
			
			Thread.sleep(1000);
			actions.dragAndDrop(draggable3, droppable3).perform();
			
			Thread.sleep(1000);
			WebElement draggable4 = driver.findElement(By.xpath("//div[text()='Stockholm']"));
			WebElement droppable4 = driver.findElement(By.xpath("//div[text()='South Korea']"));
			
			Thread.sleep(1000);
			actions.dragAndDrop(draggable4, droppable4).perform();
			
			Thread.sleep(1000);
			WebElement draggable5 = driver.findElement(By.xpath("//div[text()='Washington']"));
			WebElement droppable5 = driver.findElement(By.xpath("//div[text()='Norway']"));
			
			Thread.sleep(1000);
			actions.dragAndDrop(draggable5, droppable5).perform();
			
			
			Thread.sleep(1000);
			WebElement draggable6 = driver.findElement(By.xpath("//div[text()='Oslo']"));
			WebElement droppable6 = driver.findElement(By.xpath("//div[text()='Spain']"));
			
			Thread.sleep(1000);
			actions.dragAndDrop(draggable6, droppable6).perform();
			
			Thread.sleep(1000);
			WebElement draggable7 = driver.findElement(By.xpath("//div[text()='Copenhagen']"));
			WebElement droppable7 = driver.findElement(By.xpath("//div[text()='Denmark']"));
			
			Thread.sleep(1000);
			actions.dragAndDrop(draggable7, droppable7).perform();
			
			Thread.sleep(3000);
			driver.quit();
		}

}
