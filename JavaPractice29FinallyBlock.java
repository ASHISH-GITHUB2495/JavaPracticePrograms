import java.util.Scanner;
import java.util.Random;

/*
 Finally block in java..
-->always runs Exception occur or not...and also inside function after return
---> for clean up .. for internet connection etc
*/



public class JavaPractice29FinallyBlock {

	public static int greet() {
		try {
			int a = 50;
			int b = 2;
			int c = a / b;
			return c;
		} catch (Exception e) {
			System.out.println(e);
		} finally {
			System.out.println("this is the end of the Function");
		}
    return 0;
	}



	public static void main(String args[]) {

     int r=greet();

	}

}