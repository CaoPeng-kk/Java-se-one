package cn.Demo;

public class StringDemo3 {
  /* Çó×î´ó×Ö´®
   *   
   * 
   * */
	public static void main(String[] args) {
		String s1 = "asdefabcdwujfi";
		String s2 = "jdwiokabcdfw";
		String str = getBiggestString(s1,s2);
		System.out.print(str);

	}
	public static String getBiggestString(String s2,String s1)
	{
	//	boolean a = s1.contains(s2);
		String Bs = null;
		
		for (int i = 0; i <s2.length(); i++) {
			for (int a = 0 , b = s2.length()-i;b<s2.length()+1 ;a++,b++) {
				Bs = s2.substring(a,b);
				if(s1.contains(Bs))
				{
					return Bs;
				}
				
				
			}
			
		}
		return null;
		
	}

}
