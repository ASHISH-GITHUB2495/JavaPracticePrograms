import java.util.Scanner;
import java.util.Random;

//Threading by extending thread class....


class MyThread extends Thread {
	@Override
	public void run() {
		while (true) {
			System.out.println("My thread is running -> 1");
			System.out.println("I am happy!!! -> 1");
		}
	}
}

class MyThread2 extends Thread {
	@Override
	public void run() {
		while (true) {
			System.out.println("My thread2 is running -> 2 ");
			System.out.println("I am Sad!!! -> 2j");
		}
	}
}

public class Code {
	public static void main(String args[]) {
     
     MyThread t1 = new MyThread();
     MyThread2 t2 = new MyThread2();

     t1.start();
     t2.start();


	}

}