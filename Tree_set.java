package collections;

import java.util.Set;
import java.util.TreeSet;

public class Tree_set {

	public static void main(String[] args) {
		Set<Object> s=new TreeSet<Object>();
		s.add(45);
		s.add(56);
		s.add(78);
		System.out.println(s);
		Set<Object> s1=new TreeSet<Object>();
		s1.add(56);
		s1.add(67);
		s1.add(89);
		System.out.println(s1);
		s.addAll(s1);
		System.out.println("addall:"+s);
		s.removeAll(s1);
		System.out.println("removeall:"+s);
		s.retainAll(s1);
		System.out.println("retainall:"+s);
		int size = s.size();
		System.out.println("size :"+size);
		int index = s.size()-1;
		System.out.println("index:"+index);
		boolean contains = s.contains(56);
		System.out.println("contains :"+contains);
		s.remove(56);
		System.out.println("remove:"+s);
		s.clear();
		System.out.println("clear:"+s);
		boolean empty = s.isEmpty();
		System.out.println("is empty or not :"+empty);
		boolean equals = s.equals(s1);
		System.out.println("equals or not :"+equals);
		
		

		
	}

}
