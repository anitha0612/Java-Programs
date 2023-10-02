import java.util.*;
public class unique{
	public static void main(String[] args){
		Scanner scn = new Scanner(System.in);
		String str = scn.nextLine();
		HashSet<Character> unic = new HashSet<>();

		for(int i=0; i<str.length() ;i++){
			char ch = str.charAt(i);
			if (unic.contains(ch) == true){
				unic.remove(ch);
			}else{
				unic.add(ch);
			}
		}
		if (unic.size() == 0){
			System.out.println("There are no unique values in the string.");
		}
		for (Character ch : unic){
			System.out.print(ch + " ");
		}
	}
}