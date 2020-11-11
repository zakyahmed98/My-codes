import java.util.*;
class RockPaperScissor{
	static String Rock(int n){
		String str;
		if(n==0)
			str="rock";
		else if(n==1)
			str="paper";
		else
			str="scissor";
		return str;
	}
	public static void main(String[] args) {
		Random r=new Random();
		int n=r.nextInt(3);
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter your choice: ");
		String str2=sc.nextLine();
		String str1=Rock(n);
		System.out.println("Computer chooses: "+str1);
		if(str2.length()==0)
			System.out.println("Type either rock or paper or scissor");
		else{
		if(str1.compareTo(str2)==0)
			System.out.println("Tie");
		/*if(str1="rock" && str2="scissor")
			System.out.println("You Lose!!! Better Luck Next Time.");*/
		else{
			if(str1.equals("rock")){
				if(str2.equals("scissor"))
					System.out.println("You Lose!!! Better Luck Next Time.");
				else
					System.out.println("Congrats!!!, You Win");
			}
			if(str1.equals("paper")){
				if(str2.equals("rock"))
					System.out.println("You Lose!!! Better Luck Next Time.");
				else
					System.out.println("Congrats!!!, You Win");
		}
			if(str1.equals("scissor")){
				if(str2.equals("paper"))
					System.out.println("You Lose!!! Better Luck Next Time.");
				else
					System.out.println("Congrats!!!, You Win");
		}
		}
		}
	}
}