package utilitys;

import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

import org.apache.poi.xssf.usermodel.XSSFCell;
import org.apache.poi.xssf.usermodel.XSSFRow;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class Writeutil {

	public static void main(String[] args) throws IOException {

		XSSFWorkbook workbook = new XSSFWorkbook();
		XSSFSheet sheet = workbook.createSheet("SampleWrite");

		Object input[][] = { { "Name", "Age", "Subject" }, { "Deepika", 29, "Maths" }, { "Hari", 32, "Science" },
				{ "Siana", 3, "English" } };

		int row = input.length;
		int col = input[0].length;

		System.out.println("No of Rows: " + row);
		System.out.println("No of Cols: " + col);

		for (int r = 0; r < row; r++) {
			XSSFRow Rows = sheet.createRow(r);
			for (int c = 0; c < col; c++) {
				XSSFCell cell = Rows.createCell(c);

				Object value = input[r][c];
				if (value instanceof Integer)
					cell.setCellValue((Integer) value);
				if (value instanceof String)
					cell.setCellValue((String) value);
				if (value instanceof Boolean)
					cell.setCellValue((Boolean) value);
				if(value instanceof Float)
					cell.setCellValue((Float) value);
			}
		}

		String filepath = ".\\excel\\SampleWrite.xlsx";
		FileOutputStream fos;

		fos = new FileOutputStream(filepath);
		workbook.write(fos);
		fos.close();
		System.out.println("Write Done");

	}

}
