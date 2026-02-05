package org.automation.WebDriverMethods;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class LocatingUsingXpathContains 
{
	public static void main(String[] args) 
	{
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.amazon.in/");
		driver.findElement(By.xpath("//button[@alt='Continue shopping']")).click();
		driver.findElement(By.xpath("//input[@placeholder='Search Amazon.in']")).click();
		driver.findElement(By.xpath("//input[@id='twotabsearchtextbox']")).sendKeys("Shoes for Men");
		driver.findElement(By.xpath("//div[@class='nav-search-submit nav-sprite']")).click();
		driver.findElement(By.xpath("//img[@alt='Sponsored Ad - Campus Men First Running Shoes']")).click();
		driver.findElement(By.xpath("//img[@alt='Urban Essentials']")).click();
		driver.findElement(By.xpath("//span[contains(text(),'YOHO Mens Ejogs Sneaker)]")).click();
		
		
	}

}
