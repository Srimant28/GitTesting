package BlessingsAuto.BlessingsTests;

import java.io.FileInputStream;
import java.io.IOException;

import org.apache.poi.EncryptedDocumentException;
import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.ss.usermodel.WorkbookFactory;

public class ReadDataExcel {

	public static void main(String[] args) throws EncryptedDocumentException, IOException {
		// TODO Auto-generated method stub

		FileInputStream file = new FileInputStream("C:\\Users\\KIIT\\Downloads\\New folder\\Book1.XLSX");

		Workbook wb = WorkbookFactory.create(file);
		Sheet s = wb.getSheet("Sheet1");
		Row r = s.getRow(2);
		Cell c = r.getCell(0);
		String sval = c.getStringCellValue();
		System.out.println("the value is:" + sval);
	}

}
