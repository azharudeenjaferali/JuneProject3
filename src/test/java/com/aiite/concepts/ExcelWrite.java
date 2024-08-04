package com.aiite.concepts;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;

import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class ExcelWrite {
	
	public static void main(String[] args) throws IOException {
		File file = new File("C:\\Users\\AzharudeenJaferali\\OneDrive - Enhops Solutions Pvt. Ltd\\Desktop\\Book1.xlsx");
		FileInputStream fis = new FileInputStream(file);
		Workbook wk = new XSSFWorkbook(fis);
		
		Sheet sheet = wk.createSheet("Demo");
		Row row = sheet.createRow(3);
		Cell cell = row.createCell(3);
		
		cell.setCellValue("Kishore");

		FileOutputStream fos = new FileOutputStream(file);
		wk.write(fos);
		wk.close();
		
		
		System.out.println("completed");
		
	}

}
