import java.util.*;
class Digits{
	public static void main(String[] args){
		Scanner scn = new Scanner(System.in);
		System.out.println("Enter any number: ");
		int n = scn.nextInt();

		System.out.println("The number of digits in the number are: ");
		if (n == 0){
			System.out.println("1");
		}
		lese if (n < 0){
			n = -n;
		}

		int count = 0;
		while (n != 0){
			n = n/10;
			count ++;
		}
		System.out.println(count);
	}
}