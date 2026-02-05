package org.automation.WebDriverMethods;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;


public class LocatingUsingXpath 
{
	public static void main(String[] args) 
	{
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.instagram.com/");
		driver.findElement(By.xpath("//input[@aria-label='Phone number, username, or email']")).sendKeys("urstrullyakshayy");
		driver.findElement(By.xpath("//input[@type='password']")).sendKeys("Akshay@123");
		driver.findElement(By.xpath("//button[@type='submit']")).click();
	}

}
