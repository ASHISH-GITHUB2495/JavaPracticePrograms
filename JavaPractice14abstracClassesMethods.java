import java.util.Scanner;
import java.util.Random;

//Abstract class and Abstract Methods...

abstract class Base{
    Base(){
    	System.out.println("Constructor from base");
    }
    public void say(){
    	System.out.println("Hellow from Base");
    }
    abstract public void greet();  //abstract method ... override it and define yourself and you have to write abstract to this class
}

class Derived extends Base{
	@Override
	public void greet(){
		System.out.println("Hey this Good morning");
	}
}



public class JavaPractice14abstracClassesMethods{
	public static void main(String args[]) {
		
      Derived d = new Derived();
      d.greet();


	}

}