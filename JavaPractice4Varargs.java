import java.util.Scanner;
import java.util.Random;



class JavaPractice4Varargs {

	// Varags(no need to method overloading)
	//-------------------....
	//variable arguments

	 
	 static int sum(int...arr){
	 	//like int[] arr will be available;
	 	int res=0;
	 	for(int a:arr)
	 		res+=a;
	 	return res;

	 }
	 //if you want at least one argument si needed 
	 //make this ->  static int sum(int x,int...arr)

	public static void main(String args[]) {

		int a = 12 , b = 14, c = 16;
		System.out.println(sum(a,b,c));
		System.out.println(sum());
	}

}