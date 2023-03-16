package collections;

import java.util.Collections;
import java.util.List;
import java.util.Vector;

public class Vector_List {

	public static void main(String[] args) {
		List<Object> s = new Vector<Object>();
		s.add(34);
		s.add(56);
		s.add("angel");
		s.add("89");
		System.out.println(s);

		int size = s.size();
		System.out.println("size :" + size);
		int index = s.size() - 1;
		System.out.println("index:" + index);
		int indexOf = s.indexOf(3);
		System.out.println("index of:" + indexOf);
		int lastIndexOf = s.lastIndexOf("angel");
		System.out.println("lastindex of :" + lastIndexOf);
		boolean contains = s.contains(89);
		System.out.println("contains:" + contains);
		s.set(3, 566);
		System.out.println(s);
		s.get(2);
		System.out.println(s);
		Object set = s.get(2);
		System.out.println("set with return type :" + set);
		s.remove(0);
		System.out.println(s);
		boolean empty = s.isEmpty();
		System.out.println("empty ?:" + empty);
		s.clear();
		System.out.println("clear:" + s);

	}

}
