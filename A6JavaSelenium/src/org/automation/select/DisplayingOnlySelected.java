package org.automation.select;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class DisplayingOnlySelected 
{
	public static void main(String[] args) throws InterruptedException 
	{
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("file:///C:/Users/admin/Desktop/Selenium/Bikes.html");
		WebElement dropdown = driver.findElement(By.id("Bikes"));
		
		Select select = new Select(dropdown);
		
		select.selectByIndex(4);
		select.deselectByVisibleText("Hero Xpulse");
		select.selectByValue("yrx");
		
		List<WebElement> allOptions = select.getOptions();
		
		System.out.println("==========Options==========");
		for(WebElement option :allOptions) 
		{
			System.out.println(option.getText());
		}
		
		List<WebElement> selectedOptions = select.getAllSelectedOptions();
		System.out.println("==========Selected Options==========");
		for(WebElement option :selectedOptions)
		{
			System.out.println(option.getText());
		}
		
		allOptions.removeAll(selectedOptions);
		System.out.println("==========Unselected Options==========");
		
		for(WebElement option :allOptions)
		{
			System.out.println(option.getText());
		}
		
		System.out.println("First selected Option");
		System.out.println(select.getFirstSelectedOption().getText());
		
		
		Thread.sleep(3000);
		driver.quit();
		
	}

}
