package week3.day2;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Set;
import java.util.TreeSet;

public class Assignment3MissingNumbers {
	
	public static void main (String args[])
	{
//		declaring array
		Integer[] numbers = {4,6,7,2,3,1,9,10,8,8,6,2};
		
//		convertArrayToSet
		Set<Integer> set = new TreeSet <Integer> (Arrays.asList(numbers));
		System.out.println(set);
		
//		set to array because set method does not have get method
		List<Integer> list = new ArrayList<Integer>(set);
		System.out.println(list);
		
//		iterating to find missing number
		for (int i = 0; i < list.size()-1; i++) {
			
			if(list.get(i)+1 != list.get(i+1)) {
				System.out.println(list.get(i));
			}	
			}
	}
}



