package dummy;

import java.util.ArrayList;

public class ReverseAString {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		String str = new String("Palindrome");
		
		char[] arr = str.toCharArray();
		String outstring = "";
		
		for(int i = arr.length-1 ; i>=0 ; i --)
		{
			System.out.println(arr[i]);
			outstring = outstring+arr[i];
		}
		
		System.out.println(outstring);
	}

}
