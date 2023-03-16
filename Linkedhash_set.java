package collections;

import java.util.LinkedHashSet;
import java.util.Set;

public class Linkedhash_set {

	public static void main(String[] args) {
Set<Object> s=new LinkedHashSet<Object>();
s.add(34);
s.add(56);
s.add(67);
System.out.println(s);


Set<Object> s1=new LinkedHashSet<Object>();
s1.add(67);
s1.add(78);
s1.add(90);
System.out.println(s1);
int size = s.size();
System.out.println("size:"+size);
int index = s.size()-1;
System.out.println("index :"+index);

Object[] array = s.toArray();
System.out.println("array");
for (int i = 0; i < array.length; i++) {
	System.out.println(array[i]);
	
}
System.out.println("foreach");
for (Object each : array) {
	System.out.println(each);
	
	
}
String string = s.toString();
System.out.println("to string :"+string);

}



	}


