package BlessingsAuto.BlessingsTests;

import java.io.FileInputStream;
import java.io.IOException;

import org.apache.poi.EncryptedDocumentException;
import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.ss.usermodel.WorkbookFactory;

public class ExcelData {

	public String getReadData(String Sheet1, int row, int col) throws EncryptedDocumentException, IOException {

		FileInputStream file = new FileInputStream("C:\\Users\\KIIT\\Downloads\\New folder\\Book1.XLSX");

		Workbook wb = WorkbookFactory.create(file);
		Sheet s = wb.getSheet("Sheet1");
		Row r = s.getRow(row);
		Cell c = r.getCell(col);
		String sval = c.getStringCellValue();
		System.out.println("the value is:" + sval);
		return sval;
	}

	public int getRowNum(String Sheet1) throws EncryptedDocumentException, IOException {
		FileInputStream file = new FileInputStream("C:\\Users\\KIIT\\Downloads\\New folder\\Book1.XLSX");

		Workbook wb = WorkbookFactory.create(file);
		Sheet s = wb.getSheet("Sheet1");
		int retval = s.getLastRowNum();
		System.out.println("last row number is :" +retval);
		return retval;

	}
}
