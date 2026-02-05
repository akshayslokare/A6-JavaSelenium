package org.capturingScreenshot;

import java.io.File;
import java.io.IOException;
import java.time.LocalDateTime;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.io.FileHandler;

public class CapturingScreenshotOfWebElement 
{
	public static void main(String[] args) throws IOException 
	{
		
		LocalDateTime ldt = LocalDateTime.now();
		String timestamp = ldt.toString().replace(':', '-');
		
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.amazon.in/");
		driver.findElement(By.xpath("//input[@placeholder='Search Amazon.in']")).sendKeys("MRF Cricket Bat", Keys.ENTER);
		WebElement product = driver.findElement(By.xpath("//span[contains(text(),'MRF Primium')]/../../../../.."));
		
		File src = product.getScreenshotAs(OutputType.FILE);
		File dest = new File("./Errorshots/screenshot"+timestamp+".png");
		
		FileHandler.copy(src, dest);
		
		
		
	}

}
