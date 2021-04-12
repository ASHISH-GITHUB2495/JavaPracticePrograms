import java.util.Scanner;
import java.util.Random;



class JavaPractice5Recursion{
       
    /*   recursion
	    -----------    */

	 static int factorial(int n){
	 	 if(n==1||n==0)
	 	 	return 1;
	 	 return n*factorial(n-1);
	 }
    
     static int fibonnaci(int n){
     	 if(n==0||n==1)
     	 	return n;
     	 else
     	 	return fibonnaci(n-1)+fibonnaci(n-2);

     }


	public static void main(String args[]) {

		int n=5;
		System.out.println(factorial(n));//factorial of 5
		System.out.println(fibonnaci(n));//5th fibonnacii
	}

}