package org.automation.dataDrivenTesting;

import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.util.Properties;

import org.testng.annotations.Test;

public class FetchingDataFromProperties 
{
	@Test
	public void testB() throws Exception {
		
	}
	public static void main(String[] args) throws IOException 
	{
		File file = new File(".\\TestData\\DWS.properties");
		FileInputStream fis = new FileInputStream(file);
		Properties prop = new Properties();
		prop.load(fis);
		System.out.println(prop.getProperty("url"));
		System.out.println(prop.getProperty("email"));
		System.out.println(prop.getProperty("password"));
			
	}

}
