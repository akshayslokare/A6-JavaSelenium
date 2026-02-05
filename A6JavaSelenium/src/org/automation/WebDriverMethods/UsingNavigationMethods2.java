package org.automation.WebDriverMethods;

import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.WebDriver;

import java.net.MalformedURLException;
import java.net.URL;

public class UsingNavigationMethods2 
{
	public static void main(String[] args) throws InterruptedException, MalformedURLException 
	{
		WebDriver driver=new ChromeDriver();
		driver.navigate().to("https://www.kawasaki-india.com/");
		Thread.sleep(2000);
		
		//this is not used rn
		URL url = new URL("https://www.suzukimotorcycle.co.in/");
		driver.navigate().to(url);
		
		
	}

}
