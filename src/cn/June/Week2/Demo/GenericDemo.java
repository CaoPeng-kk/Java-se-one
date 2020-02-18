package cn.June.Week2.Demo;

import java.util.Iterator;
import java.util.TreeSet;
 

public class GenericDemo {


	public static void main(String[] args) {
		TreeSet<Person> me = new TreeSet<Person>(new ComparableByName());
		me.add(new Person("nike",18));
		me.add(new Person("tom",13));
		me.add(new Person("jerry",21));
		me.add(new Person("pick",19));
		Iterator<Person> it = me.iterator();
		while (it.hasNext()) {
			 Person p =  it.next();
			 System.out.println(p.getAge()+","+p.getName());

		}
		
		
	}

}
