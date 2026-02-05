package org.automation.WebDriverMethods;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class ToLocateTheLoginButoonUsingCssSelector 
{
	public static void main(String[] args) 
	{
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://demowebshop.tricentis.com/");
		driver.findElement(By.linkText("Log in")).click();
		driver.findElement(By.id("Email")).sendKeys("akshayslokare@gmail.com");
		driver.findElement(By.id("Password")).sendKeys("Akshay@123");
		//cssSelector(if there is direct locators like id n all give them priority first and don't use cssSelector)
		driver.findElement(By.cssSelector("input[value='Log in']")).click();
		
	}

}
