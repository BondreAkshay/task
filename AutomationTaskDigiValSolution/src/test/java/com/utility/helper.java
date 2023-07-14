package com.utility;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;

import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class helper {
	
	public static String excelRead(int row, int column) throws IOException
	{
		String Path = "C:\\Users\\91797\\eclipse-workspace\\Aksay Maven Project\\AutomationTaskDigiValSolution\\TestData\\DigivalTask.xlsx";
		
		File file = new File(Path);
		
		FileInputStream fis = new FileInputStream(file);
		
		XSSFWorkbook wb = new XSSFWorkbook(fis);
		
		XSSFSheet sheet = wb.getSheet("Sheet1");
		
		String value = sheet.getRow(row).getCell(column).getStringCellValue();
		
		return value;
		
		
	}
	
	public static void javaClick(WebDriver driver,WebElement element)
	{
		((JavascriptExecutor)driver).executeScript("arguments[0].click();", element);
	}
	
	public static int excelWrite(int a, String value) throws Exception
	{
		String Path = "C:\\Users\\91797\\eclipse-workspace\\Aksay Maven Project\\AutomationTaskDigiValSolution\\TestData\\DigivalTaskResult.xlsx";
		
		File file = new File(Path);
		
		FileInputStream fis = new FileInputStream(file);
		
		XSSFWorkbook wb = new XSSFWorkbook(fis);
		
		XSSFSheet sheet = wb.getSheet("Sheet1");
		
		FileOutputStream fos = new FileOutputStream(file);
		
		sheet.getRow(a).getCell(2).setCellValue(value);
		
		wb.write(fos);
		
		return a;
	
	}
	
	

	
	}


