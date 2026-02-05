package org.automation.testNGFramework;

import org.openqa.selenium.By;
import org.testng.Reporter;
import org.testng.annotations.Listeners;
import org.testng.annotations.Test;

//@Listeners(MyListeners.class)

public class TC_001_AddToCartTest extends BaseTest
{
	@Test
	public void addToCart()
	{
		driver.findElement(By.partialLinkText("ELECTRONICS")).click();
		driver.findElement(By.partialLinkText("Cell phones")).click();
		driver.findElement(By.xpath("//a[text()='Smartphone']/../..//input")).click();
		driver.findElement(By.xpath("//span[text()='Shopping cart']")).click();
		
		if(driver.findElement(By.xpath("//h1[text()='Shopping cart']")).isDisplayed())
		{
			Reporter.log("Product is added to Cart", true);
		}
		else
		{
			Reporter.log("Test Case is Failed", true);
		}
	}

}
