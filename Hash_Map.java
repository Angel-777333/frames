package collections;

import java.util.Collection;
import java.util.HashMap;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;

public class Hash_Map {

	public static void main(String[] args) {
		Map<Integer, String> m=new HashMap<>();
		m.put(1, "one");
		m.put(2, "two");
		m.put(3, "three");
		m.put(4, "four");
		m.put(3, "angel");
		m.put(5, "angel");
		System.out.println(m);
		int size = m.size();
		System.out.println(size);
		int index = m.size()-1;
		System.out.println(index);
		boolean containsKey = m.containsKey(2);
		System.out.println(containsKey);
		boolean containsValue = m.containsValue("four");
		System.out.println(containsValue);
		String string = m.get(4);
		System.out.println(string);
		m.keySet();
		System.out.println(m);
		Collection<String> values = m.values();
		System.out.println(values);
		m.remove(3);
		System.out.println(m);
	//	m.clear();
	//	System.out.println(m);
		boolean empty = m.isEmpty();
		System.out.println(empty);
		
			
		}
		
	

	}


