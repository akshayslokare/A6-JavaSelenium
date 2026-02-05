package org.automation.dataDrivenTesting;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.ss.usermodel.WorkbookFactory;
import org.automation.genericUtilities.Flib;
import org.testng.annotations.Test;

public class FetchingDataFromExcel 
{
	@Test
	public void testA() throws Exception {
		
	}
	public static void main(String[] args) 
	{
		File file = new File("./TestData/DWS.xlsx");
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
		 
		 Sheet sheet = wb.getSheet("Register");
		 Row row = sheet.getRow(1);
		 Cell cell = row.getCell(3);
		 System.out.println(cell.toString());
		 cell = row.getCell(4);
		 System.out.println(cell.toString());
		 //we can use both type but we can use single line as shown below method chaining
		 System.out.println(sheet.getRow(1).getCell(2).toString());
		 
		 String xyz = Flib.getWorkbookCellValue("Register", 0, 1);
		 System.out.println(xyz);
		  
	}

}
