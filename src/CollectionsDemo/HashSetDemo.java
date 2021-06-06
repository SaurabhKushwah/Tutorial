package CollectionsDemo;

import java.util.HashSet;

public class HashSetDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		//Set Interface is implemented by 3 classes HashSet, LinkedHashSet, TreeSet
		//Set Interface doesn't allow duplicate values
		//Set Interface is non sequential
		
		HashSet<String> hs = new HashSet<String>();
		hs.add("My name");
		hs.add("is");
		hs.add("Saurabh");
		hs.add("Saurabh");
		hs.add("Kushwah");
		
		System.out.println(hs);
	}

}
