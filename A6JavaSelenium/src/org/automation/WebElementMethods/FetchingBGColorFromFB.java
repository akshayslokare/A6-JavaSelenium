package org.automation.WebElementMethods;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class FetchingBGColorFromFB 
{
	public static void main(String[] args) 
	{
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.facebook.com");
		WebElement CreateAccBtn =  driver.findElement(By.xpath("//a[text()='Create new account']"));
		System.out.println("BG Color :"+CreateAccBtn.getCssValue("background-color"));
		System.out.println("color :"+CreateAccBtn.getCssValue("color"));
		System.out.println("Text Sixe :"+CreateAccBtn.getCssValue("font-size"));
		
		
		
	}

}
