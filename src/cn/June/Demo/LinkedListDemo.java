package cn.June.Demo;


public class LinkedListDemo {
	public static void main(String[] args) {
		MyQueue en = new MyQueue();
		en.myAdd("abc1");
		en.myAdd("abc2");
		en.myAdd("abc3");
		en.myAdd("abc4");
		while(!en.judge()) {
			System.out.println(en.get());
			
			
			
		}
	}
}
