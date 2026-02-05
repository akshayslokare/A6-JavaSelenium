package org.automation.mouseEvents;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Task 
{
	public static void main(String[] args) 
	{
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://open.spotify.com/search");
		driver.findElement(By.xpath("//input[@placeholder='What do you want to play?']")).sendKeys("Attention Song", Keys.ENTER);
		driver.findElement(By.xpath("//a[@title='Attention']")).click();
		
		
	}
}
