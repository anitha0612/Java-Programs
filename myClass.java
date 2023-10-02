public class myClass{
int age=21;
String fname="Anitha";
String lname="Gurugubelli";

	public static void main(String[] args){
		myClass obj=new myClass();
		System.out.println(obj.age);

		System.out.println("My name is "+obj.fname+" "+obj.lname+". I am "+obj.age+" years old.");

		myClass myObj=new myClass();
		myObj.age=25;//Modifying the attributes
		System.out.println(myObj.age);
	}
}