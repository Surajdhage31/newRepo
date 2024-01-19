package Book_Ticket;
import java.util.Scanner;
public class Login {
//static String revStr(String S)
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
					
					System.out.println("Enter you'r choice");
					System.out.println(" 1. Book Ticket");
					
					Scanner put = new Scanner (System.in);
					int book = put.nextInt();
					switch(book)
					{
					case 1 :
					
						System.out.println(" pune to mumbai");
						System.out.println(" mumbai to pune");
						Scanner yash = new Scanner (System.in);
						  String sham = put.next();
						System.out.println("Ticket book "+sham);
					}
				}
				else
				{
					System.out.println(" Incorrect credential");
				}	
			}
		}