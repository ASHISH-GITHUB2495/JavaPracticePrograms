import java.util.Scanner;
import java.util.Random;

//Threading by implementing runnable interface.....


class MyThread implements Runnable{

	public void run() {
		while (true) {
			System.out.println("My thread is running -> 1");
			System.out.println("I am happy!!! -> 1");
		}
	}
}

class MyThread2 implements Runnable {

	public void run() {
		while (true) {
			System.out.println("My thread2 is running -> 2 ");
			System.out.println("I am Sad!!! -> 2j");
		}
	}
}

public class JavaPractice20RunnableImplements{
	public static void main(String args[]) {
     
     MyThread t1 = new MyThread();
     MyThread2 t2 = new MyThread2();
     /*  passing object of MyThread which has implented the runnable class..
      to the constructor of Thread class and callig start() from thread class object.
     */
     Thread tt1 = new Thread(t1);  
     Thread tt2 = new Thread(t2);
     tt1.start();
     tt2.start();


	}

}