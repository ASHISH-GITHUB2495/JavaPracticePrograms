import java.util.*;
//Hashing in java.....
//hashging with set ... no repition allowed

public class Code {

	public static void main(String args[]) {

		//Hashing is echnique to convert in key value pairs

		//default or initilize with capacity

		HashSet <Integer> h = new HashSet<>();//initial 16 capacity
		HashSet <Integer> h2 = new HashSet<>(10);  //10 capacityb...
       
        h.add(6);
        h.add(8);
        h.add(9);
        h.add(9); //will take only one
        System.out.println(h);
        //linear time to search

/*        h.clear(); //clear all
        if(h.contains(3)) //check contains or not
        isEmply// etxccc


*/


	}

}