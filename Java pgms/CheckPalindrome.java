import java.util.*;
class CheckPalindrome{
	static int checkP(int n){
	int r,sum=0,temp;
	temp=n;
	while(n!=0){
		r=n%10;
		sum=sum*10+r;
		n=n/10;
	}
	return sum;
	}
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the number to check Palindrome: ");
		int n=sc.nextInt();
		int m=checkP(n);
		if(m==n)
			System.out.println("Its a Palindrome!!!");
		else
			System.out.println("Its not a Palindrome!!!");
	}
}