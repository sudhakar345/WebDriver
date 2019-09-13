package testng;

import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class Annotation1
{
	@Test
	public void appLogin()
	{
		System.out.println("appLogin Executed");
	}
	@BeforeTest
	public void beforeTest()
	{
		
		System.out.println("Before Test Executed");
		
	}
	

	@AfterTest
	public void afterTest()
	{
		System.out.println("After Test Executed");
	}
	
}
