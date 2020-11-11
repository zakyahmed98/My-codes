import java.util.*;
class Test{
	public static void main(String[] args) {
		/*int[] t=new int[5];
		t[]={5,3,4,5,6};
		for(int i=0; i<t.length;i++)
		System.out.print(t[i]+"\t");*/

		//charac test
		//char[] ch={'z','a','k','y'};
		/*for (char c:ch1 )
			System.out.print(c);*/

		//
		int q=92/100;
		System.out.println("q="+q);
		String str1="abc", str2="def", str3="dabecf";
		System.out.println(str3);
		char[] ch1=str1.toCharArray();
		char[] ch2=str2.toCharArray();
		//String str5=new String(6);
		//str5=str2.charAt(0)+str1.charAt(0)+str1.charAt(1)+str2.charAt(1)+str1.charAt(2)+str2.charAt(2);
		StringBuilder stbfr=new StringBuilder();
		stbfr=stbfr.append(str2.charAt(0)).append(str1.charAt(0)).append(str1.charAt(1)).append(str2.charAt(1)).append(str1.charAt(2)).append(str2.charAt(2));
		String str=stbfr.toString();
		//System.out.println(str);*/
		//System.out.println(str5);
		if(str3.compareTo(str)==0)
			System.out.println("String Matched!!!");
		else
			System.out.println("String not Matched!!!");
	}
}