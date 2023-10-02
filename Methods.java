public class Methods{
	static void myMethod(String fname,String lname){//fname and lname are Parameters
		System.out.println(fname+" "+lname);
		System.out.println("Last name is "+lname);
	}

	public void newMethod(){
		System.out.println("Unlike 'Public' methods can only be accessed by creating an object of the class.");
	}
	public static void main(String[] args){
		myMethod("Anitha","Gurugubelli");//Anitha and Gurugubelli ara Arguments
		Methods obj=new Methods();
		obj.newMethod();
	}
}