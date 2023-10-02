import java.util.*;
class power{
	public static void main(String[] args){
		Scanner scn = new Scanner(System.in);
		int n = scn.nextInt();
		int p = scn.nextInt();//n pow p
		int temp=n;

		if (p == 0){
			System.out.println(n + " to the power of " + p + " is: 1");
		}
		else{
			for (int i=1;i<p;i++){
				n = n * temp;
			}
			System.out.println(temp + " to the power of " + p + " is: "+ n);
		}
	}
}