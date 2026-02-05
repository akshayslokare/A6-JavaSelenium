package org.automation.WebDriverMethods;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class LocatingUsingDependentAndIndependentElement 
{
	public static void main(String[] args) 
	{
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://demowebshop.tricentis.com/");
		driver.findElement(By.partialLinkText("Apparel & Shoes")).click();
		driver.findElement(By.xpath("//a[text()='Blue Jeans']/../..//input[@value='Add to cart']")).click();
		driver.findElement(By.xpath("//span[text()='Shopping cart']")).click();
		
		
	}

}
