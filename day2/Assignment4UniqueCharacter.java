package week3.day2;
import java.util.HashSet;
import java.util.Set;

public class Assignment4UniqueCharacter {

	public static void main(String[] args) {
		
		String str = "babu";

//		converting string to character
		char[] character = str.toCharArray();
		
//		HashSet
		Set<Character> set = new HashSet<Character>();

//		Adding unique character to the list
		for (int i = 0; i < character.length; i++)
		{
			if (set.contains(character[i])) 
			{
				set.remove(character[i]);
			} else 
			{
				set.add(character[i]);

			}
		}
		System.out.println(set);
		
	}

}
