package libraryManagementSystem;
import java.util.Scanner;
public class tester {
	static void Student () { // Student is the method name 
		System.out.println("Enter the name ");
		Scanner a = new Scanner(System.in); // the String value is assign in a 
		String b = a.next();
		System.out.println("Enter the id number of student");
		int d = a.nextInt();
		System.out.println("Enter  number of book are befor Issue ");
		int  c = a.nextInt();
		if (c<3) // more than 3 book is are not issue
		{
			System.out.println("Enter the book name ");
			String f = a.next();
			System.out.println("\n Student name : "+b);
			System.out.println("\n Student Id :"+d);
			System.out.println("\n the Book name : "+f);
			System.out.println("\n the book renew befor 15 days of issue");
			
		}
		else 
		{
			System.out.println("Not more book Issue");
		}
				
	}
}
