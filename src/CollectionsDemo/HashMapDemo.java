package CollectionsDemo;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;

public class HashMapDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		//Hash Map is not Thread Safe and is not synchronized
		//Hash table is thread safe and is synchronized
		//Hash Map can have one null key and can have multiple null values where as Hash table can not have any null key or value
		//HashMap uses iterator to iterate the values where as Hash table uses enumerator like Vector to iterate the value
		
		
		HashMap<Integer, String> hmp = new HashMap<Integer, String>();
		hmp.put(1, "Hello");
		hmp.put(3, "World");
		hmp.put(5, "Today");
		hmp.put(2, "is a good Day");
		System.out.println(hmp);
		
		Set es = hmp.entrySet();
		Iterator itr = es.iterator();
		
		while(itr.hasNext())
		{
			Map.Entry me = (Map.Entry)itr.next();
			System.out.println(me.getKey());
			System.out.println(me.getValue());
		}
	}

}
