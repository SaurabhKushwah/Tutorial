package dummy;

import java.util.HashMap;
import java.util.HashSet;
import java.util.Set;

public class DuplicateCharactersInString {

	public void duplicate(String sample)
	{
		HashMap<Character, Integer> map = new HashMap<Character, Integer>();
		char[] arr = sample.toCharArray();
		
		for(char ch : arr)
		{
			if(map.containsKey(ch))
			{
				map.put(ch, map.get(ch)+1);
			}
			else
			{
				map.put(ch, 1);
			}
		}
		
		Set<Character> charKeySet = map.keySet();
		
		for(char ch : charKeySet)
		{
			System.out.println(ch + "-" +map.get(ch));
		}
	}
	
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		DuplicateCharactersInString d = new DuplicateCharactersInString();
		d.duplicate("TaaaajMaaahhhhaaal");

	}

}
