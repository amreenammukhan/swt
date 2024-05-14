package JAVA;
public class righthalfpyramid {

	public static void printpattern(int n) {
		int i,j;
		//outer loop to handle rows
		for(i=1; i<=n; i++) {
			//inner loop to handle columns
			for(j=1;j<=i;j++) {
				System.out.print("*");
			}
			//printing new line for each row
			System.out.println();
		}

	}
//driver function
	public static void main (String args[])
	{
		int n=6;
		printpattern(n);
	}
	}
	
	

