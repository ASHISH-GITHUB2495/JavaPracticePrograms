import java.util.Scanner;
import java.util.Random;

//Dynamic Method Dispatch...

class One {
	public int a;
	public void name() {
		System.out.println("My name is java in class one");
	}
	public void greet() {
		System.out.println("Good mornign");
	}


}

class Two extends One {
	public void swagat() {
		System.out.println("Good moring 2");
	}
	public void name() {
		System.out.println("My name Java in class two");
	}

}



public class JavaPractice13dynamicMethodDispatch {
	public static void main(String args[]) {

		One o = new One();//allowed
		Two t = new Two(); //allowed

		One obj = new Two(); //allowed (referece of superclass and object of subclass)
        //Two obj2 = new One();//not allowed
        
         obj.name(); //Dyanamic Method Dispatch ... runtime decide
	}

}