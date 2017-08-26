package dataprovider;

import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;

import org.apache.poi.xssf.usermodel.XSSFRow;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import org.testng.annotations.Test;

public class ExcelData {
	@Test
	public void readExcel() throws IOException{
	XSSFWorkbook wb;
	XSSFSheet sheet;
	XSSFRow row;
	int rowcount, colcount;
String data[][] = null;	
	{

		FileInputStream fis = new FileInputStream(new File("./Data/Test1.xlsx"));
		wb = new XSSFWorkbook(fis);
		sheet = wb.getSheetAt(0);
		row = sheet.getRow(0);
		rowcount = sheet.getLastRowNum();
		colcount = row.getLastCellNum();
		data = new String [rowcount][colcount];
		for (int i = 1; i < rowcount; i++) {
			row = sheet.getRow(i);
			for (int j = 0; j <colcount; j++) {
				String cellvalue = row.getCell(j).getStringCellValue();
				System.out.println("list of data provided:" + cellvalue);
				data[i][j]= cellvalue;			
			}
			fis.close();
			//wb.close();
		}
		//return data;
	}
	}
}


