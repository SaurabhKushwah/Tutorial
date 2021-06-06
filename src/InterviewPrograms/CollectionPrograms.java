package InterviewPrograms;

import java.util.ArrayList;
import java.util.HashSet;

public class CollectionPrograms {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
//Q1. Find out the duplicate values and the occurrence of each duplicate value
		int a[] = {3,3,4,5,5,4,4,6,6,6,6,7}; 
		ArrayList<Integer> al = new ArrayList<Integer>();
		
		for(int i =0 ; i< a.length; i++)
		{
			int counter = 1;
			if(!al.contains(a[i])) {
				al.add(a[i]);
				for(int j=i+1; j<a.length; j++)
				{
					if(a[j] == a[i])
					{
						++counter;
					}
				}System.out.println(a[i] + " - "+counter);
			}
			
				
		}
		
	//	System.out.println(al);
		


		
		
		HashSet<Integer> hs = new HashSet<Integer>();
		

	}

}
