package excelconcept;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

import org.apache.poi.xssf.usermodel.XSSFCell;
import org.apache.poi.xssf.usermodel.XSSFRow;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import org.testng.annotations.Test;

public class Excel_Automation_Read {
  @Test
  public void Excel_Read() throws IOException 
  {
	 double sumvalue = 0; 
	 
	 int intvalue = 0; 
	  
	  FileInputStream fis = new FileInputStream("D:\\Sekhar_classes\\sravanthi_fst\\dump\\testdata.xlsx");
	  
	  XSSFWorkbook wb = new XSSFWorkbook(fis);
	  
	  XSSFSheet sh = wb.getSheet("Sheet1");
	  
	  int rowcount = sh.getPhysicalNumberOfRows();
	  
	  System.out.println(rowcount);
	  
	  for(int i =1 ; i<rowcount; i++)
	  {
		 XSSFRow row =  sh.getRow(i);
		 
		 for(int j =0; j< row.getPhysicalNumberOfCells(); j++)
		 {
			// System.out.println(row.getCell(j).getNumericCellValue());
			 
			 double cvalue = row.getCell(j).getNumericCellValue();
			 
			 sumvalue = sumvalue + cvalue;
			 
			  intvalue = (int)sumvalue;
		 }
		 
		 System.out.println("Row Value of total sum: "+intvalue);
		 
		 XSSFCell col = sh.getRow(i).createCell(2);
		 
		 col.setCellValue(intvalue);
		 
		 FileOutputStream os = new FileOutputStream("D:\\Sekhar_classes\\sravanthi_fst\\dump\\testdata.xlsx");
		 
		 wb.write(os);
	
	  }
	  
	  wb.close();
  }
}
