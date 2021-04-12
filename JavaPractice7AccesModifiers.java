import java.util.Scanner;
import java.util.Random;

//access modifiers...
//private -> Helps Data Hiding.

class MyEmployee {
	private int id ;
	private String name;

	public void setData(int id , String name){
		this.id=id;
		this.name=name;
	}
	public int getId(){
		return id;
	}
	public String getName(){
		return name;
	}


}



public class JavaPractice7AccesModifiers{
	public static void main(String args[]) {

		MyEmployee harry = new MyEmployee();
		harry.setData(24,"Ashish");
		System.out.println(harry.getId());
		System.out.println(harry.getName());




	}

}