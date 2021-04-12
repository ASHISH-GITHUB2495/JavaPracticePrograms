import java.util.Scanner;
import java.util.Random;

// handling specific Exception in java..


public class JavaPractice26SpecificExceptions {
	public static void main(String args[]) {

       int[] marks=new int[3];
       marks[0]=7;
       marks[1]=56;
       marks[2]=6;
       Scanner sc = new Scanner(System.in);
       System.out.print("Enter the array index: ");
       int n = sc.nextInt();
       System.out.print("Enter the number to devide: ");
       int nn =sc.nextInt();

       try{
       	System.out.println("The value at array index given by you is: "+marks[n]);
       	System.out.println("The value of array/number is: "+marks[n]/nn);

       }catch(ArithmeticException ae){
       	  System.out.println("zero se nii bhai :-> "+ae);
       }catch(ArrayIndexOutOfBoundsException are){
       	System.out.println("bhar chale gye yrr :-> "+are);
       }
       catch(Exception e){
       	System.out.println("Other Exception occoured => "+e);
       }






	}

}