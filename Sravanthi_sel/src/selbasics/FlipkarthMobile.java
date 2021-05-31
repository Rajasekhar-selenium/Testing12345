package selbasics;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.util.Set;

import org.apache.poi.xssf.usermodel.XSSFCell;
import org.apache.poi.xssf.usermodel.XSSFRow;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class FlipkarthMobile 
{
	@Test
	public void testing() throws InterruptedException, IOException
	{
		
		String cvalue = null;
		
		String Mname = null;
		
		String cost = null;
	
		//System.setProperty("webdriver.chrome.driver", "D:\\Sekhar_classes\\sravanthi_fst\\dump\\chromedriver_win32\\chromedriver.exe");
		  FileInputStream fis = new FileInputStream("D:\\Sekhar_classes\\sravanthi_fst\\dump\\testdata.xlsx");
		  
		  XSSFWorkbook wb = new XSSFWorkbook(fis);
		  
		  XSSFSheet sh = wb.getSheet("Sheet2");
		  
		  int rowcount = sh.getPhysicalNumberOfRows();
		  
		  System.out.println(rowcount);
		  
		  for(int i =1 ; i<rowcount; i++)
		  {
			 XSSFRow row =  sh.getRow(i);
			 
			 for(int j =0; j< row.getPhysicalNumberOfCells(); j++)
			 {
				// System.out.println(row.getCell(j).getNumericCellValue());
				 
				  cvalue = row.getCell(j).getStringCellValue();
		     }
			 
			 
			 WebDriver d = new ChromeDriver();
				
			    d.manage().window().maximize();
			    
				d.get("https://www.flipkart.com/");
				
				Thread.sleep(3000);
				
				d.findElement(By.xpath("//*[text()='✕']")).click();
				
				d.findElement(By.name("q")).sendKeys(cvalue);
				
				d.findElement(By.xpath("//*[@type='submit']")).click();
				
				Thread.sleep(3000);
				
				d.findElement(By.xpath("(//*[@class='_4rR01T'])[7]")).click();
				Thread.sleep(3000);
				
				Set<String> window = d.getWindowHandles();
				
				System.out.println(window.size());
				
				for(String win : window)
				{
					String title = d.switchTo().window(win).getTitle();
					
				String exptitle = 	"Mobiles- Buy Products Online at Best Price in India - All Categories | Flipkart.com";
					
					System.out.println(title);
					
					if(!title.contains(exptitle))
					{
						 Mname = d.findElement(By.className("B_NuCI")).getText();
						
						System.out.println(Mname);
						
		                 cost = d.findElement(By.xpath("//*[@class='_25b18c']/div")).getText();
		               
						System.out.println(cost);
						
		             }
					
					
		
				}
		
				XSSFCell col = sh.getRow(i).createCell(1);
				 
				 col.setCellValue(Mname);
				 
					XSSFCell col1 = sh.getRow(i).createCell(2);
					
					 col1.setCellValue(cost);
				 
				 FileOutputStream os = new FileOutputStream("D:\\Sekhar_classes\\sravanthi_fst\\dump\\testdata.xlsx");
				 
				 wb.write(os);
	}

}
}