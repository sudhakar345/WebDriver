package Excel;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;

import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

import selenium.OHRMProject;

public class DataDrivenTest 
{
	public static void main(String[] args) throws Exception
	{
			File srcFile=new File("C:\\Users\\qedgelab6\\Desktop\\EmpData.xlsx");
			FileInputStream fis=new FileInputStream(srcFile);
			XSSFWorkbook wb=new XSSFWorkbook(fis);
			XSSFSheet ws=wb.getSheet("Sheet1");
			int rcnt=ws.getLastRowNum();
			for (int i = 1; i<=rcnt; i++)
			{
				OHRMProject app=new OHRMProject();
				app.appLaunch("http://orangehrm.qedgetech.com/symfony/web/index.php/auth/login");
				app.appLogin("Admin", "Qedge123!@#");
				String fName=ws.getRow(i).getCell(0).getStringCellValue();	
				String lName=ws.getRow(i).getCell(1).getStringCellValue();
				String results=app.employeeCreation(fName, lName);
				ws.getRow(i).createCell(2).setCellValue(results);
				
				FileOutputStream fos=new FileOutputStream(srcFile);
				wb.write(fos);
				app.appLogout();
				app.appClose();
			}
			wb.close();
			

	}

}
