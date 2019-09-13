package Excel;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;

import org.apache.poi.ss.usermodel.CellType;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class ReadingTest
{
	public static void main(String[] args) throws Exception 
	{
		File srcFile=new File("C:\\Users\\qedgelab6\\Desktop\\EmpData.xlsx");
		
		FileInputStream fis=new FileInputStream(srcFile);
		XSSFWorkbook wb=new XSSFWorkbook(fis);
		XSSFSheet ws=wb.getSheet("Sheet1");
		int rcnt=ws.getLastRowNum();
		for (int i =1; i <=rcnt; i++) 
		{
			String data="";
			if(ws.getRow(i).getCell(0).getCellType()==CellType.NUMERIC)
			{
				int cellData=(int)ws.getRow(i).getCell(0).getNumericCellValue();
				data=String.valueOf(cellData);
				
			}else
			{
				data=ws.getRow(i).getCell(0).getStringCellValue();
			}
			
			System.out.println(data);
			
		}
		wb.close();
	}

}
