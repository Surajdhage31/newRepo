package Book_Ticket;
import java.util.Scanner;
public class Login {

		public static void main(String[] args) {
			
		
				  Scanner a = new Scanner(System.in);
				System.out.println("Welcome , pleses login your account");
				System.out.println("enter your username");
				
				String c = a.next();
				System.out.println("Enter your password");
				//Scanner b = new Scanner(System.in);
				int d = a.nextInt();
				String user = "suraj" ;
				int pass = 1234;
				if ( (c.equalsIgnoreCase(user)) && (pass == d ))
				{
					System.out.println("login Successfull");
				}
				else
				{
					System.out.println(" Incorrect credential");
				}
					
				
				
			}
			

		}



