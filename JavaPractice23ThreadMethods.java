import java.util.Scanner;
import java.util.Random;

//Thread Mehods....


class MyThread extends Thread {

	MyThread(String name) {
		super(name);
	}

	public void run() {
		int i = 34;
		try {
			Thread.sleep(2000);
		} catch (Exception e) {
			System.out.println(e);
		}
		while (true)
			System.out.println("Running ->> " + this.getName());


	}

}



public class JavaPractice23ThreadMethods {
	public static void main(String args[]) {

		MyThread t1 = new MyThread("thrd 1");
		MyThread t2 = new MyThread("thrd 2");

		/*
		t1.start();   //both will start Synchornously
		 t2.start();
		*/

		/*
		//t2 will start after t1 finished
		//it is done by the join()... but we have to handle the exception

		t1.start();
		try {
		t1.join();
		} catch (Exception e) {
		System.out.println(e);
		}
		t2.start();

		*/

		/*
		   //Now interupt method
		   //to sleep thread after some time in put it above
		t1.start();
		*/

//read about thread method online oracle...

	}

}