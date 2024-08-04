package com.aiite.concepts;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;

import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class ExcelUpdate {
	
	public static void main(String[] args) {
		
		try {
			File file = new File("C:\\Users\\AzharudeenJaferali\\OneDrive - Enhops Solutions Pvt. Ltd\\Desktop\\Book1.xlsx");
			FileInputStream fis = new FileInputStream(file);
			Workbook wk = new XSSFWorkbook(fis);
			
			Sheet sheet = wk.getSheet("Demo");
			Row row = sheet.getRow(3);
			Cell cell = row.getCell(3);
			
			System.out.println(cell);
			
			cell.setCellValue("Sarath");
			
			FileOutputStream fos = new FileOutputStream(file);
			wk.write(fos);
			wk.close();
			
			System.out.println("Finished");
		}
		catch(Exception e) {
			
		}
		
		
		
		
		
	}

}
