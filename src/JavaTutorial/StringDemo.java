package JavaTutorial;

public class StringDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		/*String is an prebuilt class in JAVA
		//Two ways to define string
		 1) String Literal
		 2) By Creating an object* */
		
		String S1 = "Saurabh";
		String S2 = "Saurabh";
		//A new object won't be created where as S1 will be referred to S2
		String S3 = new String("Saurabh");
		String S4 = new String("Saurabh");
		//Two separted object will be created here with the value "Saurabh"
		
		System.out.println(S1.charAt(4));
		System.out.println(S1.indexOf("b"));
		System.out.println(S1.indexOf("a"));
		//Z is not there in the String hence -1 index
		System.out.println(S1.indexOf("z"));
		System.out.println(S2.substring(3, 6));
		System.out.println(S2.substring(2));
		//Concatenation
		System.out.println(S1.concat(" is my name"));
		//length
		System.out.println(S2.length());
		
		String S5 = new String("  String with Space");
		System.out.println(S5.trim());
		System.out.println("Lower Case" + S1.toLowerCase());
		//Split 
		
		// Replace and count the spaces
		String S6 = new String("Saurabh is my name");
		String arr[] = S6.split(" ");
		String out = "";
		for (int i=0; i < arr.length; i++) {
			out = out + arr[i];
		}
		System.out.println(out);
		
		int numberOfSpaces = arr.length -1;
		System.out.println("The number of spaces in the sgiven String is : " + numberOfSpaces);
		// another way to replace spaces
		System.out.println("The string after removing space is :" + S6.replaceAll(" ", ""));
		
		
		
		 

	}

}
