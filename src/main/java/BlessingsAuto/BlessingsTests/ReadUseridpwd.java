package BlessingsAuto.BlessingsTests;

import java.io.FileInputStream;
import java.io.IOException;

import org.apache.poi.EncryptedDocumentException;
import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.ss.usermodel.WorkbookFactory;

public class ReadUseridpwd {

	public static void main(String[] args) throws EncryptedDocumentException, IOException {
		// TODO Auto-generated method stub

		ExcelData data = new ExcelData();
		String Userid = data.getReadData("Sheet1", 2, 0);
		String pwd = data.getReadData("Sheet1", 2, 1);

		System.out.println("Using for loop");

		int rownum = data.getRowNum("Sheet1");

		for (int i = 1; i <= 3; i++) {
			String id = data.getReadData("Sheet1", i, 0);
			String pwd1 = data.getReadData("Sheet1", i, 1);

		}

		System.out.println("Using row no.......");

		for (int i = 1; i <= rownum; i++) {
			String Userid1 = data.getReadData("Sheet1", i, 1);
			String pwd1 = data.getReadData("Sheet1", i, 1);

		}

	}

}
