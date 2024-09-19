package fileIOtask;

import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

import org.apache.poi.xssf.usermodel.XSSFCell;
import org.apache.poi.xssf.usermodel.XSSFRow;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class FileWrite {

	public static void main(String[] args) throws IOException {

		XSSFWorkbook wb = new XSSFWorkbook();
		XSSFSheet st = wb.createSheet("Sheet1");

		Object info[][] = { { "Name", "Age", "Email" }, { "John Doe", 30, "john@test.com" },
				{ "Jane Doe", 28, "jane@test.com" }, { "Bob Smith", 35, "jacky@example.com" },
				{ "Swapnil", 37, "Swapnil@example.com" } };

		int rows = info.length;
		int cols = info[0].length;
		System.out.println(rows);
		System.out.println(cols);

		for (int r = 0; r < rows; r++) {
			XSSFRow row = st.createRow(r);
			for (int c = 0; c < cols; c++) {
				XSSFCell cell = row.createCell(c);

				Object value = info[r][c];
				if (value instanceof String)
					cell.setCellValue((String) value);
				if (value instanceof Integer)
					cell.setCellValue((Integer) value);
				if (value instanceof Boolean)
					cell.setCellValue((Boolean) value);
			}
		}
		String filepath = ".\\excel\\Employees.xlsx";
		FileOutputStream fos = new FileOutputStream(filepath);
		wb.write(fos);
		fos.close();
		System.out.println("Employees information are uploaded");

	}

}
