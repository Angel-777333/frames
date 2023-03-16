package collections;

import java.util.Collection;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;
import java.util.concurrent.ConcurrentHashMap;

public class Concurrent_Hashmap {

	public static void main(String[] args) {
		Map<Object, String> m=new ConcurrentHashMap<>();
		m.put('a', "Angel");
		m.put('b', "benjamin");
		m.put('c', "cavin");
		m.put('d', "david");
		m.put('d', "dev");
		System.out.println(m);
		int size = m.size();
		System.out.println("size of :"+size);
		int index = m.size();
		System.out.println("index of :"+index);
		boolean containsKey = m.containsKey(m);
		System.out.println("containskey:"+containsKey);
		boolean containsValue = m.containsValue(m);
		System.out.println("contains value:"+containsValue);
		String string = m.get('d');
		System.out.println(string);
		m.get('d');
		System.out.println(m);
		boolean empty = m.isEmpty();
		System.out.println("is empty or not :"+empty);
		Set<Object> keySet = m.keySet();
		System.out.println(keySet);
		Collection<String> values = m.values();
		System.out.println(values);
		Set<Entry<Object, String>> entrySet = m.entrySet();
		for (Entry<Object, String> entry : entrySet) {
			System.out.println(entry);
		}
			
		}
		

}
