package selenium;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class test
{
	public static void main(String[] args) 
	{
		//reusing satic method we simple call the method by using following
		//syntax:
		//classname.methodname();
		//example:
		
		int res=StaticMethods.add();
		System.out.println(res);
	}

}
