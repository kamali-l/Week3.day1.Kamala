package week3.day2;

public class Assignment1Automation extends Assignment1MultipleLanguage implements Assignment1Language, Assignment1Testtool {
	
//	calling all the methods
	public static void main(String args[])
	{
		Assignment1Automation automation = new Assignment1Automation();
		automation.python();
		automation.java();
		automation.ruby();
		automation.selenium();
	}

//	initializing methods
	public void selenium() 
	{
		System.out.println("This is selenium test tool");
	}

	public void java() 
	{
		System.out.println("This is java programming language");
	}

	@Override
	public void ruby() 
	{
		System.out.println("This is also programming language");
	}
}
