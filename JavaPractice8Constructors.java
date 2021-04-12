import java.util.Scanner;
import java.util.Random;

//constructors....
class Cylinder{
	private float radius;
	private float height;

	public Cylinder(){
     Scanner sc = new Scanner(System.in);
     System.out.println("Enter height and radius");
     radius = sc.nextFloat();
     height = sc.nextFloat();
	}

	public float getArea(){
		return 2*3.14f*radius*height;
	}

}


public class JavaPractice8Constructors { 
	public static void main(String args[]) {
         
         Cylinder cy = new Cylinder();
         System.out.println(cy.getArea());

	}

}