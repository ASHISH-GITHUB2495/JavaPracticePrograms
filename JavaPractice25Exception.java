import java.util.Scanner;
import java.util.Random;

// Exception in java..


public class JavaPractice25Exception {
	public static void main(String args[]) {

		/*  int a = 6000;
		  int b = 0;
		  int c = a/b;
		  System.out.println(c);
		  System.out.println("End of the program");//we can't reach because of runtime error
		   arithematic execption....

		  */

		int a = 6000;
		int b = 0;
		try {
			int c = a / b;
			System.out.println(c);
		} catch (Exception e) {
			System.out.println("We have failed\t>>Reason :" + e);
		}
		System.out.println("End of the program");




	}

}