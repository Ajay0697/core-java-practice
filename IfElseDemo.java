//importing packages
import java.util.*;

//declaring a class
class IfElseDemo
{
	public static void main(String args[])
	{
	//creating Scanner object
	Scanner sc= new Scanner(System.in);

	System.out.println("Enter first number:");
	// creating variables
	int num1= sc.nextInt();
	System.out.println("Enter second number:");
     // creating variables
	 int num2=sc.nextInt();
	 
   if (num1>num2)
     System.out.println("the grater number is:"+num1);
   else
	    System.out.println("the grater number is:"+num2);
	
	}


	// end of main
}
// end of class 