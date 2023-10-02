import java.util.*;
public class genericMethods{
	public static void main(String[] args){
		Integer[] iray = {1, 2, 3, 4, 5, 6};
		Character[] cray = {'a', 'n', 'i', 't', 'h', 'a'};

		printMe(iray);
		printMe(cray);

	}
	//Generic method
	public static <D> void printMe(D[] i){
		for(D x:i){
			System.out.printf("%s ", x);
		}
		System.out.println();
	}
	
}