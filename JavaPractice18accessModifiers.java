import java.util.Scanner;
import java.util.Random;

//AccesssModifiers....

class c1 {
	public int x = 5;     //public modifier
	protected int y = 45; //protected modifier
	int z = 6;            //default modifier
	private int a = 78;   //private modifier

	public void meth1(){
		 //all will run when called
		System.out.println(x);
		System.out.println(y);
		System.out.println(z);
		System.out.println(a);
	}

}
class c2 extends c1{
     int bb =34;
   public void meth2(){
   	 	System.out.println(x);
		System.out.println(y);
		System.out.println(z); // default sometime cannot be accesed from subclass
		//System.out.println(a);
   }
}

public class JavaPractice18accessModifiers {
	public static void main(String args[]) {

		c1 c = new c1();
		c.meth1();

		System.out.println(c.x);
		System.out.println(c.y);
		System.out.println(c.z);
		//System.out.println(c.a); this will not run because of private

       
        c2 cc = new c2();
        cc.meth2();
        


	}

}