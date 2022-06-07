package week3.day2;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Set;

public class Assignment2RemoveDuplicates {
	
	
	
	public static void main(String args[])
	{
		String text = "We learn java basics as part of java sessions in java week1";
		
//		string into array
		String[] duplicates = text.split("\\s");
		
		
//		for (int i=0; i<duplicates.length; i++) {
		
//			System.out.println(duplicates[i]);
//		}
		
		Set<String> set = new LinkedHashSet <String>(Arrays.asList(duplicates));
		
		String joined = String.join(" ", set);
		
		System.out.println(joined);
		
		List<String> list = new ArrayList<String>(set);
		
		String joined2 = String.join(" ", list);
		
		System.out.println(joined2);
	
	}
}

