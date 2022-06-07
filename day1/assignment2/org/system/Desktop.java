package week3.day1.assignment2.org.system;

public class Desktop extends Computer {
	
//	A desktop size method created
	
	public String desktopSize()
	{
		String deskTopSize1 = "15 inch";
		return deskTopSize1;
	}
	
//	Calling all the methods
	public static void main (String args[])
	{
		Desktop desk = new Desktop();
		System.out.println(desk.computerModel());
		System.out.println(desk.desktopSize());
		
	}
}
