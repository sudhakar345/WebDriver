package selenium;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;

import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class CharanTest {

	public static void main(String[] args) throws Exception
	{
		 File srcFile=new File("C:\\Users\\qedgelab6\\Desktop\\TestData.xlsx");
	      
			FileInputStream fis=new FileInputStream(srcFile);
			XSSFWorkbook wb=new XSSFWorkbook(fis);
			XSSFSheet ws=wb.getSheet("Sheet1");
			//here this comment will increase the row column and prints untill last row 
			int rcnt=ws.getLastRowNum();
			
			for (int i = 1; i <=rcnt; i++) 
			{
				System.setProperty("webdriver.chrome.driver", "D:\\chromedriver.exe");
				WebDriver driver=new ChromeDriver();
				driver.manage().window().maximize();
				driver.get("Http://Primusbank.qedgetech.com");
				driver.findElement(By.id("txtuId")).sendKeys("Admin");
				driver.findElement(By.id("txtPword")).sendKeys("Admin");
		        driver.findElement(By.id("login")).click();
			String branchName=ws.getRow(i).getCell(0).getStringCellValue();	
			String add1=ws.getRow(i).getCell(1).getStringCellValue();
			driver.findElement(By.xpath("//*[@id='Table_01']/tbody/tr[2]/td/table/tbody/tr[2]/td/a/img")).click();
			driver.findElement(By.xpath("//*[@id='BtnNewBR']")).click();
			driver.findElement(By.id("txtbName")).sendKeys(branchName);
			driver.findElement(By.id("txtAdd1")).sendKeys(add1);
			driver.findElement(By.id("txtZip")).sendKeys("50008");
			Thread.sleep(2000);
			driver.findElement(By.id("lst_counrtyU")).sendKeys("INDIA");
			Thread.sleep(2000);
			driver.findElement(By.id("lst_stateI")).sendKeys("Andhra Pradesh");
			Thread.sleep(2000);
			driver.findElement(By.id("lst_cityI")).sendKeys("Hyderabad");
			Thread.sleep(2000);
			driver.findElement(By.id("btn_insert")).click();
			
			//validation
			Alert al=driver.switchTo().alert();
			
			String msg=al.getText();
			al.accept();
			if (msg.contains("created Sucessfully")) 
			{
				ws.getRow(i).createCell(2).setCellValue("Pass");
			}else
				if(msg.contains("already Exist"))
				{
					ws.getRow(i).createCell(2).setCellValue("Fail");
				}else
					if(msg.contains("Please fill"))
					{
						ws.getRow(i).createCell(2).setCellValue("Warning");
					}
			
			FileOutputStream fos=new FileOutputStream(srcFile);
			wb.write(fos);
        
			driver.findElement(By.xpath("//*[@id='Table_01']/tbody/tr/td[1]/a/img")).click();
			
			driver.close();
			}
	wb.close();

	}
	

	

}
