package testng;


import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class BeforeAndAfterTest 
{
	WebDriver driver;
@BeforeTest
public void appLaunch()
{
	System.setProperty("webdriver.chrome.driver", "D:\\chromedriver.exe");
	driver=new ChromeDriver();
	driver.get("Http://Primusbank.qedgetech.com");
	driver.manage().window().maximize();
	
	//validation
	Assert.assertTrue(driver.findElement(By.id("txtuId")).isDisplayed());
}

@AfterTest
public void appClose()
{
	driver.close();
}
@Test
public void appLogin()
{
	driver.findElement(By.id("txtuId")).sendKeys("Admin");
	driver.findElement(By.id("txtPword")).sendKeys("Admin");
    driver.findElement(By.id("login")).click();
}
}
