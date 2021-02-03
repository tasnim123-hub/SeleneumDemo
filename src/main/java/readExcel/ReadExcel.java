package readExcel;

import java.io.IOException;

import org.apache.poi.xssf.usermodel.XSSFCell;
import org.apache.poi.xssf.usermodel.XSSFRow;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class ReadExcel {

	public static void main(String[] args) throws IOException {
		//open/Enter into the workbook
		XSSFWorkbook wb = new XSSFWorkbook("./data/ReadExcel");
//Get sheet [1]   
	XSSFSheet sheet = wb.getSheet("Sheet1");
	//Get row count
		int rowCount = sheet.getLastRowNum();
		System.out.println(rowCount);
		//Get column count
		int columnCount = sheet.getRow(0).getLastCellNum();
		System.out.println(columnCount);
		//Get row[2]
	for (int i = 1; i <=rowCount; i++) {
		XSSFRow row = sheet.getRow(i);
		//XSSFRow row = sheet.getRow(1);
		
			//Get column[3]
			for (int j = 0; j < columnCount; j++) {
				XSSFCell cell = row.getCell(j);
			//XSSFCell cell = row.getCell(0);
				
			//Actions->Read value[4]
			String cellValue = cell.getStringCellValue();
			System.out.println(cellValue);
		}
	}
	
	
	}

}
