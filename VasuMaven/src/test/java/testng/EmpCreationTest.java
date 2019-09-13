package testng;

import java.io.FileInputStream;
import java.io.FileNotFoundException;

import org.apache.poi.ss.usermodel.CellType;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import org.openqa.selenium.By;
import org.testng.Assert;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

public class EmpCreationTest extends OHRMTestNG
{
	@ DataProvider
	public Object [][] getData() throws Throwable
	{
		Object [][] data=new Object [3][2];
		FileInputStream fis=new FileInputStream("C:\\Users\\qedgelab6\\Desktop\\TestData.xlsx");
		
		XSSFWorkbook wb=new XSSFWorkbook(fis);
		
		XSSFSheet ws=wb.getSheet("Sheet1");
		
		//row count
		
		int rcnt=ws.getLastRowNum();
		System.out.println(rcnt);
		//colum Count
		for (int i=0; i<(rcnt+1); i++)
		{
			int cnt=ws.getRow(i).getLastCellNum();
			
			System.out.println(cnt);
			for (int j =0;j<cnt; j++)
			{
				if(ws.getRow(i).getCell(j).getCellType()==CellType.NUMERIC)
				{
					int celldata=(int)ws.getRow(i).getCell(j).getNumericCellValue();
					System.out.println(String.valueOf(celldata));
					data [i][j]=String.valueOf(celldata);
					
				}else
				{
					System.out.println(ws.getRow(i).getCell(j).getStringCellValue());
					data [i][j]=ws.getRow(i).getCell(j).getStringCellValue();	
				}
			}
			
		}
		return data;
	}
@Test(dataProvider="getData")
public void empCreation(String fName,String lName) throws Throwable
{ 
	Thread.sleep(2000);
	 driver.findElement(By.linkText("PIM")).click();
	 Thread.sleep(2000);
	 driver.findElement(By.linkText("Add Employee")).click();
	 Thread.sleep(2000);
	 driver.findElement(By.id("firstName")).sendKeys(fName);
	 Thread.sleep(2000);
	 driver.findElement(By.id("lastName")).sendKeys(lName);
	 Thread.sleep(2000);
	 driver.findElement(By.id("btnSave")).click();
	 //validation
	 Assert.assertTrue(driver.findElement(By.xpath("//*[@id='profile-pic']/h1")).isDisplayed());
	 

}
}
