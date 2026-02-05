package org.automation.select;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class SelectingAllOptionsUsingByVisibleText 
{
	public static void main(String[] args) 
	{
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.facebook.com/reg");
		WebElement dateDropDown = driver.findElement(By.id("month"));
		Select select = new Select(dateDropDown);
		
		//fetching all the options
		 List<WebElement> allOptions = select.getOptions();
		 
		 //selecting all the option 1 by 1 using selectByvisibleText()
		 
		 for(WebElement options: allOptions)
		 {
			String text = options.getText();
			select.selectByVisibleText(text);
		 }
	}

}
