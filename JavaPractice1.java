//classes use PascalConvention
//funcitons use camelCaseConvention
import java.util.Scanner;
import java.util.Random;


class JavaPractice1 {


	public static void main(String args[]) {


		/*      int a=1, b=6, c=4;
		      int sum = a+b+c;
		     System.out.println(sum);
		     int age=34;
		     float f = 0.4f;
		     double d = 0.08d;
		     char ch = 'a';
		     System.out.println(age+" "+f+" "+d+" "+ch);
		     String str = "Ashish";
		     System.out.println(str);*/

		/*     System.out.println("Taking input from user ... enter 2 numbers");
		     Scanner sc = new Scanner(System.in); //form keybord only
		     int s1= sc.nextInt();
		     int s2= sc.nextInt();
		     float s3 = sc.nextFloat();//for float value
		     System.out.println("the sum of inputs are: "+(s1+s2));
		      boolean ci = sc.hasNextInt();  // the check input is int or not
		     System.out.println("is the input is int: "+ci);
		     System.out.println("Enter string ");
		     str = sc.next();
		     System.out.println(str);
		     System.out.println("Enter new line");
		     str = sc.nextLine();;
		     System.out.println(str);*/

		/*
		      Scanner sc = new Scanner(System.in);
		      System.out.println("Enter total marks");
		      float total = sc.nextFloat();
		      System.out.println("Enter five subject marks");
		      float m1 = sc.nextFloat();float m2 = sc.nextFloat();float m3=sc.nextFloat();
		      float m4 = sc.nextFloat();float m5 = sc.nextFloat();
		      float percentage = ((m1+m2+m3+m4+m5)/total)*100;
		      System.out.println("percentage is: "+percentage);

		*/

		/*
		  int a = 4;
		      int b = a +6;
		      b += 2;
		      System.out.println(12 >= b && b>10);
		       System.out.println(12 >= b|| b<1);
		       System.out.println(1|2);

		   */

		/*
		        //	pricidence/associativity of these operators..

		         int a = 6*5-34/2;
		         int b = 60/5-34*2;
		         System.out.println(a);
		          System.out.println(b);

		          (* , / ,%) both have same precedence 12.. associativity from left to right
		          ( + , - ) both have same precedence 11.. associativity from left to right

		CHECK OUT ON THE WEB FOR PRECEDENCE AND ASSOCIATIVITY OF OPERATORS IN JAVA

		int i = 56;
		System.out.println(i++);
		 System.out.println(++i);

		*/

		/*
		         float a  = 7/4 * 9/2;
		         System.out.println(a); //4
		           //but if we do
		          a = 7/4f * 9/2f;
		          System.out.println(a);//7.875

		            */
		/*
				   char grad = 'b';
				   //grad =grad + 8; //encryption (incompatible .. so lets type-cast it)
				   grad =(char)(grad + 8);
				   System.out.println(grad); //shows j because of encryption
				   //now decrypt it...
				   System.out.println((char)(grad-8));//got orginal message

		      Scanner sc = new Scanner(System.in);
		      int a= sc.nextInt();
		      System.out.println(8==a);
		*/

		/*
		    Scanner sc = new Scanner(System.in);
		    String name = new String("Ashish");
		    System.out.println(name);

		    String last = "yadav";
		    last="kumar";
		    System.out.println(last);
		 	System.out.printf("%s\n",last);

		 	last = sc.next();
		 	System.out.println(last);
		 	 //println => print with endl , print => only cout

		 */
		/*


		     //STRING METHODS
		    String str = "Ashish";
		    System.out.println(str);

		    System.out.println(str.length());  //size of string
		    System.out.println(str.toLowerCase()); //all characters to lower case
		    System.out.println(str.toUpperCase()); //all characters to upper case
		    System.out.println(str.trim()); //remove leading and trailing spaces
		    System.out.println(str.substring(3));//from index 3 to end ,
		    System.out.println(str.substring(3,5)); //from index 3 to index 5
		    System.out.println(str.replace('s','k')); //replace all s with k
		    System.out.println(str.startsWith("Ash"));//to check startsWtth given prefix
		    System.out.println(str.endsWith("ish"));//check end with given suffix
		    System.out.println(str.charAt(2));//return character at index 2
		    System.out.println(str.indexOf('s'));//gives the first index of given char or -1
		    System.out.println(str.indexOf('s',3));//check the char from given index
		    System.out.println(str.lastIndexOf('h'));//returns last index of given char
		    System.out.println(str.equals("ashish"));//checks is it equal to given string
		    System.out.println(str.equalsIgnoreCase("ashish"));//check equal or not by ignoring case



		     \n = nextline
		     \t = tab space
		     \' = for single 	quote
		     \\ =

		     System.out.println("ashish kumar \" yadav");//it is correct;
		     System.out.println("I am escape sequence ...\\ you");
		*/

		/*
		 		String str = "Ashish_ 12";
		 		System.out.println(str.toLowerCase());
		 		System.out.println(str.replace(' ','_'));

		        Scanner sc = new Scanner(System.in);
		        String letter = "Dear <|name|>, Thanks a lot!!!";
		        String name = sc.next();
		        System.out.println(letter.replace("<|name|>",name));

		        String str2 = "Ashish  yadav  ";
		        System.out.println(str2.indexOf("   "));
		        System.out.println(str2.indexOf("  "));

		        String myLetter = "Dear Ashish,\n My name is asha. \n \t Thank you";
		        System.out.println(myLetter);

		*/

		/*//conditionals

		    int age=19;
		    if(age<18)
		    	System.out.println("Sorry, you can't drive");
		    else
		    	System.out.println("Yes, you can drive");
		       if(age<21 && age> 18)
		       	System.out.println("you are perfect");
		     */
		/*
		//switch case

		int age = 20;

		switch (age){

		  case 18 :
		     System.out.println("yoo");
		     break;
		  case 19 :
		     System.out.println("good");
		     break;
		   case 20:
		     System.out.println("bad");
		     break;
		   default:
		     System.out.println("fuss");

		}

		*/
		/*
		         Scanner sc = new Scanner(System.in);
		        // float m1 = sc.nextFloat();
		        // float m2 = sc.nextFloat();
		        // float m3 = sc.nextFloat();

		        // float percentage = ((m1+m2+m3)/300f)*100f;
		        // System.out.println(percentage+"%");
		        // if(percentage>=40 && m1>=33 && m2>=33 && m3 >= 33)
		        // 	System.out.println("passed");
		        // else
		        // 	System.out.println("failed");

		         // float income = sc.nextFloat();

		         // if(income<2.5*100000)
		         // 	System.out.println("0% tax require");
		         // else if(income>=2.5*100000 && income<5*100000)
		         // 	System.out.println("5% tax require");
		         // else if(income>=5*100000 && income<10*100000)
		         // 	System.out.println("10% tax require");
		         // else
		         // 	System.out.println("30% tax require");

		*/

		/*
			       //Rock Papper Scissor game!!!!!!
			while (true) {
				Scanner sc = new Scanner(System.in);
				System.out.println("0 -> for Rock");
				System.out.println("1 -> for Paper");
				System.out.println("2 -> for scissors");
				int player = sc.nextInt();
				Random rand = new Random();
				int comp = rand.nextInt(2);

				System.out.println("YOU       vs      COMP");
				System.out.println("---------------------");
				String s1 , s2;

				if (player == 0)
					s1 = "Rock";
				else if (player == 1)
					s1 = "Paper";
				else if (player == 2)
					s1 = "scissors";
				else
					s1 = "Invalid";

				if (comp == 0)
					s2 = "Rock";
				else if (comp == 1)
					s2 = "Paper";
				else if (comp == 2)
					s2 = "scissors";
				else
					s2 = "Invalid";

				System.out.println(s1 + "       -      " + s2);
				int win;
				if (player == 0 && comp == 2)
					win = 1;
				else if (player == 0 && comp == 0)
					win = 3;
				else if (player == 0 && comp == 1)
					win = 0;
				else if (player == 1 && comp == 0)
					win = 1;
				else if (player == 1 && comp == 1)
					win = 3;
				else if (player == 1 && comp == 2)
					win = 0;
				else if (player == 2 && comp == 0)
					win = 0;
				else if (player == 2 && comp == 1)
					win = 1;
				else if (player == 2 && comp == 2)
					win = 3;
				else
					win = -1;

				if (win == 1)
					System.out.println("\n\n >>> You win!!!  :)");

				else if (win == 0)
					System.out.println("\n\n >>> You Lose! :( ");

				else if (win == 3)
					System.out.println("\n\n >>> Tie UP! :( ");

				else
					System.out.println("\n\n >>> INVALID MOVIE :| ");

			}

		*/


		/*  int i=100;
		  while( i<=200 ){
		  	System.out.println(i);
		  	i++;
		  }

		  i=100;
		  do{
		  	System.out.println(i);
		  	i++;
		  }
		  while(i<=200);

		  for(i=100;i<=200;i++)
		  	System.out.println(i);

		*/
		/*Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();

		for(int i=n;i>=1;i--){

			for(int j=0;j<i;j++)
			System.out.print("* ");

			System.out.println("");
		}

		int i = 1;
		int sum=0;
		int n = sc.nextInt();
		while (i <= 2 * n) {
			if (i % 2 == 0)
				sum += i;
			i++;
		}
		System.out.println(sum);

		int i=1;
		 int n = sc.nextInt();
		for( i=1;i<=10;i++)
			System.out.println(n+" X "+i+" = "+(n*i));

		int n=10 ;
		for(int i=10;i>=1;i--)
			System.out.println(n+" X "+i+" = "+(n*i));

		Scanner sc = new Scanner(System.in);
		int n=sc.nextInt();
		int fact=1;
		for(int i=1;i<=n;i++)
			fact *= i;
		System.out.println("Factorial of "+n+" is: "+fact);
		*/


		/*
		    int [] marks ; //marks array defined;
		    marks = new int [5]; //allocatoin of memory of  size 5 to marks

		    marks [0]=100;
		    marks[1]=34;
		    marks[2]=12;
		    marks[3]=34;
		    marks[4]=233;
		   // marks[5]=12; //outOfBound error

		    System.out.println(marks[3]);

		    //Three ways to build array
		    //first is above
		    //second
		    // int[] marks = new int [10];
		    //third
		    int [] mark = {10,20,30,40,50}; //declare and initialise..
		    for(int i=0;i<5;i++)
		  	  System.out.println(mark[i]);

		*/

		/*
				//int [] marks = {10,20,30,40,50};

				float[] marks = {12.3f, 43.0f, 12.5f, 12f, 32f};
				System.out.println(marks[0]);
				System.out.println(marks.length);//to get the no. of elements

				String[] students = {"ashish", "kumar", "yadav"};
				System.out.println(students[1]);
				System.out.println(students.length);

				for (int i = 0; i < students.length; i++)
					System.out.print(students[i] + " ");

				System.out.println("\n -------------");

				for (int i = students.length - 1; i >= 0; i--)
					System.out.print(students[i] + " ");

				System.out.println("\n -------------");
				//for each loop

				for (String elem : students)
					System.out.print(elem + " ");

		*/

		/*	     //Multi dimensional array,.......
			int[][] flats;//2d array
			flats = new int[2][3]; //like row and column
			flats[0][0] = 101;
			flats[0][1] = 102;
			flats[0][2] = 103;
			flats[1][0] = 104;
			flats[1][1] = 105;
			flats[1][2] = 106;

			for (int i = 0; i < 2; i++) {
				for (int j = 0; j < 3; j++)
					System.out.print(flats[i][j] + " ");
				System.out.println();
			}

		*/


		// float[] marks = {45.7f, 45.34f, 65.2f, 456.7f, 1.06f};
		// float sum = 0;
		// for (float f : marks)
		// 	sum += f;
		// System.out.println(sum);

		// float[] marks = {45.7f, 45.34f, 65.2f, 456.7f, 1.06f};

		// for(float elem:marks)
		// {
		// 	if(elem==65.2f)
		// 		System.out.println("MILA");
		// 	else
		// 		System.out.println("NII MILA");
		// }


		/*
		   int[][] mat1 = {{1,2,3},
		                   {4,5,6}};

		   for(int i=0;i<mat1.length;i++)
		   	for(int j=0;j<mat1[0].length;j++)
		   		System.out.println(mat1[i][j]);

		   int[] arr={1,2,3,4,5};//we reverse the array
		   for(int i=0;i<arr.length/2;i++)
		   {
		   	int temp=arr[i];
		   	arr[i]=arr[arr.length-1-i];
		   	arr[arr.length-1-i]=temp;
		   }
		   for(int elem:arr)
		   	System.out.print(elem+" ");

		   	int[] arr2 = {21, 32, 41, 23, 53, 12, 34};
		      int maxx = 0;
		       for (int elem : arr2) {
		         	if (maxx < elem)
				       maxx = elem;
		          }

		        System.out.println(maxx);

      /................................./
		    System.out.println("Integer.MAX_VALUE = "
		                   + Integer.MAX_VALUE);


		     System.out.println("Integer.MIN_VALUE = "
		                   + Integer.MIN_VALUE);    
	   /............................../


		*/





	}




}