package org.automation.select;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class UsingSelectClassMethods 
{
	public static void main(String[] args) 
	{
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.facebook.com/reg");
		WebElement dateDropDown = driver.findElement(By.id("day"));
		
		Select select = new Select(dateDropDown);
		
		//verifying datedropdown is single select or multi
		if(select.isMultiple())
			System.out.println("Multi-selected dropdown");
		else
			System.out.println("Single-selected dropdown");
		
		//fetching all the options in dropdown
		List<WebElement> allOptions = select.getOptions();
		System.out.println("Options: "+allOptions.size());
		
		//selecting all the options 1 by 1 using select by index() in loop
		for(int index = 0; index < allOptions.size(); index++)
		{
			select.selectByIndex(index);
		}
		
	}

}
