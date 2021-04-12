import java.util.Scanner;
import java.util.Random;



class JavaPractice3MethodOverloading {

	// //method Overloading
	//-------------------....
	//parameters is copy one ,,, arguments are actual
    //method overloading can not be done by changing return type


	static int logic(int x, int y) { //parameters
		return x + y;
	}
	static int logic(int x, int y, int z) {
		return x + y + z;
	}

	public static void main(String args[]) {

		int a = 12 , b = 14, c = 16;
		System.out.println(logic(a, b)); //arguments
		System.out.println(logic(a, b, c));

	}

}