package testng;

import org.testng.annotations.Test;

public class Group2Test
{
	@Test(priority=1,groups={"Smoke"})
	public void smokeTesting3()
	{
		System.out.println("SmokeTesting3");
	}
	@Test(priority=2,groups={"Reg"})
	public void regTesting3()
	{
		System.out.println("regTesting3");
	}
	@Test(priority=3,groups={"Fun"})
	public void funTesting()
	{
		System.out.println("FunctionTest");
	}

	@Test(priority=4,groups={"Fun"})
	public void funTesting1()
	{
		System.out.println("funTesting1");
	}
	
}
