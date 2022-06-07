package week3.day1;
public class Calculator {
	
	public int add(int num1, int num2)
	{
		int add = num1+num2;
		return add;
	}

	public int add(int num1, int num2, int num3)
	{
		int add = num1+num2+num3;
		return add;
	}
	
	public void sub(int num1, int num2) {
		System.out.println(num1 - num2);
	}
	
	public double sub(double num1, int num2)
	{
		double subraction = num1 - num2;
		return subraction;
	}
	
	public int mul(int num1, int num2)
	{
		int multiplication = num1 * num2;
		return multiplication;
	}
	
	public double mul(int num1, double num2)
	{
		double multiplication2 = num1 * num2;
		return multiplication2;
	}
	
	public static void main (String args[]) {
		Calculator cals = new Calculator();	
		System.out.println(cals.add(4, 5));
		System.out.println(cals.add(4, 5, 3));
		cals.sub(9, 4);
		System.out.println(cals.sub(2.5, 10));
		System.out.println(cals.mul(3, 4));
		System.out.println(cals.mul(3, 4.3));
	}
	
}
