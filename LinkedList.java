import java.util.*;
public class Collections{
	public static void main(String args[]){
		String[] things = {"nothing ", "something ", "everything ", "boring "};
		List<String> list1 = new LinkedList<String>();

		for(String x : things){
			list1.add(x);
		}
		String[] morethings = {"crying ", "caring ", "boring "};
		List<String> list2 = new LinkedList<String>();

		for(String y : morethings){
			list2.add(y);
		}
		list1.addAll(list2);
		list2=null;

		printMe(list1);
		removeStuff(list1, 2,5);
		printMe(list1);
		reverseMe(list1);
	}
	private static void printMe(List<String> l){
		for(String b:l){
			System.out.printf("%s", list1.get(b));
		}
		System.out.println();
	}
	private static void removeStuff(List<String> l, int start, int end){
		if(start>=0 && end<l.size() && start<=end){
			for(int i=start; i<=end;i++){
				l.remove(start);
			}
		}
		else{
			System.out.println("Invalid startor end index.");
		}
	}
	private static void reverseMe(List<String> l){
		Collections.reverse(l);
		System.out.println("Reversed list: ");
		printMe(l);
	}
}