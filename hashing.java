import  java.util.*;
public class hashing{
	public static void main(String[] args){
		String[] things = {"apple","banana", "peach", "mango","leechi", "peach"};
		List<String> list = Arrays.asList(things);

		System.out.printf("%s ", list);
		System.out.println();

		//Hash Set
		Set<String> set = new HashSet<String>(list);
		System.out.printf("%s ", set);

	}
}