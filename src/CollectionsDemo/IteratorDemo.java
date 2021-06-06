package CollectionsDemo;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.Iterator;

public class IteratorDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		HashSet<String> hs = new HashSet<String>();
		hs.add("India");
		hs.add("is");
		hs.add("country");
		hs.add("name");
		hs.add("India");
		
		System.out.println(hs);
		
		Iterator<String> itr = hs.iterator();
		
		while(itr.hasNext())
		{
			System.out.println(itr.next());
		}
		
		ArrayList<String> sas = new ArrayList<String>();
		sas.add("My");
		sas.add("Name");
		sas.add("is");
		sas.add("Saurabh");
		
		System.out.println(sas);
		
		Iterator<String> itr1 = sas.iterator();
		while(itr1.hasNext())
		{
			System.out.println(itr1.next());
		}
	}

}
