package UtilityLayer;

import org.apache.poi.xssf.usermodel.XSSFCell;
import org.apache.poi.xssf.usermodel.XSSFSheet;

public class ExcelReaderPage {
	private static XSSFSheet sheet;

	public ExcelReader(String ExcelPath, String SheetName) throws Exception {
		sheet = new XSSFWorkbook(new FileInputStream(ExcelPath)).getSheet(SheetName);
	}

	public static Object getCellType(int row, int cell) {
		XSSFCell cells = sheet.getRow(row).getCell(cell);

		if (cells == null || cells.getCellType() == XSSFCell.CELL_TYPE_BLANK) {
			return " ";
		} else {
			if (cells.getCellType() == XSSFCell.CELL_TYPE_STRING) {
				return cells.getStringCellValue();
			} else if (cells.getCellType() == XSSFCell.CELL_TYPE_NUMERIC) {
				return cells.getRawValue();
			} else if (cells.getCellType() == XSSFCell.CELL_TYPE_BOOLEAN) {
				return cells.getBooleanCellValue();
			} else {
				return "Please Check Excel sheet Test Data format";
			}
		}
	}

	public static Object[][] getAllTestData() {
		int rowCount = sheet.getLastRowNum() + 1;
		int cellCount = sheet.getRow(0).getLastCellNum();

		Object[][] testData = new Object[rowCount][cellCount];

		for (int i = 0; i < rowCount; i++) {
			for (int j = 0; j < cellCount; j++) {
				testData[i][j] = getCellType(i, j);
			}
		}
		return testData;
	}

	public static Object[][] getAllTestData(int startRow, int endRow) {

		int rowCount = endRow - startRow;

		int cellCount = sheet.getRow(startRow).getLastCellNum();

		Object[][] testData = new Object[rowCount][cellCount];

		int p = 0;
		for (int i = startRow; i < endRow; i++) {
			int k = 0;
			for (int j = 0; j < cellCount; j++) {
				testData[p][k] = getCellType(i, j);

				k++;
			}

			p++;
		}

		return testData;
	}

	public static Object[][] getallTestData(int startCell, int endCell) {

		int rowCount = sheet.getLastRowNum() + 1;
		int cellCount = endCell - startCell;

		Object[][] testData = new Object[rowCount][cellCount];

		int p = 0;

		for (int i = 0; i < rowCount; i++) {
			int k = 0;
			for (int j = startCell; j < endCell; j++) {
				testData[p][k] = getCellType(i, j);
				k++;
			}

			p++;
		}

		return testData;
	}

	public static Object[][] getAllTestData(int startRow, int endRow, int startCell, int endCell) {

		int rowCount = endRow - startRow;
		int cellCount = endCell - startCell;

		Object[][] testData = new Object[rowCount][cellCount];

		int p = 0;

		for (int i = startRow; i < endRow; i++) {
			int k = 0;
			for (int j = startCell; j < endCell; j++) {
				testData[p][k] = getCellType(i, j);
				k++;
			}

			p++;
		}

		return testData;
	}

}
