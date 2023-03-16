package collections;

import java.util.Collection;
import java.util.Hashtable;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;

public class Hash_Table {

	public static void main(String[] args) {
		Map<Integer, String> m= new Hashtable<>();
		m.put(1, "one");
		m.put(2, "two");
		m.put(3, "three");
		m.put(4, "four");
		m.put(1, "angel");
		System.out.println(m);
		int size = m.size();
		System.out.println("size :"+size);
		int index = m.size()-1;
		System.out.println("index of :"+index);
		boolean containsKey = m.containsKey(3);
		System.out.println("contain key :"+containsKey);
		boolean containsValue = m.containsValue("three");
		System.out.println("contains value :"+containsValue);
		String string = m.get(3);
		System.out.println("get from :"+string);
		m.get(string);
		System.out.println("get from without return type :"+string);
		boolean empty = m.isEmpty();
		System.out.println("is empty :"+empty);
		Set<Integer> keySet = m.keySet();
		System.out.println("keyset:"+keySet);
		Collection<String> values = m.values();
		System.out.println("values :"+values);
		Set<Entry<Integer, String>> entrySet = m.entrySet();
		System.out.println("entry set:"+entrySet);
		for (Entry<Integer, String> entry : entrySet) {
			System.out.println(entry);
			
		}
		m.clear();
		System.out.println(m);
		
		
		
	}

}
