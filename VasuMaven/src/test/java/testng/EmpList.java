package testng;

import org.openqa.selenium.By;
import org.testng.annotations.Test;

public class EmpList extends OHRMTestNG
{
@Test
public void empList()
{
	 driver.findElement(By.linkText("PIM")).click();
	 driver.findElement(By.linkText("Employee List")).click();
	 
}
}
