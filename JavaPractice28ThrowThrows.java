import java.util.Scanner;
import java.util.Random;

// Throw vs Throws in java..
class NegativeRadiusException extends Exception{
	@Override
	public String toString(){
		return "Radius cannot be negative!!!";
	}
	@Override
	public String getMessage(){
		return "Radius cannot be negative";
	}
}

public class JavaPractice28ThrowThrows{

	public static double area(int r) throws NegativeRadiusException{  //to let know from where it is called throws keyword is used //maybe it can throw
		if(r<0 ){
			throw new NegativeRadiusException(); //we use throw to terminate the execution from here..
		}
		double  result = Math.PI *r*r;
		return result;
	}

	public static int divide(int a, int b) throws ArithmeticException {
		//made by bholu
		int res = a / b;
		return res;
	}


	public static void main(String args[]) {
		//ashish -> uses divide function created by bholu
		try {
			int c = divide(6,0);
			System.out.println(c);
		} catch (Exception e) {
			System.out.println("Exception");
		}
		
		try{
		        double res = area(6);
                System.out.println(res);
		    }catch(Exception e){
		    	System.out.println(e);
		    }


	}

}