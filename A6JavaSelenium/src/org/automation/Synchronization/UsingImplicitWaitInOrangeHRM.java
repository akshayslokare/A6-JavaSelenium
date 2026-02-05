package org.automation.Synchronization;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class UsingImplicitWaitInOrangeHRM 
{
	public static void main(String[] args) throws InterruptedException 
	{
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(15));
		
		driver.get("https://opensource-demo.orangehrmlive.com/web/index.php/auth/login");
	
		WebElement userName = driver.findElement(By.name("username"));
		WebElement userPassword = driver.findElement(By.name("password"));
		WebElement logInBTN = driver.findElement(By.xpath("//button[@type='submit']"));
		
		Actions actions = new Actions(driver);
		actions.sendKeys(userName, "Admin").sendKeys(userPassword, "admin123").click(logInBTN).perform();

		//actions.moveToElement(userName).sendKeys("Admin").moveToElement(userPassword).click().sendKeys("admin123").keyDown(Keys.ENTER).perform();
		
		Thread.sleep(8000);
		driver.quit();
		
		
	}

}
