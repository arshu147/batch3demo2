package testng;

import java.io.FileInputStream;
import java.io.FileNotFoundException;

import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.ss.usermodel.WorkbookFactory;
import org.testng.annotations.DataProvider;

public class Dataprov {
	

	@DataProvider(name="dataprov")
	public String[][] dataP() throws Exception {
		//public static void main(String[] args) throws
		//Exception{
			
		
		 String[][] arr;
		
		
		FileInputStream fis= new FileInputStream("I:\\demo1.xlsx");
	Workbook wb = WorkbookFactory.create(fis);
	Sheet sheet = wb.getSheet("Sheet1");
	arr=new String[sheet.getPhysicalNumberOfRows()-1][sheet.getRow(0).getLastCellNum()];
		for(int i=1;i<sheet.getPhysicalNumberOfRows();i++) {
		   for(int j=0;j<sheet.getRow(i).getLastCellNum();j++) {
			   
			  			   
			   Cell data = sheet.getRow(i).getCell(j);
			   //System.out.print(data);
			  // System.out.println(data);
//			   arr[i-1][j]=data.toString();
//			   System.out.println(arr[i][j]);
			   arr[i-1][j]=data.toString();
//			   
		   }
		  // System.out.println();
		
		}
		
	
	return arr;
	}
	
}
