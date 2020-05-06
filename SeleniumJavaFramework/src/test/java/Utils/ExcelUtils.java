package Utils;

import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class ExcelUtils {
	static String projectPath;
	static XSSFWorkbook workbook;
	static XSSFSheet sheet;


	public ExcelUtils(String excelPath,String sheetName){
		try {

			workbook=new XSSFWorkbook(excelPath);
			sheet=workbook.getSheet(sheetName);	
		}catch (Exception exp) {
			exp.printStackTrace();
		}


	}

	public static void main(String[] args) {
		//to get rowcount of excel file
		//getRowCount();

		//To get string cell data of excel file
		//getCellDataSring(0,0 );

		//To get number cell data of excel file
		//getCellDataNumber(1,1);

		//to get column count
		//getColCount();
	}

	public int getRowCount() {
		int rowCount=0;
		try {
			rowCount=sheet.getPhysicalNumberOfRows();
			System.out.println("Number of rows: "+rowCount);			
		}
		catch (Exception exp) {
			System.out.println(exp.getMessage());
			System.out.println(exp.getCause());
			exp.printStackTrace();
		}
		return rowCount;
	}

	public String getCellDataSring(int rowNum,int colNum) {
		String cellData=null;
		try {
			//In excel row and columns starts with 0 index
			//use getStringCellValue() to get string value from the cell
			cellData=sheet.getRow(rowNum).getCell(colNum).getStringCellValue();
			//System.out.print("cellData is: "+cellData);
			
		}
		catch (Exception exp) {
			System.out.println(exp.getMessage());
			System.out.println(exp.getCause());
			exp.printStackTrace();
		}
		return cellData;
	}

	public static void getCellDataNumber(int rowNum,int colNum) {
		try {
			//In excel row and columns starts with 0 index
			//use getNumericCellValue() to get number value from the cell
			double cellData=sheet.getRow(rowNum).getCell(colNum).getNumericCellValue();
			System.out.println("cellData is: "+cellData);

		}
		catch (Exception exp) {
			System.out.println(exp.getMessage());
			System.out.println(exp.getCause());
			exp.printStackTrace();
		}
	}

	public int getColCount() {
		int colCount=0;
		try {			
			colCount=sheet.getRow(0).getPhysicalNumberOfCells();
			System.out.println("Number of columns: "+colCount);
		}
		catch (Exception exp) {
			System.out.println(exp.getMessage());
			System.out.println(exp.getCause());
			exp.printStackTrace();
		}
		return colCount;
	}

}
