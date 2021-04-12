import java.util.Scanner;
import java.util.Random;

//Polymorphism in Interfacess...

interface sampleInterface {
	void method1();
	void method1(int x);
}
interface sampleInterface2{
	void method2();
}

//valid for interface to inherite other interface but cannot implement it

class MySampleClass implements sampleInterface,sampleInterface2 {
	public void method1() {
		System.out.println("Hellow from method 1");
	}
	public void method1(int x) {
		System.out.println("Hellow form method 1 poly: " + x);
	}
	public void method2(){
		System.out.println("Hellow form method2");
	}
}




public class JavaPractice18PloymorphismInheritence {
	public static void main(String args[]) {

		MySampleClass my = new MySampleClass();
		my.method1();
		my.method1(5);

        //suppose we done it for GPS , then we cannot use the wifi , camera...
        //this is mySampleClass but use it as sampleInterface
		sampleInterface sm = new MySampleClass(); 
		sm.method1(2);
		//sm.method2(); //cannot run because can call only sampleInterface method ...

	}

}