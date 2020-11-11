import java.util.*;
class PascalsTriangle{
	static void printPascal(int n){
		int arr[][]=new int[n][n];
		for(int line=0;line<n;line++){
			for(int i=0;i<=line;i++){
				//first and last value is 1
				if(line==i || i==0)
					arr[line][i]=1;
				else
					arr[line][i]=arr[line-1][i-1]+arr[line-1][i];
				System.out.print(arr[line][i]+" ");
			}
			System.out.println();
		}
	}
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter number to get the Pascal's Triangle");
		int n=sc.nextInt();
		printPascal(n);
	}
}