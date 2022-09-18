package com.spryhealth.utilities;

import java.io.File;
import java.io.FileInputStream;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class ExcelDataProvider {

	XSSFWorkbook wb;

	public ExcelDataProvider() {

		File src = new File("./TestData/PNR.xlsx");
		try {
			FileInputStream fis = new FileInputStream(src);
			wb = new XSSFWorkbook(fis);
		} catch (Exception e) {
			System.out.println("Unable to read excel file" + e.getMessage());
		}
	}

	public String getPNR(String sheetname, int row, int column) {
		return wb.getSheet(sheetname).getRow(row).getCell(column).getRawValue().toString();
		
	}

}
