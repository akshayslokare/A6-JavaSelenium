package org.automation.mouseEvents;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class ScrollingByUsingOffSet 
{
	public static void main(String[] args) throws InterruptedException 
	{
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://demowebshop.tricentis.com/");
		
		Actions actions = new Actions(driver);
		//if there is no. of products are loading then its not work on that webapp
		actions.scrollByAmount(0, 300).perform();
		
		Thread.sleep(3000);
		driver.quit();
	}

}
