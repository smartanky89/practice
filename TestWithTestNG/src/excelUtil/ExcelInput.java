package excelUtil;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;

import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import org.testng.annotations.Test;

public class ExcelInput{
	
	@Test
	public Object[][] dataExcel() throws Exception {
		Object[][] dataCollect = null;
	try{
	String fileLocation = "C:\\Users\\achauhan26\\Desktop\\Testing_Documents\\data1.xlsx";
	FileInputStream fs = new FileInputStream(fileLocation);
	XSSFWorkbook wb = new XSSFWorkbook(fs);
	XSSFSheet sh = wb.getSheet("Sheet1");
	int row = sh.getLastRowNum();
	int col = sh.getRow(0).getLastCellNum();
	System.out.println(col+"  "+row);
	String data0 = sh.getRow(2).getCell(1).getStringCellValue();
	System.out.println(data0);
	sh.getRow(2).createCell(2).setCellValue("Its not that easy");
	FileOutputStream fout= new FileOutputStream(fileLocation);
	wb.write(fout);
	wb.close();
	} catch(FileNotFoundException e) {
		System.out.println("File not found");
	}
	return dataCollect;
	}
}
