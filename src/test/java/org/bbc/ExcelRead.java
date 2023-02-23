package org.bbc;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class ExcelRead {
	public static void main(String[] args) throws IOException {
		File excelLoc = new File("C:\\Users\\utham\\eclipse-workspace\\ProjectFrame\\ExcelRead\\Book (1).xlsx");
		FileInputStream fIn = new FileInputStream(excelLoc);
		Workbook w = new XSSFWorkbook(fIn);
		Sheet s = w.getSheet("Data");
		Row r = s.getRow(1);
		Cell c = r.getCell(0);
		System.out.println(c);
		
	}

}
