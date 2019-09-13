package testng;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.BeforeTest;

public class OHRMTestNG 
{
	WebDriver driver;
@BeforeSuite
public void appLaunch()
{
	System.setProperty("webdriver.chrome.driver", "D:\\chromedriver.exe");
	driver=new ChromeDriver();
	driver.manage().window().maximize();
	driver.get("http://orangehrm.qedgetech.com/symfony/web/index.php/auth/login");
	//Validation
	Assert.assertTrue(driver.findElement(By.id("txtUsername")).isDisplayed());
}
@BeforeTest
public void appLogin()
{
	driver.findElement(By.id("txtUsername")).sendKeys("Admin");
	driver.findElement(By.id("txtPassword")).sendKeys("Qedge123!@#");
	driver.findElement(By.id("btnLogin")).click();
	//validation
	Assert.assertTrue(driver.findElement(By.linkText("PIM")).isDisplayed());

}
@AfterTest
public void appLogout() throws Throwable
{
	driver.findElement(By.id("welcome")).click();
	Thread.sleep(2000);
	driver.findElement(By.linkText("Logout")).click();
	//validate
	Assert.assertTrue(driver.findElement(By.id("txtUsername")).isDisplayed());
}
@AfterSuite
public void appClose()
{
	driver.close();
}

}
