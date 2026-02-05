package org.automation.testscripts;

import java.time.Duration;

import org.automation.genericUtilities.Flib;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class LoginTC 
{
	@Test
	public void test2(){
		
	}
	public static void main(String[] args) throws InterruptedException 
	{
		String url = Flib.getPropertyValue("url");
		String email = Flib.getPropertyValue("email");
		String password = Flib.getPropertyValue("password");
		
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(15));
		driver.get(url);
		driver.findElement(By.linkText("Log in")).click();
		driver.findElement(By.id("Email")).sendKeys(email);
		driver.findElement(By.id("Password")).sendKeys(password);
		Thread.sleep(2000);
		driver.findElement(By.xpath("//input[@value='Log in']")).click();
		Thread.sleep(3000);
		driver.quit();
		
	}

}
