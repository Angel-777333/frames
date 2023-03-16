package collections;

import java.util.Collection;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;
import java.util.TreeMap;

public class Treet_Set {

	public static void main(String[] args) {
		Map<Character,String> m=new TreeMap<>();
		m.put('A', "Angel");
		m.put('B', "benjamin");
		m.put('c', "christopher");
		m.put('D', "david");
		System.out.println(m);
		int size = m.size();
		System.out.println(size);
		int index = m.size()-1;
		System.out.println(index);
		boolean containsKey = m.containsKey('D');
		System.out.println(containsKey);
		boolean containsValue = m.containsValue("Angel");
		System.out.println(containsValue);
		m.get('A');
		System.out.println(m);
		String string = m.get('A');
		System.out.println(string);
		boolean empty = m.isEmpty();
		System.out.println(empty);
		Set<Character> keySet = m.keySet();
		System.out.println(keySet);
		Collection<String> values = m.values();
		System.out.println(values);
		Set<Entry<Character, String>> entrySet = m.entrySet();
		for (Entry<Character, String> entry : entrySet) {
			System.out.println(entry);
			
		}
		
		
		
		

	}

}
