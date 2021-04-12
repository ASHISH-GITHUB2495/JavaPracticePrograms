import java.util.Scanner;
import java.util.Random;

//Constructors in  Inheritance....

class Base {                        //simple class
	private int x;

	 Base(){
		System.out.println("Constructor from Base");
	}
	 Base (int x){
		System.out.println("Overloaded Constructor from Base: "+x);
	}

    public int getX(){
    	return x;
    }

    public void setX(int x){
    	this.x=x;
    }

}

class Derived extends Base {       //here we are inheriting the Base class
	private int y;
    
    Derived(){
    	super(5);
    	System.out.println("Constructor from Derived");
    }
    Derived (int y){
    	System.out.println("Constructor Overloaded from Derived class: "+y);
    }
	public int getY(){
		return y;
	}

	public void setY(int y){
		this.y=y;
	}

}


public class JavaPractice10ConstructorInheritence {
	public static void main(String args[]) {

	    Derived d = new Derived();
	    Derived d2 = new Derived(4);
	}

}