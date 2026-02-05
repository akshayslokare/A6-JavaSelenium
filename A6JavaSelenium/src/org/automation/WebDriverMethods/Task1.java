package org.automation.WebDriverMethods;

import org.openqa.selenium.Dimension;
import org.openqa.selenium.Point;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Task1 
{
	public static void main(String[] args) 
	{
		WebDriver driver =new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.bmw.in/");
		
		
		
		Dimension targetSize=new Dimension(0, 744);
		driver.manage().window().setSize(targetSize);
		driver.manage().window().setPosition(new Point(0, 0));
		
		//WebDriver driver2 =new ChromeDriver();
		//driver2.manage().window().maximize();
		//driver2.get("https://www.bmw.in/");
		
		//Dimension targetSize2=new Dimension(690, 744);
		//driver2.manage().window().setSize(targetSize2);
		
	}

}
