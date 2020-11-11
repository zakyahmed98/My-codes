class SwapWithoutVar{
	public static void main(String[] args) {
		int a=10,b=20;
		System.out.printf("Two No. before swap are: %d,%d",a,b);
		a=a+b;
		b=a-b;
		a=a-b;
		//Scanner sc=new Scanner(System.in);
		System.out.printf("\nAfter swap : %d,%d",a,b);
	}

}