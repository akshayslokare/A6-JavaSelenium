package org.automation.testNGFramework;

import java.io.File;
import java.io.IOException;
import java.time.LocalDateTime;

import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.io.FileHandler;
import org.testng.ITestContext;
import org.testng.ITestListener;
import org.testng.ITestResult;
import org.testng.Reporter;

public class MyListeners extends BaseTest implements ITestListener
{

	@Override
	public void onTestStart(ITestResult result) {
		// TODO Auto-generated method stub
		Reporter.log("TestCase "+result.getName()+ " has started", true);
	}

	@Override
	public void onTestSuccess(ITestResult result) {
		// TODO Auto-generated method stub
		Reporter.log("TestCase "+result.getName()+ " has successfuly executed", true);
	}
	
	//if test case fails it will take Screen Shot
	@Override
	public void onTestFailure(ITestResult result) {
		// TODO Auto-generated method stub
		String ldt = LocalDateTime.now().toString();
		String dateAndTime = ldt.replaceAll(":", "-");
		Reporter.log("TestCase "+result.getName()+ " has failed and Taking Screenshot", true);
		TakesScreenshot ts = (TakesScreenshot)driver;
		File src = ts.getScreenshotAs(OutputType.FILE);
		File dest = new File("./Errorshots/"+ result.getName()+dateAndTime+ ".png");
		
		try 
		{
			FileHandler.copy(src, dest);
			
		}
		catch(IOException e)
		{
			e.printStackTrace();
		}
	}

	@Override
	public void onTestSkipped(ITestResult result) {
		// TODO Auto-generated method stub
		Reporter.log("TestCase "+result.getName()+ " has skipped", true);
	}

	@Override
	public void onTestFailedButWithinSuccessPercentage(ITestResult result) {
		// TODO Auto-generated method stub
		Reporter.log("TestCase "+result.getName()+ " has suceesfully executed but failed with in success percentage", true);
	}

	@Override
	public void onTestFailedWithTimeout(ITestResult result) {
		// TODO Auto-generated method stub
		Reporter.log("TestCase "+result.getName()+ " has failed with timeouts", true);
	}

	@Override
	public void onStart(ITestContext context) {
		// TODO Auto-generated method stub
		Reporter.log("<test> "+context.getName()+ " has started", true);
	}

	@Override
	public void onFinish(ITestContext context) {
		// TODO Auto-generated method stub
		Reporter.log("<test> "+context.getName()+ " has finished", true);
	}
	

}
