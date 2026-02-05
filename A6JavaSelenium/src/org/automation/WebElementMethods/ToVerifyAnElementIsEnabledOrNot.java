package org.automation.WebElementMethods;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class ToVerifyAnElementIsEnabledOrNot 
{
	public static void main(String[] args) 
	{
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://omayo.blogspot.com/");
		WebElement TextBox1 = driver.findElement(By.id("textbox1"));
		System.out.println(TextBox1.isEnabled()? "Textbox 1 is enabled": "Textbox 1 is disabled");
		WebElement TextBox2 = driver.findElement(By.id("tb2"));
		System.out.println(TextBox2.isEnabled()? "Textbox 2 is enabled": "Textbox 2 is disabled");
		
	}

}
