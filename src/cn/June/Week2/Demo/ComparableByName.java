package cn.June.Week2.Demo;

import java.util.Comparator;

public class ComparableByName implements Comparator<Person>{

	@Override
	public int compare(Person o1, Person o2) {
//		System.out.println("ooooo");
		int temp = o1.getName().compareTo(o2.getName());
		return temp==0?o1.getAge()-o2.getAge():temp;
		
	}
		

}
