package Book_Ticket;
import java.util.Scanner;
public class Journey {
	public int city () {
		System.out.println(" 1.pune_to_mumbai");
		  System.out.println("2.mumbai_to_pune");
		  Scanner a = new Scanner(System.in);
		  int bus =  a.nextInt();
			  if( bus ==1)
			  {
				  System.out.println("pune_to_mumbai  ");
				 System.out.println(" Time  12:30");
				  
			  }
			  else
			  {
				  System.out.println("mumbai_to_pune");
				  System.out.println("Time 3:20 ");
			  }
			  System.out.println("1.Sleeper \n 2.Sami-Sleeper \n 3. Seter");
			  int red = a.nextInt();
			  switch (red)
			  {
			  case 1 :
			  {
				  System.out.println("please Paid ticket price/fee Rs:400");
				  int money= a.nextInt();
				  System.out.println("paid :" +money);
                 break ;
				  }
			  case 2 :
			  {
				  System.out.println("please Paid ticket price/fee Rs:300 ");
				  int money= a.nextInt();
				  System.out.println("paid :" +money);
				  break ;
			  }
			  case 3:
			  {
				  System.out.println("please Paid ticket price/fee Rs:210 ");
				  int money= a.nextInt();
				  System.out.println("paid :" +money);
				  
			  }
			  }
				 
			System.out.println("Ticket booked ");
			
			return 0;
		}
		
		}
	
