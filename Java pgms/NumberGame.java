import java.util.*;
public class NumberGame{
static int count=1;
	static void checkNum(int num,int number){
		if(num==number){
			System.out.println("Wow You Won!!!");
			count=0;
		}
		else if(num>number){
			System.out.println("NO, The number is greater than "+number);
		}
		else
			System.out.println("NO, The number is lesser than "+number);
	}
	public static void main(String[] args) {
		Random r=new Random();
		int num=r.nextInt(10);
		Scanner sc = new Scanner(System.in);
		while(count!=0){
		System.out.println("Guess Your No:");
		int number = sc.nextInt();
		checkNum(num,number);
		}
	}
}