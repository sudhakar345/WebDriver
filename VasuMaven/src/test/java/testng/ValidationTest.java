package testng;



import org.openqa.selenium.By;
import org.testng.Assert;
import org.testng.annotations.Test;



public class ValidationTest
{

	@Test
	public void validation()
	{
		String data="VasuDeva";
		String data1="Selenium";
		//not using if statement in testng
		/*if (data.equalsIgnoreCase(data1))
		{
			System.out.println("Pass");
		}else
		{
			System.out.println("Fail");
		}*/
		
		//Assert.assertEquals(data, data1);
		//Assert.assertEquals(12, 13);
		
		//Assert.assertTrue(driver.findElemenet(By.id("")).isDispalyed());
	}
	
}
