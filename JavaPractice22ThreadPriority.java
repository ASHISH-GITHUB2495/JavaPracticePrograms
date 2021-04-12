import java.util.Scanner;
import java.util.Random;

//Thread Priorities....


class MyThread extends Thread {
	public MyThread(String name) {
		super (name); // because in thread class their already has constructor for taking name
	}
	public void run() {
		int i = 34;
        while(true)
		System.out.println("Running ->> " + this.getName());

	}

}



public class JavaPractice22ThreadPriority {
	public static void main(String args[]) {

		MyThread t1 = new MyThread("thrd 1");
		MyThread t2 = new MyThread("thrd 2");
		MyThread t3 = new MyThread("thrd 3");
		MyThread t4 = new MyThread("thrd 4");
		MyThread t5 = new MyThread("thrd 5>>>");

		//now giving priority....
		t5.setPriority(Thread.MAX_PRIORITY);
		t1.setPriority(Thread.MIN_PRIORITY);
		t2.setPriority(Thread.MIN_PRIORITY);
		t3.setPriority(Thread.MIN_PRIORITY);
		t4.setPriority(Thread.MIN_PRIORITY);

		t1.start();
		t2.start();
		t3.start();
		t4.start();
		t5.start();



	}

}