import java.util.Scanner;
import java.util.Random;

//Inheritance....

class Base {                        //simple class
	private int x;

	public void printMe() {
		System.out.println("Hellow from base :" + x);
	}

	public void setData(int x) {
		this.x = x;
	}


}

class Derived extends Base {       //here we are inheriting the Base class
	private int y;

	public void printD() {
		System.out.println("Hellow from Derived class");
	}


}


public class JavaPractice9Inheritence {
	public static void main(String args[]) {

		Base b = new Base();
		b.setData(2);
		b.printMe();

		//also from Derived class's object we have accss of base methods/varibales
		Derived d = new Derived();
		d.setData(23);
		d.printMe();
		d.printD();


	}

}