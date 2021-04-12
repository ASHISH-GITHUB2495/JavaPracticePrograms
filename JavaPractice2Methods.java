import java.util.Scanner;
import java.util.Random;



class JavaPractice2Methods {

	// //method Invocations
	//-------------------....
	/*
	  Static keword is used to associate a method of a given class
	  with the class rather than the object. Static method in a class
	  is shared by all the objects.
	*/
	//static fuction can only call static fuction directly...
	//  static int logic(int x,int y){
	//  	return x+y;
	//  }

	/*
	 A method can be called by creating an object of the class
	  in which the method exists followed by the method call
	*/


	//now without static one we have to create object to use it
	int logic(int x, int y) {
		return x + y;
	}


	public static void main(String args[]) {

		int a = 12 , b = 14;
		//    System.out.println(logic(a,b)); //without object with static function
		Code ob = new Code();
		System.out.println(ob.logic(a, b)); //calling by removing static and creating object


	}

}