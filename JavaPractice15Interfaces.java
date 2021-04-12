import java.util.Scanner;
import java.util.Random;

//Interfaces...

interface Bicycle{ //by default final and protected
	int a=25; //we can create properties in interfaces
	 void applyBreak(int decrement);
	 void speedUp(int increment);
}
interface Bike{
	void hey();
}

class AvonCycle implements Bicycle,Bike{

    public void applyBreak(int decrement){ 
    	System.out.println(decrement);
    }
    public void speedUp(int increment){
     	System.out.println(increment);
     }
     public void hey(){
     	System.out.println("Hey this is from Bikes" );
     }
}


public class JavaPractice15Interfaces{
	public static void main(String args[]) {
        
        AvonCycle av =new AvonCycle();
        av.applyBreak(5);
        av.speedUp(6);

        System.out.println(av.a);
        av.hey();

	}

}