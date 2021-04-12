import java.util.Scanner;
import java.util.Random;

// Mehtod Overriding ...

class A {
	public int a;
	public int ashish() {
		return 5;
	}

	public void meth2() {
		System.out.println("I am mehod 2 from class A");
	}

}

class B extends A {
   @Override // only a annotation of method is overriding
    public void meth2() {
		System.out.println("I am mehod 2 from class B");
	}

	public void meth3(){
       System.out.println("I am method 3 form class B");
	}


}



public class JavaPractice12methodOverriding {
	public static void main(String args[]) {

		A a = new A();
		a.meth2();

        B b = new B();
        b.meth2();
      
	}

}