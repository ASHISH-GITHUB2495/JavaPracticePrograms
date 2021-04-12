import java.util.*;
//LinkedList.....


public class JavaPractice31LinkedList extends Thread {

	public static void main(String args[]) {
		//LinkedList doesnot have any capacity constructors
		LinkedList <Integer> l = new LinkedList<>();
				//adding element at end of list;
		l.add(6);
		l.add(4);
		l.add(10);
		l.add(2);
		l.add(5);
		l.add(2, 20); //add index,element

		//traversing
		for (int i = 0; i < l.size(); i++) //not length
			System.out.print(l.get(i) + " "); //not l[i]

		if (l.contains(80)) //to check availablity
			System.out.println("\n2 is available");
		else
			System.out.println("\nnot available");

		System.out.println(l.indexOf(2));
		l.remove(2) ; //remove element at given index
		l.set(2, 34); //set this replace or place
		l.clear(); //remove all elements from list




	}

}