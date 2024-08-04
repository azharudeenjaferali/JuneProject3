package com.aiite.concepts;

import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.text.SimpleDateFormat;
import java.util.Date;

import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.CellType;
import org.apache.poi.ss.usermodel.DateUtil;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class ExcelRead {
	
	public static void main(String[] args) throws IOException {
		
		File file = new File("C:\\Users\\AzharudeenJaferali\\OneDrive - Enhops Solutions Pvt. Ltd\\Desktop\\Book1.xlsx");
		FileInputStream fis = new FileInputStream(file);   //system readable format
		Workbook wk = new XSSFWorkbook(fis);      //HssfWorkbook		
		
		Sheet sheet = wk.getSheet("Sheet1");
		int physicalNumberOfRows = sheet.getPhysicalNumberOfRows();
		for(int i=0; i<physicalNumberOfRows; i++) {
			Row row = sheet.getRow(i);
			int physicalNumberOfCells = row.getPhysicalNumberOfCells();
			for(int j=0; j<physicalNumberOfCells; j++) {
				Cell cell = row.getCell(j);
				
				CellType cellType = cell.getCellType();

				if(cellType==CellType.STRING) {
					String value = cell.getStringCellValue();
					System.out.println(value);
				}
				else if(cellType==CellType.NUMERIC) {
					if(DateUtil.isCellDateFormatted(cell)) {
						Date dateCellValue = cell.getDateCellValue();
						SimpleDateFormat sc = new SimpleDateFormat("dd-MM-yyyy");
						String format = sc.format(dateCellValue);
						System.out.println(format);
					}
					else {
						double numericCellValue = cell.getNumericCellValue();
						int value = (int) numericCellValue;
						System.out.println(value);
					}
				}
			}
			
		}
		
		
	}

}
