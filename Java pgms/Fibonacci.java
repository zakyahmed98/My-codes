import java.util.Scanner;
class Fibonacci{
	static int fib(int n){
		int f[]=new int[n+2];
		f[0]=0;
		f[1]=1;
		for(int i=2;i<=n;i++){
			f[i]=f[i-1]+f[i-2];
		}
		return f[n];	
	}
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the No. to calc Fibonacci: ");
		int N=sc.nextInt();
		for(int i=0;i<N;i++)
			System.out.print(fib(i)+"\t");
	}
}