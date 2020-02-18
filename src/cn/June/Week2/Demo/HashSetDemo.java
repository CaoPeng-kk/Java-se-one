package cn.June.Week2.Demo;

import java.util.HashSet;
import java.util.Iterator;

public class HashSetDemo {

	public static void main(String[] args) {
//		Person s = new Person();
		HashSet h = new HashSet();
	    h.add(new Person("james",16));
		h.add(new Person("nike",18));
		h.add(new Person("tim",26));
		h.add(new Person("cook",36));
		Iterator it = h.iterator();
		while (it.hasNext()) {
			
			Person p = (Person)it.next();
			System.out.println(p.getName());
			
			
		}
		
	}

}
