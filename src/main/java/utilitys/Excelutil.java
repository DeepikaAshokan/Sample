package utilitys;

import java.io.IOException;

import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class Excelutil {

	static XSSFSheet sheet;
	static XSSFWorkbook workbook;

	public static void main(String[] args) {

		getRowCount();
		getCellDataNumeric(2,1);
		getCellDataString(2,0);

	}

	public static void getRowCount() {
		String Projectpath = System.getProperty("user.dir");
		try {
			workbook = new XSSFWorkbook(Projectpath + "\\excel\\data.xlsx");
			XSSFSheet sheet = workbook.getSheet("Sheet1");
			int rowcount = sheet.getPhysicalNumberOfRows();
			System.out.println("Row Count: " + rowcount);

		} catch (IOException e) {
			e.printStackTrace();
		}

	}

	public static void getCellDataNumeric(int rn, int cn) {
		String Projectpath = System.getProperty("user.dir");
		try {
			workbook = new XSSFWorkbook(Projectpath + "\\excel\\data.xlsx");
			XSSFSheet sheet = workbook.getSheet("Sheet1");
			int cellData = (int) sheet.getRow(rn).getCell(cn).getNumericCellValue();
			System.out.println(cellData);
		} catch (IOException e) {
			e.printStackTrace();
		}

	}

	public static void getCellDataString(int rn, int cn) {
		String Projectpath = System.getProperty("user.dir");
		try {
			workbook = new XSSFWorkbook(Projectpath + "\\excel\\data.xlsx");
			XSSFSheet sheet = workbook.getSheet("Sheet1");
			String cellData = (String) sheet.getRow(rn).getCell(cn).getStringCellValue();
			System.out.println(cellData);

		} catch (IOException e) {
			e.printStackTrace();
		}

	}
}
