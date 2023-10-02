import java.util.*;
public class Sorting{
	public static void main(String args[]){
		String[] str = {"Anitha ", "Anusha ", "Yang "};
		List<String> list1=Arrays.asList(str);

		Collections.sort(list1);
		System.out.printf("%s\n", list1);
		Collections.sort(list1, Collections.reverseOrder());
		System.out.printf("%s \n", list1);


	}
}