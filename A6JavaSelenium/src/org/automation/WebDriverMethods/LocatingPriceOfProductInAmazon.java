package org.automation.WebDriverMethods;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class LocatingPriceOfProductInAmazon 
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
		
		WebElement priceElement = driver.findElement(By.xpath("//span[contains(text(),'Noise Buds N1') and contains(text(), 'Ice Blue')]/../../../..//span[@class='a-price-whole']"));
		
		String price = priceElement.getText();
		System.out.println("Price :"+price);
	}

}
