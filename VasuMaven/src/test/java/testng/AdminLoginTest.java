package testng;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class AdminLoginTest
{
@Test
public void adminLogin()
{
	System.setProperty("webdriver.chrome.driver", "D:\\chromedriver.exe");
	WebDriver driver=new ChromeDriver();
	driver.manage().window().maximize();
	driver.get("Http://Primusbank.qedgetech.com");
	driver.findElement(By.id("txtuId")).sendKeys("Admin");
	driver.findElement(By.id("txtPword")).sendKeys("Admin");
    driver.findElement(By.id("login")).click();
}
}
