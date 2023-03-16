package collections;

import java.util.Collection;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Set;

public class Linked_Map {

	public static void main(String[] args) {
		Map<Integer, String> m=new LinkedHashMap<>();
		m.put(1, "one");
		m.put(2, "two");
		m.put(3, "three");
		m.put(1, "angel");
		System.out.println(m);
		int size = m.size();
		System.out.println(size);
		int index = m.size()-1;
		System.out.println(index);
		boolean containsKey = m.containsKey(3);
		System.out.println(containsKey);
		boolean containsValue = m.containsValue("angel");
		System.out.println(containsValue);
		Set<Integer> keySet = m.keySet();
		System.err.println(keySet);
		String string = m.get(1);
		System.out.println(string);
		m.get(string);
		System.out.println(string);
		Collection<String> values = m.values();
		System.out.println(values);
		m.remove(2);
		System.out.println(m);
		boolean empty = m.isEmpty();
		System.out.println(empty);
	//	m.clear();
	//	System.out.println(m);
		
		
	}

}
