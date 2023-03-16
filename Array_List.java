package collections;

import java.util.ArrayList;

import java.util.List;

public class Array_List {

	public static void main(String[] args) {
		List<Object> l = new ArrayList<Object>();
		// add
		l.add(34);
		l.add(27);
		l.add(56);
		l.add(44);
		l.add(89);
		System.out.println(l);
		List<Object> l1 = new ArrayList<Object>();
		l1.add(34);
		l1.add(27);
		l1.add(56);
		l1.add(89);
		l1.add(78);
		System.out.println(l1);
		int size = l.size();
		System.out.println("length:" + size);
		int index = l.size() - 1;
		System.out.println("index:" + index);
		// pass the value by adding
		l.add(3, 85);
		System.out.println("passing the value :"+l);
		int indexOf = l.indexOf(56);
		System.out.println("first index:" + indexOf);
		int lastIndexOf = l.lastIndexOf(89);
		System.out.println("last index:" + lastIndexOf);
		boolean contains = l.contains(56);
		System.out.println("contains :"+contains);
		l.set(3, 1);
		System.out.println("set:"+l);
		Object get = l.get(2);
		System.out.println("get with return type:"+get);
		l.get(1);
		System.out.println("get without return type:"+l);
		l.remove(0);
		System.out.println("remove:"+l);
		boolean empty = l.isEmpty();
		System.out.println("is empty :" + empty);
		l.clear();
		System.out.println("clear:"+l);
		
		
		
		
	}
}
