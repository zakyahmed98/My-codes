import java.util.Scanner;
class Factor{
	static int fact(int n){
		int result=1;
		for(int i=n;i>0;i--)
			result*=i;
		return result;
	}
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the number to find its factorial: ");
		int n=sc.nextInt();
		System.out.println(n+"! is: "+fact(n));
	}

}