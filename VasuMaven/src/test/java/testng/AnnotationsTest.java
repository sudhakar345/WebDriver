package testng;

import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class AnnotationsTest 
{
	@Test
	public void appLogin()
	{
		System.out.println("appLogin Executed");
	}
	@Test
	public void empCreation()
	{
		System.out.println("empCreation Executed");
	}
@BeforeClass
public void beforeClass()
{
	System.out.println("Before Class Executed");
}
@AfterClass
public void afterClass()
{
	System.out.println("After Class Executed");
}
@BeforeSuite
public void beforeSuite()
{
	System.out.println("Before Suite Executed");
}
@AfterSuite
public void afterSuite()
{
	System.out.println("After Suite Executed");
}

}
