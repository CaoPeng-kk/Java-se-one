package cn.June.Demo;

import java.util.LinkedList;

public class MyQueue {
	private LinkedList list;
	public MyQueue(){
		list = new LinkedList();
	}
	public void myAdd(Object obj) {
		list.add(obj);
	}
	public Object get() {
		return list.removeFirst();
	}
	public boolean judge() {
		return list.isEmpty();
	}
}

