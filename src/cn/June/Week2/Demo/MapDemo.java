package cn.June.Week2.Demo;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;

import com.sun.jdi.Value;

public class MapDemo {

	public static void main(String[] args) {
		Map<Integer,String> Map = new HashMap<Integer,String>() ;
		method(Map);
		Set<Map.Entry<Integer,String>> entrySet = Map.entrySet();
		Iterator<Map.Entry<Integer,String>> it = entrySet.iterator();
		while (it.hasNext()) {
			Map.Entry<Integer,String> me = it.next();
			Integer a = me.getKey();
			String b = me.getValue();
			System.out.println(a+","+b);
		}
		
	}
	public static void method(Map<Integer,String> Map) {
		String s1 = Map.put(8,"nike");
		String s2 = Map.put(8,"tom");
//		System.out.println(s1+","+s2);
	}
}