import java.util.*;
class SumOfEven{
	public static void main(String[] args) {
		int m,n,sum=0;
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the range: ");
		m=sc.nextInt();
		n=sc.nextInt();
		//System.out.println(m+ "\t" +n);
		for(int i=m;i<=n;i++){
			if(i%2==0)
				sum+=i;
		}
		System.out.println("The sum of even no. in the given range is: "+sum);
	}
}