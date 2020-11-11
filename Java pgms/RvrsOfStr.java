import java.util.*;
class RvrsOfStr{
	static String reverse(String str){
	StringBuilder sb=new StringBuilder();
	sb.append(str);
	sb=sb.reverse();
	String sb1=sb.toString();
	return sb1;
	}
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the string to check palindrome: ");
		String str=sc.nextLine();
		String str2=reverse(str);
		if(str.equals(str2))
			System.out.println("Its a Palindrome String!!!");
		else
			System.out.println("Its not a Palindrome String!!!");
	}
}