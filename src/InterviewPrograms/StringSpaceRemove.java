package InterviewPrograms;

public class StringSpaceRemove {

	
	
	
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
	
		String s = new String("My name is Saurabh Kushwah");
		String[] arr = s.split(" ");
		String outString = "";
		for (int i =0; i < arr.length; i++) {
			outString = outString + arr[i];
		}
		System.out.println("The string without space is : " + outString);
		//number of spaces
		int noOfSpaces = arr.length - 1;
		System.out.println("Number of white spaces : " + noOfSpaces);
		
		//another way to replace space
		System.out.println("Another way to remove space :" + s.replaceAll(" ", ""));
	}

}
