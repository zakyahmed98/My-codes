import java.util.*;
class RandomPassword{
	static String randomPwd(int n){

		String str="ABCDEFGHIJKLMNOPQRSTUVWXYZ"+"0123456789"+"abcdefghijklmnopqrstuvwxyz"+"*!@#";
		StringBuilder sb=new StringBuilder(n);

		for(int i=0;i<n;i++){
			
			//getting index values from 0 to length of str
			int index = (int)(str.length()*Math.random());
			//System.out.println(index);
			sb.append(str.charAt(index));
		
		}

		return sb.toString();

	}
	public static void main(String[] args) {

		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the length of password to generate randomly: ");
		int n=sc.nextInt();
		System.out.println("Password Generated is: "+randomPwd(n));

	}

}