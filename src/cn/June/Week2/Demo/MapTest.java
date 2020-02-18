package cn.June.Week2.Demo;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;
import java.util.TreeMap;

public class MapTest {

	public static void main(String[] args) {
		String a = "fdgavcbascdfa";
		String b = getCharCount(a);
		System.out.println(b);
		demo_1();
		
	}

	public static void demo_1() {
		List<String> a = new ArrayList<String>();
		a.add("abc");
		a.add("cdf");
		a.add("efg");
		Collections.sort(a);
		System.out.println(a);
	}
	

	public static String getCharCount(String a) {
		char[] Str = a.toCharArray();
		Map<Character,Integer> p = new TreeMap<Character,Integer>();
		for (int i = 0; i < Str.length; i++) {
//			�������飬��ÿһ����ĸ��Ϊ��ȥ��map���������
//			����������� ��������ĸ��1��Ϊһ��ӳ���ϵ����map����������ڣ���ֵȡ��+1�ٸ���һ����룬������ͬ
//			�ļ���ֵ�Ḳ��
			if(!p.containsKey(Str[i]))
				p.put(Str[i], 1);
			else
			{
				Integer va = p.get(Str[i]);	
				p.put(Str[i], ++va);
			}
		}
		Set<Entry<Character,Integer>> entrySet = p.entrySet();
		Iterator<Entry<Character,Integer>> it = entrySet.iterator();
		while(it.hasNext())	{
			Entry<Character, Integer> s = it.next();
			Character key = s.getKey();
			Integer times = s.getValue();
			System.out.println("key="+key+",times="+times);
	    }
		return p.toString();
		
	}
}
