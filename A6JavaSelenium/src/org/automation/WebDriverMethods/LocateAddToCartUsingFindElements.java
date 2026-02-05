package org.automation.WebDriverMethods;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class LocateAddToCartUsingFindElements 
{
	public static void main(String[] args) throws InterruptedException 
	{
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.amazon.in/");
		driver.findElement(By.xpath("//input[@placeholder='Search Amazon.in']")).sendKeys("marshall bluetooth speakers", Keys.ENTER);
		List<WebElement> addToCartButton = driver.findElements(By.xpath("//button[text()='Add to cart']"));
		System.out.println(addToCartButton.size());
		
		for(WebElement x: addToCartButton)
		{
			x.click();
		}
		
	}

}
