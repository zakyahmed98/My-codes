class triangle{
	public static void main(String[] args) {
		int n=5;
		//StringBuilder sb=new StringBuilder();
		String str[][]=new String[n][n];
		//initialize
		str[0][0]="*";
		for(int line=1;line<n;line++){
			for(int col=0;col<=line;col++){
				str[line][col]="*";
				if(line==n){
					str[line][col]="*";
					col++;
				}
			}
		}
		//printing
		for(int i=0;i<n;i++){
			for(int j=0;j<i;j++){
				System.out.print(str[i][j]);
				System.out.print(" ");
			}
			System.out.println();
		}
	}
}