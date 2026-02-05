package mock;
import java.time.Duration;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Task1 
{
	public static void main(String[] args) throws InterruptedException 
	{
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(15));
		driver.get("file:///C:/Users/admin/Downloads/Assign.html");
		String swiggy="https://www.swiggy.com/";
		
		driver.findElement(By.xpath("//button[text()='Click Me']")).click();
		
		Set<String> windows=driver.getWindowHandles();
		
		for(String x:windows) {
			driver.switchTo().window(x);
			String actual=driver.getCurrentUrl();
				if(swiggy.equals(actual)) {
					driver.manage().window().maximize();
					Thread.sleep(2000);
					driver.close();
					Thread.sleep(2000);
					driver.quit();
			}
			
		}

	}

			
		
		
		
}





