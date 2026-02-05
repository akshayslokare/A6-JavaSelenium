package org.automation.popupHandling;

import java.time.Duration;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Task1 
{
	public static void main(String[] args) 
	{
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(15));
		driver.get("https://www.w3schools.com/js/tryit.asp?filename=tryjs_prompt");
		driver.switchTo().frame("iframeResult");
		WebElement button = driver.findElement(By.xpath("//Button[text()='Try it']"));
		button.click();
		Alert alert = driver.switchTo().alert();
		System.out.println(alert.getText());
		alert.sendKeys("Akshay");
		alert.accept();
		
		
		
		
	}

}
