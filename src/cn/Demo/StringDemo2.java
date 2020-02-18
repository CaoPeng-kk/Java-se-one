package cn.Demo;

public class StringDemo2 {
	
		 public static void main(String[] args)
		 {
			 String s1 = "anbasjknbahcjnbajdklnba";
			 String key = "nba";
			 int count = getStringCount(s1,key);
			 System.out.println("count="+count);
		 }
		 public static int getStringCount(String s1,String key)
		 {
			 int index = 0;
			 int count = 0;
			 while((index = s1.indexOf(key))!=-1)
			 {
				 s1 =  s1.substring(index+key.length());
				 count++;
			 }
			 return count;
		 }
	}
		 



