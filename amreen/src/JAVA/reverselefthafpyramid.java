package JAVA;

public final class reverselefthafpyramid {
//function to demonstrate pattern
	public static void printpattern(int n) {
		int i,j;
		//calculating number of spaces
		int num=2*n-2;
		//outer loop to handle rows
		for(i=n; i>0; i--) {
			//inner loop to handle spaces
			for(j=0; j<i; j++) {
				System.out.print("*");
			}
			//printing new line for each row
			System.out.println();
			
		}
		
	}
//driver function
	public static void main(String args[])
	{
		int n=6;
		printpattern(n);

	}
}
