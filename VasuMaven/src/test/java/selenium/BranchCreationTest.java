package selenium;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class BranchCreationTest 
{

	public static void main(String[] args) throws Exception 
	{
		System.setProperty("webdriver.chrome.driver", "D:\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("Http://Primusbank.qedgetech.com");
		driver.findElement(By.id("txtuId")).sendKeys("Admin");
		driver.findElement(By.id("txtPword")).sendKeys("Admin");
        driver.findElement(By.id("login")).click();
        
		driver.findElement(By.xpath("//*[@id='Table_01']/tbody/tr[2]/td/table/tbody/tr[2]/td/a/img")).click();
		driver.findElement(By.xpath("//*[@id='BtnNewBR']")).click();
		driver.findElement(By.id("txtbName")).sendKeys();
		driver.findElement(By.id("txtAdd1")).sendKeys("ameerpet");
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
			System.out.println("Pass");
		}else
			if(msg.contains("already Exist"))
			{
				System.out.println("Fail");
			}else
				if(msg.contains("Please fill"))
				{
					System.out.println("Warning");
				}
		

		
		

	}

}
