package testng;

import org.testng.annotations.Test;

public class MultipleTest
{
@Test(priority=1)
public void appLaunch()
{
	System.out.println("AppLaunch");
}
@Test(priority=2)
public void appLogin()
{
	System.out.println("AppLogin");
}
@Test(priority=3)
public void empCreation()
{
	System.out.println("EmpCreation");
}

@Test
public void appLogout()
{
	System.out.println("AppLogout");
}
@Test
public void appClose()
{
	System.out.println("AppClose");
}
}
