package testng;

import org.testng.annotations.Test;

public class Group1Test 
{
	@Test(priority=1,groups={"Smoke"})
	public void smokeTesting()
	{
		System.out.println("SmokeTesting");
	}
	@Test(priority=2,groups={"Reg"})
	public void regTesting()
	{
		System.out.println("regTesting");
	}
	@Test(priority=3,groups={"Smoke"})
	public void somkeTesting1()
	{
		System.out.println("somkeTesting1");
	}

	@Test(priority=4,groups={"Reg"})
	public void regTesting1()
	{
		System.out.println("regTesting1");
	}
	
}
