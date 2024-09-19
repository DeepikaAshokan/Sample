package fileIOtask;

import java.io.IOException;

import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class FileRead {
	static XSSFWorkbook wb;
	static XSSFSheet st;

	public static void main(String[] args) throws IOException {

		getrowcount();
		Stringgetcelldata(4,2);
		Numericalgetcelldata(1, 1);

	}

	public static void getrowcount() throws IOException {
		String Projectpath = System.getProperty("user.dir");
		XSSFWorkbook wb = new XSSFWorkbook(Projectpath + "\\excel\\Employees.xlsx");
		XSSFSheet st = wb.getSheet("Sheet1");
		int rowcount = st.getPhysicalNumberOfRows();
		System.out.println("The number of rows:" + rowcount);

	}

	public static void Numericalgetcelldata(int rn, int cn) throws IOException {
		String Projectpath = System.getProperty("user.dir");
		XSSFWorkbook wb = new XSSFWorkbook(Projectpath + "\\excel\\Employees.xlsx");
		XSSFSheet st = wb.getSheet("Sheet1");
		int celldata = (int) st.getRow(rn).getCell(cn).getNumericCellValue();
		System.out.println("The Numerical Data : "+celldata);

	}

	public static void Stringgetcelldata(int rn, int cn) throws IOException {
		String ProjectPath = System.getProperty("user.dir");
		XSSFWorkbook wb = new XSSFWorkbook(ProjectPath + "\\excel\\Employees.xlsx");
		XSSFSheet st = wb.getSheet("Sheet1");
		String celldata = st.getRow(rn).getCell(cn).getStringCellValue();
		System.out.println("The String Data : "+celldata);
	}

}
