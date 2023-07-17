package com.utility;
import org.apache.poi.ss.usermodel.*;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;


public class excelUtils {
	
	
	    public static void updatePassFailStatus(int rowNum, int cellNum, String data) {
	        try {
	        	String Path = System.getProperty("user.dir")+"\\TestData\\DigivalTask.xlsx";
	        	FileInputStream fis = new FileInputStream(Path);
	            Workbook workbook = WorkbookFactory.create(fis);

	            Sheet sheet = workbook.getSheet("Sheet1");
	            Row row = sheet.getRow(rowNum);
	            Cell cell = row.createCell(cellNum);

	            // Set the pass/fail value
	            cell.setCellValue(data);

	            fis.close();

	            FileOutputStream fos = new FileOutputStream(Path);
	            workbook.write(fos);
	            workbook.close();
	            fos.close();

	            System.out.println("Pass/Fail status updated successfully in the Excel file.");

	        } catch (IOException e) {
	            e.printStackTrace();
	        }
	    
	}

}
