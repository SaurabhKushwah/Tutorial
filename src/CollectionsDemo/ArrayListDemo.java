package CollectionsDemo;

import java.util.ArrayList;

public class ArrayListDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		ArrayList<String> al = new ArrayList<String>();
		al.add("4");
		al.add("6");
		al.add("0");
		al.add("3");

		int index = al.indexOf("0");
		System.out.println(index);
		al.add(index+1, "0");
		System.out.println(al);
		
	//	int index = al.indexOf("0");
	//	System.out.println(index);
		al.add(3, "0");
		
		
		ArrayList<String> saa = new ArrayList<String>();
		saa.add("Saurabh");
		saa.add("Is");
		saa.add("Name");
		saa.add(2, "My");
		System.out.println(saa);
		
//		int arr[] = {4,3,7,0,9,1};
//		int index = 0;
//		for (int i =0; i< arr.length; i++)
//		{
//			if(arr[i] == 0)
//			{
//				index = i;
//			}
//			
//		}System.out.println(arr);

	}


}
