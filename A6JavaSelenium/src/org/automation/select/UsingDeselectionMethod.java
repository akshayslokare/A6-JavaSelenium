package org.automation.select;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class UsingDeselectionMethod 
{
	public static void main(String[] args) throws InterruptedException 
	{
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://omayo.blogspot.com/");
		WebElement dropdown = driver.findElement(By.id("multiselect1"));
		Select select = new Select(dropdown);
		
		if(select.isMultiple())
			System.out.println("It is multi select dropdown");
		else
			System.out.println("It is not multi select dropdown");
		
		List<WebElement> allOptions = select.getOptions();
		
		for(WebElement option :allOptions)
		{
			String value = option.getAttribute("value");
			select.selectByValue(value);
		}
		Thread.sleep(2000);
		select.deselectByIndex(1);
		
		Thread.sleep(2000);
		select.deselectByVisibleText("Audi");
		
		Thread.sleep(2000);
		select.selectByIndex(1);
		
		Thread.sleep(2000);
		select.deselectByValue("volvox");
		
		Thread.sleep(2000);
		select.deselectAll();
		
		Thread.sleep(2000);
		driver.quit();
	}

}
