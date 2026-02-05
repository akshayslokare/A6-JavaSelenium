package org.automation.popupHandling;

import java.time.Duration;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class HandleChildWindowPopup 
{
	@Test
	public void test3() throws Exception {
		
	}
	public static void main(String[] args) throws InterruptedException 
	{
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		driver.get("https://omayo.blogspot.com/");
		String ParentID = driver.getWindowHandle();
		
		driver.findElement(By.xpath("//a[text()='Open a popup window']")).click();
		Set<String> AllIDs = driver.getWindowHandles();
		String ChildWindowTitle ="New Window";
		
		for(String IDs: AllIDs)
		{
			driver.switchTo().window(IDs);
			if(driver.equals(ChildWindowTitle))
			{
				
				break;
			}
		}
		
		Thread.sleep(5000);
		driver.quit();
		
	}

}
