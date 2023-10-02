import java.util.*;
class Fibonacci{
	public static void main(String [] args){
		Scanner scn = new Scanner(System.in);
		System.out.println("Enter n value: ");
		int n = scn.nextInt();
		int a=0;
		int b=1;
		if (n < 0){
			System.out.println("N cannot be negative");
		}
		else if (n == 0){
			System.out.println(a);
		}
		else if (n == 1){
			System.out.println(a + " " + b);
		}
		else {
			int temp = 0;
			System.out.printf(a + " " + b + " ");
			for(int i=1;i<n;i++){
				temp = a + b;
				a = b;
				b = temp;
				System.out.printf(b + " ");
			}
			
		}

	}
}