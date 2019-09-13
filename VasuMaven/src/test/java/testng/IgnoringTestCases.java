package testng;

import org.testng.annotations.Test;

public class IgnoringTestCases
{
	@Test(priority=1)
	public void appLaunch()
	{
		System.out.println("AppLaunch");
	}
	@Test(priority=2,invocationCount=5)
	public void appLogin()
	{
		System.out.println("AppLogin");
	}
	@Test(priority=3,enabled=true)
	public void empCreation()
	{
		System.out.println("EmpCreation");
	}

}
