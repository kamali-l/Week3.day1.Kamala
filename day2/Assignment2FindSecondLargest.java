package week3.day2;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class Assignment2FindSecondLargest {

	public static void main(String[] args) {
		Integer[] numbers = {3,2,11,4,6,7};
		
//		Set<Integer> set = new TreeSet<Integer>(Arrays.asList(numbers));
		
//		Converting array into arraylist
		List<Integer> list = new ArrayList<Integer>(Arrays.asList(numbers));
		
//		Sorting arraylist
		Collections.sort(list);
		
//		finding the size
		int length = list.size();
		
//		finding second largest
		int secondLargest = list.get(length-2);
		System.out.println(secondLargest);
	}
}
