package testng;

import org.testng.SkipException;
import org.testng.annotations.Test;

public class SkipTestCases
{

	@Test(priority=1)
	public void withoutSkip()
	{
		System.out.println("withoutSkip");
	}
	@Test(priority=2)
	public void skipTestCase()
	{
		throw new SkipException("Skipping- This Test Case is not ready");
	}
	
}
