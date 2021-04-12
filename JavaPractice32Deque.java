import java.util.*;
//Deque.....


public class JavaPractice32Deque extends Thread {

	public static void main(String args[]) {
		//intial 16 of size by default
		ArrayDeque <Integer> ad = new ArrayDeque <>();
		//adding elements
		ad.add(6);
		ad.add(16);
        //their is no indices.....
        ad.addFirst(5);
        ad.addLast(54);
        System.out.println(ad.getFirst());  //adds element to the front side of Deque
        System.out.println(ad.getLast());   //adds element to the back side of Deque
        
        //and may more methods...
	


	}

}
