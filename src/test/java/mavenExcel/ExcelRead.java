package mavenExcel;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.util.Date;
import java.text.SimpleDateFormat;

import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.DateUtil;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class ExcelRead {
	
	public static void main (String[] args) throws Throwable {
		File f = new File("C:\\Users\\DELL\\Desktop\\Book1\\sheet1\\.xlsx");
		FileInputStream f1 = new FileInputStream(f);
		Workbook w = new XSSFWorkbook(f1);
		Sheet s = w.getSheet("Sheet 1");
		
		for(int i=0; i< s.getPhysicalNumberOfRows(); i++) {
			Row r = s.getRow(i);
			
		for(int j=0; j<r.getPhysicalNumberOfCells(); j++) {
			Cell c = r.getCell(j);
			int cellType = c.getCellType(); //string --1, int -- 0
			
			if(cellType==1) {
				String Value= c.getStringCellValue();
				System.out.println(Value);
			}
			else if(cellType==0) {
				if(DateUtil.isCellDateFormatted(c)) {
					Date d = c.getDateCellValue();
					System.out.println(d);
				
					SimpleDateFormat sd = new SimpleDateFormat("MM/dd/yyyy");
					String Value = sd.format(d);
					System.out.println(Value);
				}
				
				else {
					
					double d = c.getNumericCellValue();
					long l = (long)d;
					String Value = String.valueOf(1);
					System.out.println(Value);
			}
			}
		}
		}
	}
}
	