package cn.Demo.StringBuffer;
import java.util.Arrays;
public class StringDemo_Sort {
//  �����������Ͷ����װ��  ��ϰ
//	��һ���ַ���������ֽ������� 
	private static final String space_s = " ";
	public static void main(String[] args) {
		String s1 = "20 78 9 -7 39 29";
		String s5 = sortMethod(s1);
		System.out.println(s5);
	}
	public static String sortMethod(String s1) {
//		�ַ����ָ���ַ�������
		String[] Str_arr =  toStringArray(s1);
//		���ַ���������int����
		int[] Str_2 = stringToint(Str_arr);
//		��int��������
		sortMethod(Str_2);
//		��int�������ַ���
		String Str_4 = intToString(Str_2);
		return Str_4;
	}
	public static String intToString(int[] Str_2) {
		StringBuilder s = new StringBuilder();
		for (int a = 0; a < Str_2.length; a++) {
			if (a!=Str_2.length) {
				s.append(Str_2[a]+space_s);
			}
			else
				s.append(Str_2[a]);
		}
		return s.toString();
	}
	public static int[] sortMethod(int[] Str_2) {
		Arrays.sort(Str_2);
		return null;
	}
	public static int[] stringToint(String[] Str_arr) {
		int[] Str_1 = new int[Str_arr.length];
		for (int i = 0; i < Str_arr.length; i++) {
			Str_1[i] = Integer.parseInt(Str_arr[i]);
		}
		return Str_1;
	}
	public static String[] toStringArray(String s1) {
		String[] s2 = s1.split(space_s);
		return s2;
	}
}
