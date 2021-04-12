import java.util.Scanner;
import java.util.Random;

//Default method in Interfacess...

interface Camera{
	void takeSnap();
	void recordVideo();
	default void record4k(){   //can be initilised with defualt keyword and also can be overriden
		System.out.println("Recording 4k");
	}
}
interface Wifi{
	String[] getNetworks();
	void connectToNetwork(String network);
}
class MyCellPhone{
     void callNumber(){
     	System.out.println("Calling");
     }
     void pickCall(){
     	System.out.println("Connnecting..");
     }
}

class MySmartPhone extends MyCellPhone implements Camera,Wifi{
     public void takeSnap(){
     	System.out.println("Taking snap");
     }
     public void recordVideo(){
     	System.out.println("We are recording video");
     }
     public String[] getNetworks(){
     	System.out.println("Getting list of Networks");
     	String[] networkList = {"Harry","prashant","Ashish"};
     	return networkList;
     }
     public void connectToNetwork(String network){
     	System.out.println("Conneting to :"+network);
     }
}


public class JavaPractice16defaultMethodInterfaces {
	public static void main(String args[]) {
        
      MySmartPhone ms = new MySmartPhone();
      String[] networks = ms.getNetworks();
      for(String item: networks)
      	System.out.print(item+" ");
      System.out.println();
      ms.record4k();

	}

}