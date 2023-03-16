package collections;

import java.util.HashSet;
import java.util.Set;

public class hash_set {

	public static void main(String[] args) {
		Set<Object> s = new HashSet<Object>();
		s.add(34);
		s.add(56);
		s.add(67);

		System.out.println(s);
		Set<Object> s1 = new HashSet<Object>();
		s1.add(56);
		s1.add(89);
		s1.add(67);

		System.out.println(s1);
		s.addAll(s1); /// not allow duplicate values
		System.out.println(s);
		s.removeAll(s1);
		System.out.println("remove all:" + s);
		s.retainAll(s1);
		System.out.println("retain all:" + s);
		int size = s.size();
		System.out.println("size:" + size);
		int index = s.size() - 1;
		System.out.println("index value:" + index);
		boolean contains = s.contains(67);
		System.out.println(contains);
		s.remove(s);
		System.out.println("remove:" + s);
		boolean empty = s.isEmpty();
		System.out.println(empty);
		s.clear();
		System.out.println(s);

		
	}

}
