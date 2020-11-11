import java.util.*;
class SubarraySum{
	int subarraySum(int arr[], int m, int n){
		int start=0,sum=arr[0],i;
		for(i=1;i<m;i++){
			while( sum > n && start < i-1){
				sum = sum-arr[start];
				start++;
			}
			if(sum == n){
				System.out.print("{");
				for(int j=start;j<i;j++)
					System.out.print(arr[j]+",");
				System.out.print("}");
				//return 1;
			}
			if(i<n)
				sum+=arr[i];
		}
		return 0;

	}
	public static void main(String[] args) {
		int arr[]={1,0,0,0,0,4,5,73,5,4,12,9,7,16};
		int m=arr.length;
		int n=16;
		SubarraySum s=new SubarraySum();
		s.subarraySum(arr,m,n);
	}
}