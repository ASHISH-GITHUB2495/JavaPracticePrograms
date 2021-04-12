import java.util.Scanner;
import java.util.Random;

//their is only one public class in single java file
class Employee{
   int id;
   String name;

   public void printDetails(){
   	  System.out.println(id);
      System.out.println(name);

   }
   public int getId(){
   	return id;
   }

}



public class JavaPractice6Classes {
	public static void main(String args[]) {
      
      System.out.println("This is our custom class");
      Employee ob =  new Employee();
      //setting attributes
      ob.id=12;
      ob.name="Ashish";
      //accessing attributes
      System.out.println(ob.id);
      System.out.println(ob.name);

      Employee john = new Employee();
      john.id = 32;
      john.name= "tripathi";
      //calling classs method
      ob.printDetails();
      john.printDetails();
      //calling get method of classs
      System.out.println(ob.getId()+" "+john.getId());

       
	}

}