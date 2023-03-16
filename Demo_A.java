package collections;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class Demo_A {

	public static void main(String[] args) {
		List<Object> l=new ArrayList<Object>();
		l.add(34);
		l.add(45);
		l.add(67);
		l.add(89);
		System.out.println(l);
		List<Object> li=new ArrayList<>();
		li.add(67);
		li.add(89);
		li.add(89);
		li.add(90);
		System.out.println(li);
boolean equals = l.equals(li);
System.out.println(equals);
l.toArray();
System.out.println(l);
for (int i = 0; i < args.length; i++) {
	System.out.println(i);
	
}
}
}
