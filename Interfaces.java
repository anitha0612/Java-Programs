interface Animal{
	public void animalSound();//Interface methods does not have body
	public void sleep();
}
class Pig implements Animal{
	public void animalSound(){
		System.out.println("Pig says Wee Wee");
	}

	public void sleep(){
		System.out.println("Zzz");
	}
}

public class Interfaces{
	public static void main(String[] args){
		Pig myPig = new Pig();
		myPig.animalSound();
		myPig.sleep();
	}
}