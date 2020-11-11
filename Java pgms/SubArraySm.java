class SubArraySm{
	int product(int a, int b){
		return a*b;
	}
	static int subArraySum(int arr[], int n, int sum){
		int cur_sum=arr[0],start=0;
		for (int i=1;i<=n;i++){
			if(cur_sum>sum && start<i-1){
				cur_sum-=arr[start];
				start++;
			}
			if(sum==cur_sum){
				System.out.println("{");
				for(int j=start;j<=i-1;j++)
					System.out.print(arr[j]+",");
				System.out.println("}");
				return 1;
			}
			if(cur_sum<sum)
				cur_sum+=arr[i];
		}
		return 0;
	}
	public static void main(String[] args) {
		int arr[]={5,1,2,3,2,4};
		int n=arr.length;
		int sum=7;
		SubArraySm s=new SubArraySm();
		s.subArraySum(arr,n,sum);
		int a=5,b=7;
		int prod=s.product(5,7);
		System.out.println("The product of "+a+", "+b+" is: "+prod);
	}
}