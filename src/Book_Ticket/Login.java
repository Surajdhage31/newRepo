package Book_Ticket;
import java.util.Scanner;
public class Login {
// if u want a bus ticket 
		public static void main(String[] args) {
				  try (Scanner a = new Scanner(System.in)) {
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
						
						System.out.println("\n Enter you'r choice");
						
						System.out.println(" 1. Book Ticket");
						System.out.println("2. cancal Book Ticket");
						//Scanner put = new Scanner (System.in);
						int book = a.nextInt();
						switch(book)
						{
						case 1 :
						{
							System.out.println("1.pune to mumbai Rs 200");
							System.out.println("2.mumbai to pune Rs 200");
						//	Scanner yash = new Scanner (System.in); object for 
							  int sham = a.nextInt();
							  if(sham <=1)
							  {
								  System.out.println("pune_to_mumbai");
								 System.out.println("please Paid ticket price");
								  int b = a.nextInt();
								  System.out.println("paid "+b);
							  }
							  else
							  {
								  System.out.println("mumbai_to_pune");
							  }
							System.out.println("Ticket booked ");
							break ;
						}
						case 2 :
						{
							System.out.println("book ticket canceled");
						}
						}
					}
					else
					{
						System.out.println(" Incorrect credential");
					}
				}
				
				}
		
			}
     