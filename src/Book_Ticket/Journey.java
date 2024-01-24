package Book_Ticket;
import java.util.Scanner;
public class Journey {
	public int city () {
		System.out.println(" 1.pune_to_mumbai");
		  System.out.println("2.mumbai_to_pune");
		  Scanner a = new Scanner(System.in);
		  
		int sham =  a.nextInt();
			  if(sham <=1)
			  {
				  System.out.println("pune_to_mumbai");
				 System.out.println("please Paid ticket price");
				 
				  System.out.println("paid ");
			  }
			  else
			  {
				  System.out.println("mumbai_to_pune");
			  }
			System.out.println("Ticket booked ");
			return sham ;
			
		}
		
		}
	
