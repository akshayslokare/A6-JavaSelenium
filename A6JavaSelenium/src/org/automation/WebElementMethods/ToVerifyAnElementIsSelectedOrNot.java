package org.automation.WebElementMethods;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class ToVerifyAnElementIsSelectedOrNot 
{
		public static void main(String[] args) 
		{
			WebDriver driver = new ChromeDriver();
			driver.manage().window().maximize();
			driver.get("https://omayo.blogspot.com/");
			WebElement PenCheckBox = driver.findElement(By.xpath("//input[@value='Pen' and @name]"));
			WebElement BookCheckBox = driver.findElement(By.xpath("//input[@value='Book']"));
			System.out.println(PenCheckBox.isSelected()? "Pen CheckBox is Selected": "Pen CheckBox is not Selected");
			System.out.println(BookCheckBox.isSelected()? "Book CheckBox is Selected": "Book CheckBox is not Selected");
		
	}

}
