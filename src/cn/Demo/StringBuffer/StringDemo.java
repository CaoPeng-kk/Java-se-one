package cn.Demo.StringBuffer;

public class StringDemo {

	public static void main(String[] args) {
		int arr[] = {0,3,1,2,4};
		String a = arrayToString(arr);
		System.out.println(a);
	}
	public static String arrayToString(int[] arr)
	{
		StringBuffer s1 = new StringBuffer();
		s1.append("{");
		for (int i = 0; i < arr.length; i++) {
			if(i!=arr.length-1)
				s1.append(arr[i]+",");
			else 
				s1.append(arr[i]+"}");				
		}
		return s1.toString();
		}
}
