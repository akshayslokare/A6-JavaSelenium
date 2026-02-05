package org.automation.WebDriverMethods;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class FetchingPricesOfAllProducts 
{
	public static void main(String[] args) 
	{
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.amazon.in/");
		driver.findElement(By.xpath("//input[@placeholder='Search Amazon.in']")).sendKeys("Human Brain", Keys.ENTER);
		List<WebElement> Pricelist = driver.findElements(By.className("a-price-whole"));
		
		for(WebElement PL : Pricelist) 
		{
			System.out.println(PL.getText());
		}
		
		
	}

}
