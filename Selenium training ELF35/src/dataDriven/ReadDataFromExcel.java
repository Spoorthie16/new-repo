package dataDriven;

import java.io.FileInputStream;
import java.io.IOException;
import java.util.Date;

import org.apache.poi.EncryptedDocumentException;
import org.apache.poi.openxml4j.exceptions.InvalidFormatException;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.ss.usermodel.WorkbookFactory;

public class ReadDataFromExcel {

	public static void main(String[] args) throws EncryptedDocumentException, IOException, InvalidFormatException {
		// TODO Auto-generated method stub
		FileInputStream fis = new FileInputStream("./testData/testData.xlsx");
		Workbook workbook = WorkbookFactory.create(fis);
		String data = workbook.getSheet("StringData").getRow(3).getCell(3).getStringCellValue();
		System.out.println(data);
		   double data1 = workbook.getSheet("IntegerData").getRow(5).getCell(2).getNumericCellValue();
			System.out.println(data1);
		 boolean data2 = workbook.getSheet("BooleanData").getRow(14).getCell(3).getBooleanCellValue();
			System.out.println(data2);
		 Date data3 = workbook.getSheet("DateData").getRow(15).getCell(1).getDateCellValue();
			System.out.println(data3);
	}

}
