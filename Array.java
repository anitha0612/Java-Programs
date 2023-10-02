public class Array{
	public static void main(String[] args){

		int[][] s={{1,2,3,4},{5,6,7,8}};
		System.out.println(s[0][1]);

		String[] cars={"Volvo","BMW","Ford"};
		for(int i=0;i<cars.length;i++){//Loop through an array
			System.out.println(cars[i]);
		}
		for(String j:cars){
			System.out.println(j);
		}
	}
}