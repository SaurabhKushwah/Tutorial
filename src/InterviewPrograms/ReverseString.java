package InterviewPrograms;

public class ReverseString {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
	
		String s = new String("My Name is James Bond");
		
		char[] arr = s.toCharArray();
		
		String outString = "";
		
		for(int i = arr.length -1 ; i >= 0 ; i--) {
			outString = outString + arr[i];
		}
		
		System.out.println("The reversed String is : " + outString);

	}

}
