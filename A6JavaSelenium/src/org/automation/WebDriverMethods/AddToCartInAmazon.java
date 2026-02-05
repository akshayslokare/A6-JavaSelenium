package org.automation.WebDriverMethods;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class AddToCartInAmazon 
{
	public static void main(String[] args) 
	{
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.amazon.in/");
		driver.findElement(By.xpath("//button[@alt='Continue shopping']")).click();
		driver.findElement(By.xpath("//input[@placeholder='Search Amazon.in']")).click();
		driver.findElement(By.xpath("//input[@id='twotabsearchtextbox']")).sendKeys("Noise Earbuds");
		driver.findElement(By.xpath("//div[@class='nav-search-submit nav-sprite']")).click();
		driver.findElement(By.xpath("//span[contains(text(),'VS501') and contains(text(), 'Wine')]/../../../..//button[text()='Add to cart']")).click();
		driver.findElement(By.xpath("//div[contains(@id,'cart-text')]")).click();
		
	}

}
