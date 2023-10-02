import java.util.*;
public class Repeat{
	public static void main(String[] args){
		Scanner scn = new Scanner(System.in);
		System.out.println("Enter the number and digit : ");
		int n = scn.nextInt();
		int d = scn.nextInt();

		if (n == 0 && d == 0){
			System.out.println("The frequency of digit " + d + " is 1");
		}

		
		else{
			int dig;
			int count = 0;
			while(n != 0){
				dig = n % 10;
				if(dig == d){
					count++;
				}
			}
			System.out.println("The frequency of digit " + d + " is " + count);
		}
		
	}
}