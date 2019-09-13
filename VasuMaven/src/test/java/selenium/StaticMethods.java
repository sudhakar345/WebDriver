package selenium;

public class StaticMethods
{
	//static method with return-type with-out parameters
	
	public static int  add()
	{
		int i=30;
		int j=45;
		int sum=i+j;
		return sum;
		
	}
	
	public static void main(String[] args)
	{
		add();//it won't return a value
		int res=add();//calling the static method with method name  , no need to create any object reference
		System.out.println(res);
	}
}
