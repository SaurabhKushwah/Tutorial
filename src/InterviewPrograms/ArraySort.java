package InterviewPrograms;

import java.util.Arrays;

public class ArraySort {

	
	public void sortArray()
	{
		int a[] = {3,6,1,7,43,0};
		Arrays.sort(a);
		System.out.println(Arrays.toString(a));
//		for(int i =a.length; i>0; i--)
//		{
//			System.out.println(a[i]);
//		}
		int len = a.length; 
		System.out.println("The highest Number : " + a[len-1]);
		
		
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ArraySort as = new ArraySort();
		as.sortArray();
	}

}
