//package collegeLoginPackages;
package Book_Ticket;
import java.util.Scanner;
public class Page  {
	SuccessfullLogin success;
	public void login ()
	{
		  try (Scanner scan = new Scanner(System.in)) {
			  System.out.println("Welcome To MSRTC ");
			System.out.println(" pleses login your account");
			System.out.println("enter your username");
			String  userName = scan.next();
			System.out.println("Enter your password");
			//Scanner b = new Scanner(System.in);
			int password = scan.nextInt();
			String user = "suraj" ;
			int pass = 1234;
			if ( (userName.equalsIgnoreCase(user)) && (pass == password ))
			{
				
				success.Book();
				//time ,paid ,sleeper ,normal,bus 
			}
			else
			{
				System.out.println(" Incorrect credential");
				
			   }
			}
		}
	}

		



