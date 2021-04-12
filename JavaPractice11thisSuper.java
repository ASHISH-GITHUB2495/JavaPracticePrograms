import java.util.Scanner;
import java.util.Random;

// This/super in  Inheritance....

class Boom{
	private int a;

    Boom(int v){
    	a=v;      //a =a ; will be confused
    	this.a = v; //also at this.a = a; will be fine
    }
 
	public int get(){
		return a;
	}

}


public class JavaPractice11thisSuper{
	public static void main(String args[]) {
         
         Boom b = new Boom(5);
         System.out.println(b.get());
	}

}