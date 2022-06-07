package week3.day1.assignment3.org.student;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

import week3.day1.assignment3.org.department.Department;
public class Student extends Department {
	
//	methods studentName(),studentDept(),studentId()
//	Using array
	public void studentName()
	{
	    String studentName[] = {"Kalai", "Kanimozhi"};
		System.out.println(studentName[0]);
	}
	
//	Using arraylist
	public void studentDept()
	{
		List<String> dep = new ArrayList<String>();
		dep.add("IT");
		dep.add("Commerce");
		dep.add("Mech");
		dep.add("EEE");
		System.out.println(dep);
		
		ArrayList<String> list = new ArrayList<String>();
		list.addAll(dep);
		Collections.sort(list);
		System.out.println(list);
	}
	
	public void studentId()
	{
		System.out.println("Student ID is 303894");
	}
	
//	Main method
	public static void main(String args [])
	{
		Student student = new Student();
		
//		calling all the methods
		student.collegeCode();
		student.collegeName();
		student.collegeRank();
		student.deptName();
		student.studentDept();
		student.studentId();
		student.studentName();	
	}
}
