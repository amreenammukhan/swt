package JAVA;

public class reversenumber {

	public static void main(String[] args) {
		int number=4321, reverse=0;
		while (number!=0) {
			int dig=number%10;
			reverse=reverse*10+dig;
			number/=10;
		}
System.out.println("Reversed Number:"+ reverse); 
	}

}
