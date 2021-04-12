import java.util.Scanner;
import java.util.Random;

//Thread constructors....


class MyThread extends Thread{
    public MyThread(String name){
    	super (name); // because in thread class their already has constructor for taking name
    }
    public void run(){
    	int i = 34;
    	while(i!=0){
    		System.out.println("I am a thread");
    		i--;
    	}
    }

}

public class JavaPractice21ConstructorsThread {
	public static void main(String args[]) {
     
        MyThread t = new MyThread("thrd");
        t.start();
        System.out.println("id of thread is: "+t.getId()); // to get id of thread
        System.out.println("Name of thread is: "+t.getName());//to get name of thread

	}

}