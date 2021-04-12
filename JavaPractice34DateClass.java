import java.util.*;

//Date and time in Java...

public class Code {
	public static void main(String args[]) {
		//miliseconds passed from 1970 jan 1.
		System.out.println(System.currentTimeMillis());
		//year passed..
		System.out.println(System.currentTimeMillis() / 1000 / 3600 / 24 / 365);
		//is it safe to store in long the milisecond value
		System.out.println(Long.MAX_VALUE);

		//date...class

		Date d = new Date();
		System.out.println(d); //gives full date
		System.out.println(d.getTime()); //gives miliseconds passed...
		System.out.println(d.getDate());
		System.out.println(d.getSeconds());
		System.out.println(d.getYear());

		//calender class....
		Calendar c = Calendar.getInstance();
		System.out.println(c.getCalendarType());
		System.out.println(c.getTimeZone());
		System.out.println(c.getTimeZone().getID());

		//current time date
		System.out.println(c.get(Calendar.DATE));
		System.out.println(c.get(Calendar.SECOND));
		System.out.println(c.get(Calendar.HOUR));
		System.out.println(c.get(Calendar.HOUR_OF_DAY));
        
        


	}

}