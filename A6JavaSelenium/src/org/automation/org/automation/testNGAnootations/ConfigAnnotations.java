package org.automation.org.automation.testNGAnootations;

import org.testng.Reporter;
import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class ConfigAnnotations {
  @Test
  public void testCase1() 
  {
	 Reporter.log("This is @test method", true); 
  }
  
  @BeforeMethod
  public void beforeMethod() 
  {
	  Reporter.log("This is @BeforeMethod Method", true);
  }
  
  @BeforeClass
  public void beforeClass() 
  {
	  Reporter.log("This is @BeforeClass Method", true);
  }
  
  @BeforeTest
  public void beforeTest() 
  {
	  Reporter.log("This is @BeforeTest Method", true);
  }
  
  @BeforeSuite
  public void beforeSuit() 
  {
	  Reporter.log("This is @BeforeSuit Method", true);
  }
  
  @AfterSuite
  public void testcase6() 
  {
	  Reporter.log("This is @AfterSuit Method", true); 
  }
  
  @AfterTest
  public void afterTest() 
  {
	  Reporter.log("This is @afterTest Method", true);
  }
  
  
  @AfterClass
  public void afterClass() 
  {
	  Reporter.log("This is @afterClass Method", true);
  }
  
  @AfterMethod
  public void afterMethod() 
  {
	  Reporter.log("This is @afterMethod Method", true);
  }

 
}
