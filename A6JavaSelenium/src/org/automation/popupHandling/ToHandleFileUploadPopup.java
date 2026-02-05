package org.automation.popupHandling;

import java.io.IOException;
import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class ToHandleFileUploadPopup 
{
	public static void main(String[] args) throws IOException 
	{
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(15));
		driver.get("https://www.ilovepdf.com/merge_pdf");
		driver.findElement(By.xpath("//span[text()='Select PDF files']")).click();
		Runtime.getRuntime().exec("C:\\Users\\admin\\Desktop\\Sample Scripts\\pdffile.exe");
		
	}

}
