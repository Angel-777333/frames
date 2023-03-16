package collections;

import java.util.Collections;
import java.util.LinkedList;

public class Linked_List {
	public static void main(String[] args) {

		LinkedList<Object> li = new LinkedList<>();
		li.add(34);
		li.add(56);
		li.add(67);
		li.add(89);
		li.add(78);
		System.out.println("value 1:"+li);
		LinkedList<Object> li2 = new LinkedList<>();
		li2.add(56);
		li2.add(67);
		li2.add(78);
		li2.add(98);
		li2.add(34);
		System.out.println("value 2:"+li2);
		
		
	//	boolean equals = li.equals(li2);
	//	System.out.println("is equal or not :" + equals);
	//	System.out.println();
		li.addAll(li2);
		System.out.println("add all:" + li);
		System.out.println();
		li.removeAll(li2);
	System.out.println("Remove all:" + li);
		System.out.println();
		li.retainAll(li2);
		System.out.println("retain all:" + li2);
	//	System.out.println();
		//System.out.println("for loop by get :");
		//for (int i = 0; i < li.size(); i++) {
		//	System.out.println(li.get(i));

		//}

	//	Object[] array = li.toArray();
	//	System.out.println("converting to array :");
	///for (int i = 0; i < array.length; i++) {
		//	System.out.println(array[i]);
	//}
	//	System.out.println("converting to foreach :");
	//	for (Object each : array) {
		//.out.println(each);

		//}
	}
}

	


