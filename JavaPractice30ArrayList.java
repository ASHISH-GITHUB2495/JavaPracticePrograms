import java.util.*;
//ArrayList.....


public class JavaPractice30ArrayList extends Thread {

	public static void main(String args[]) {
		//initilized with 10 space by default
		ArrayList <Integer> al = new ArrayList<>();
		//initilize with 20 space
		ArrayList <Integer> al2 = new ArrayList<>(5);
		//adding element at end of list;
		al.add(6);
		al.add(4);
		al.add(10);
		al.add(2);
		al.add(5);
		al.add(2, 20); //add index,element

		//traversing
		for (int i = 0; i < al.size(); i++) //not length
			System.out.print(al.get(i) + " "); //not al[i]

		if (al.contains(80)) //to check availablity
			System.out.println("\n2 is available");
		else
			System.out.println("\nnot available");

		System.out.println(al.indexOf(2));
		al.remove(2) ; //remove element at given index
		al.set(2, 34); //set this replace or place
		al.clear(); //remove all elements from list


	}

}