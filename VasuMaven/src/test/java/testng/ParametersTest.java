package testng;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;
public class ParametersTest
{
@DataProvider
public Object [][] getData()
{
	Object [][] data=new Object[1][3];
	
	data [0][0]="Http://Primusbank.qedgetech.com";
	data [0][1]="Admin";
	data [0][2]="Admin";
	
	return data;
}
@Test(dataProvider="getData")
public void adminLogin(String url,String userName,String password)
{
	System.setProperty("webdriver.chrome.driver", "D:\\chromedriver.exe");
	WebDriver driver=new ChromeDriver();
	driver.manage().window().maximize();
	driver.get(url);
	driver.findElement(By.id("txtuId")).sendKeys(userName);
	driver.findElement(By.id("txtPword")).sendKeys(password);
    driver.findElement(By.id("login")).click();
}
}
