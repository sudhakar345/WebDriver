package testng;

import org.testng.Assert;
import org.testng.annotations.Test;

public class DependOnMethod 
{
	@Test(priority=1)
	public void launchingUrl()
	{
		System.out.println("launching url");
		Assert.fail("Launching was not successfully");
	}
	@Test(priority=2,dependsOnMethods="launchingUrl",alwaysRun=true)
	public void enterCredentials()
	{
		System.out.println("enter valid credentials");
	}
	@Test(priority=3,dependsOnMethods="enterCredentials")
	public void loginTest()
	{
		System.out.println("login was successfull");
	}
}
