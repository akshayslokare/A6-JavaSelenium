package org.automation.testscripts;

import java.time.Duration;

import org.automation.genericUtilities.Flib;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class RegisterTC 
{
	@Test
	public void test1() throws Exception {
		
	}
	public static void main(String[] args) throws InterruptedException 
	{
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(15));
		driver.get(Flib.getPropertyValue("url"));
		driver.findElement(By.linkText("Register")).click();
		
		if(Flib.getWorkbookCellValue("Register", 1, 0).equalsIgnoreCase("male"))
		{
			driver.findElement(By.id("gender-male")).click();
		}
			else
				{
					driver.findElement(By.id("gender-female")).click();
				}
			
			driver.findElement(By.id("FirstName")).sendKeys(Flib.getWorkbookCellValue("Register", 1, 1));
			driver.findElement(By.id("LastName")).sendKeys(Flib.getWorkbookCellValue("Register", 1, 2));
			driver.findElement(By.id("Email")).sendKeys(Flib.getWorkbookCellValue("Register", 1, 3));
			driver.findElement(By.id("Password")).sendKeys(Flib.getWorkbookCellValue("Register", 1, 4));
			driver.findElement(By.id("ConfirmPassword")).sendKeys(Flib.getWorkbookCellValue("Register", 1, 4));
			driver.findElement(By.id("register-button")).click();
			
			Thread.sleep(3000);
			driver.quit();
		}
		
		
}
	
	


