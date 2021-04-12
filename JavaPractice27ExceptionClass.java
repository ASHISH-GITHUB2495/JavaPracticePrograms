import java.util.Scanner;
import java.util.Random;

// Exception class in java..

class MyException extends Exception {
	@Override
	public String toString() {
		return super.toString() + "I am toString()";
	}
	@Override
	public String getMessage() {
		return super.getMessage() + "I am getMessage()";

	}
}

public class JavaPractice27ExceptionClass {
	public static void main(String args[]) {

		int a;
		Scanner sc = new Scanner(System.in);
		a = sc.nextInt();
		if (a < 99) {
			try {
				throw new MyException();
				//throw new ArithmeticException("this is new exceptin");
			} catch (Exception e) {
				System.out.println(e.getMessage());
		        System.out.println(e.toString());
		        e.printStackTrace(); 
			}
		}




	}

}