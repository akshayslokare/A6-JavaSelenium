package org.automation.WebElementMethods;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class ValidatingTheEmailEnteredInFBLogin 
{
	public static void main(String[] args) 
	{
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.facebook.com");
		String email = "akshayslokare@gmail.com";
		WebElement emailTextbox = driver.switchTo().activeElement();
		emailTextbox.sendKeys(email);
		
		String enteredEmail = emailTextbox.getAttribute("value");
		if(email.equals(enteredEmail))
			System.out.println("Email has been successfully entered");
		else
			System.out.println("Email has not been entered");
		
		
	}

}
