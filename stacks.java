import java.util.*;
public class stacks{
	public static void main(String[] args){
		Stack<String> stk=new Stack<String> ();
		stk.push("bottom");
		printStack(stk);
		stk.push("second");
		printStack(stk);
		stk.push("third");
		printStack(stk);

		stk.pop();
		printStack(stk);
		stk.pop();
		printStack(stk);
		stk.pop();
		printStack(stk);
	}
	private static void printStack(Stack<String> s){
		if(s.isEmpty()){
			System.out.println("You hava nothing in your stack");
		}else{
			System.out.printf("%s TOP\n",s);
		}
	}
}