package org.automation.WebDriverMethods;

import org.openqa.selenium.Dimension;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class FetchingSizeofBrowser 
{
	public static void main(String[] args) 
	{
		//getsize
		WebDriver driver=new ChromeDriver();
		driver.get("https://www.tesla.com/");
		Dimension size =driver.manage().window().getSize();
		System.out.println(size);
		System.out.println("Height:"+size.getHeight());
		System.out.println("Width:"+size.getWidth());
		
		driver.manage().window().maximize();
		Dimension fullsize =driver.manage().window().getSize();
		System.out.println(fullsize);
		System.out.println("Height:"+fullsize.getHeight());
		System.out.println("Width:"+fullsize.getWidth());
		
		
		//setsize for new size
		Dimension targetSize=new Dimension(650, 650);
		driver.manage().window().setSize(targetSize);
		
		

		
	}

}
