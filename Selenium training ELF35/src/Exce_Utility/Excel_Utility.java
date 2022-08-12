package Exce_Utility;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

import org.apache.poi.openxml4j.exceptions.InvalidFormatException;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.ss.usermodel.WorkbookFactory;

public class Excel_Utility {

	static FileInputStream fis;
	public static String[][] readmultipleDataFromExcel(String excelPath, String sheetName) throws InvalidFormatException, IOException{
	try {
		fis=new FileInputStream(excelPath);
	} catch (FileNotFoundException e) {
		// TODO Auto-generated catch block
		e.printStackTrace();
	}	
	Workbook wbook=WorkbookFactory.create(fis);
	org.apache.poi.ss.usermodel.Sheet sheet= wbook.getSheet(sheetName);
	int rowcount=sheet.getPhysicalNumberOfRows();
	int colcount= sheet.getRow(0).getPhysicalNumberOfCells();
	String[][] sarr=new String[rowcount][colcount];
	for(int i=0;i<rowcount;i++) {
		for (int j=0;j<colcount;j++) {
			sarr[i][j]= sheet.getRow(i).getCell(j).toString();
			
			
		}
	}
	return sarr;
	

	}

}
