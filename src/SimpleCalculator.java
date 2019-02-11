
public class SimpleCalculator 
{
	//fields always come first
	private int count = 0;
	
	//methods, static is not used because we are not calling through a class, we are calling through an object
	public int add(int num1, int num2)
	{
		count++;
		return num1 + num2;
	}
	
	public int subtract(int num1, int num2)
	{
		count++;
		return num1 - num2;
	}
	
	public int getCount()
	{
		return count;
	}
	
	public void resetCount()
	{
		count = 0;
	}
	
	
}
