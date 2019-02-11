
public class CalcMain 
{

	public static void main(String[] args) 
	{
		SimpleCalculator calc = new SimpleCalculator();
		
		System.out.println(calc.add(25, 37));
		System.out.println(calc.subtract(10, 5));
		System.out.println(calc.getCount());
		calc.resetCount();
		
	}

}
