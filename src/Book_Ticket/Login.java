package Book_Ticket;
import java.util.Scanner;
public class Login {
// if u want a bus ticket 
		public static void main(String[] args) {
				  try (Scanner a = new Scanner(System.in)) {
					  System.out.println("Welcome To MSRTC ");
					System.out.println(" pleses login your account");
					System.out.println("enter your username");
					String c = a.next();
					System.out.println("Enter your password");
					//Scanner b = new Scanner(System.in);
					int d = a.nextInt();
					String user = "suraj" ;
					int pass = 1234;
					if ( (c.equalsIgnoreCase(user)) && (pass == d ))
					{
						SuccessfullLogin g = new SuccessfullLogin();
						g.Book();
						//time ,paid ,sleeper ,normal,bus 
					}
					else
					{
						System.out.println(" Incorrect credential");
						
					}
					
					}
					
				}
				
				}
		
			
     