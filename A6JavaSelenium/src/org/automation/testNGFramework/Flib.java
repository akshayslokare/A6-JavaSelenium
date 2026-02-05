package org.automation.testNGFramework;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Properties;

import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.ss.usermodel.WorkbookFactory;

import static org.automation.genericUtilities.FrameworkConstants.*;
//using import static we can access static variables of any class

/**
 * The class flip is mainly used to interact with file and fetch the data
 * needed for Automation Application
 * 
 * @author admin
 */

public class Flib 
{
/**
 * This method accept the key and it will fetch the value of the respective key
 * in the given properties file
 * @param key [String]
 * @return value [String]
 */

	public static String getPropertyValue(String key) 
	{
		File file = new File(PROPERTIES_PATH);
		FileInputStream fis = null;
		try 
		{
			fis = new FileInputStream(file);
		}
		catch(FileNotFoundException e)
		{
			e.printStackTrace();
		}
		
		Properties prop = new Properties(); 
			try 
			{
				prop.load(fis);
			} 
			catch (java.io.IOException e) 
			{
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		String value = prop.getProperty(key);
		return value;
	}
	
	
	//this another method which is for excel data
	
		public static String getWorkbookCellValue(String sheetName, int rowIndex, int cellIndex)
		{
			File file = new File(EXCEL_PATH);
			FileInputStream fis = null;
			 Workbook wb =null;
			 
			 //Row row = sheet.getRow(1);
			//Cell cell = row.getCell(3);
			//System.out.println(cell.toString());
			 
			 try
			 {
				 fis = new FileInputStream(file);
			 }
			 catch(FileNotFoundException e)
			 {	
				 e.printStackTrace();
			 }
			 
			 try
			 {
				 wb = WorkbookFactory.create(fis);
			 }
			 catch(IOException e)
			 {
				e.printStackTrace(); 
			 }
			 
			 String value = wb.getSheet(sheetName).getRow(rowIndex).getCell(cellIndex).toString();
			 return value;
	}
	
}
