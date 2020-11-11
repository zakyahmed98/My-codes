import java.util.*;
class SumOfPrime{
	public static void main(String[] args) {
		int m,n,sum=0,flag;
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the range: ");
		m=sc.nextInt();
		n=sc.nextInt();
		//System.out.println(m+ "\t" +n);
		for(int i=m;i<=n;i++){
			if(i==1 | i==0)
				sum=-1;
			flag=1;
			for(int j=2;j<=i/2;j++){
				if(i%j==0)
					flag=0;
			}
			if(flag==1)
				sum+=i;
		}
		System.out.println("The sum of Prime no. in the given range is: "+sum);
	}
}