import java.util.Scanner;
import java.util.Random;

//Inheritence in Interfacess...

interface sampleInterface{
	void method1();
	void method2();
}
 
 //valid for interface to inherite other interface but cannot implement it
interface childSampleInterfae extends sampleInterface{
	void method3();
	void method4();
}
class MySampleClass implements childSampleInterfae{
	public void method4(){
		System.out.println("Hellow from method 4 ");
	}
	public void method3(){
		System.out.println("Hellow from method 3 ");
	}
	public void method2(){
		System.out.println("Hellow from method 2 ");
	}
	public void method1(){
		System.out.println("Hellow from method 1");
	}
}




public class JavaPractice17InheritenceInterfaces {
	public static void main(String args[]) {
        
          MySampleClass my = new MySampleClass();
          my.method1();
          my.method2();
          my.method3();
          my.method4();

	}

}