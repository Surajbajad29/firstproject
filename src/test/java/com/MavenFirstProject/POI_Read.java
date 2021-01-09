package com.MavenFirstProject;

import java.io.FileInputStream;
import java.io.FileNotFoundException;

import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.ss.usermodel.WorkbookFactory;
import org.testng.annotations.Test;

public class POI_Read {

	
	@Test
	public void test01() throws Exception{
		FileInputStream fis = new FileInputStream("LoginTestData.xlsx");
		
		Workbook wb = WorkbookFactory.create(fis);
		
		Sheet sh = wb.getSheetAt(0);//login
		int row = sh.getPhysicalNumberOfRows();//4
		
		int col = sh.getRow(row - 1).getPhysicalNumberOfCells();//2
				
				for(int i =0;i<row;i++){
					for (int j= 0; j<col;j++){
						
						Cell cell =sh.getRow(i).getCell(j);
						
						System.out.print(cell.toString()+"   ");
					}
					System.out.println();

				}
				
		
	}
}
