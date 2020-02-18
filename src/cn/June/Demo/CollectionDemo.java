package cn.June.Demo;

import java.util.ArrayList;
import java.util.List;
import java.util.ListIterator;

public class CollectionDemo {
	public static void main(String[] args) {
//		Collection c = new ArrayList();
		List b = new ArrayList();
		b.add("abc1");
		b.add("abc2");
		ListIterator it = b.listIterator();
		while(it.hasNext()) {
			System.out.println(it.next());
		}
		
	}
}
