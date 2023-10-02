import java.util.*;
public class ListToArray{
	public static void main(String args[]){
		String[] str = {"Anitha ", "Anusha ", "Yang "};
		LinkedList<String> thelist = new LinkedList<String> (Arrays.asList(str));

		thelist.add("Gojo ");
		thelist.addFirst("Yuji ");

		//converting back to Array
		str = thelist.toArray(new String[thelist.size()]);

		for(String x : str){
			System.out.printf("%s", x);
		}
	}
}