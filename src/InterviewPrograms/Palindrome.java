package InterviewPrograms;

public class Palindrome {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		String s = new String("Madam");
		
		char[] arr = s.toCharArray();
		
		String outString = "";
		
		for (int i = arr.length -1; i >=0 ; i --) {
			outString = outString + arr[i];
		}
		
		System.out.println("Reversed string is : " + outString.toLowerCase());
		
		String a = outString.toLowerCase();
		String b = s.toLowerCase();
		
		System.out.println(a);
		System.out.println(b);
		
		if (a == b) 
			System.out.println("The String is a palindrome" + s.toLowerCase() + outString.toLowerCase());
		else 
			System.out.println("The given string is not palindrome " + s.toLowerCase() + " " + outString.toLowerCase());

	}
}
