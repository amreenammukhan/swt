package JAVA;

public class numberchanging {

	public static void printpattern (int n) {
		int i,j;
		int num=1;
		for(i=1; i<=n; i++) {
			for(j=1; j<=i; j++) {
				//printing value of num in each iteration
				System.out.print(num+" ");
				num++;
			}
			System.out.println();
			
		}

	}
public static void main(String args[])
{
	int n=6;
	printpattern(n);
}
}
