package org.automation.WebDriverMethods;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WindowType;
import org.openqa.selenium.chrome.ChromeDriver;

public class UnderstandingCloseAndQuit 
{
	public static void main(String[] args) throws InterruptedException 
	{
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.amazon.in/");
		driver.switchTo().newWindow(WindowType.TAB);
		driver.get("https://www.flipkart.com/");
		driver.switchTo().newWindow(WindowType.WINDOW);
		driver.get("https://www.decathlon.in/");
		driver.switchTo().newWindow(WindowType.WINDOW);
		driver.get("https://www.ajio.com/");
		Thread.sleep(2000);
		driver.close();
		Thread.sleep(2000);
		driver.quit();
		
	}

}

//1.open 3 windows with one tab each with diff app
//close only one tab
//2.close 2 and remain 1(middle)
