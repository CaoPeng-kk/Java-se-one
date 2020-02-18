package cn.Demo;

public class StringDemo {
	public static void main(String[] args)
	{
		String[] s1 = {"fas","afs","qeg","rnw","wh","ntr"};
		int i;
		for(i=0;i<s1.length;i++)
		{
			for(int y=i+1;y<s1.length;y++)
			{
				int a = s1[i].compareTo(s1[y]);
			    if(a>0)
				{
			    	String t;					
					t = s1[i];
					s1[i] = s1[y];
					s1[y] = t;
				}
			}		
		}		
		for(i=0;i<s1.length;i++)
		{
			System.out.println(s1[i]);
		}
		
		
	}

	

}
