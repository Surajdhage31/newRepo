package libraryManagementSystem;
import java.util.*;
public class Lecturer {
    
   static void teacher() {
	   
	   System.out.println("Employee Name");
	   Scanner study = new Scanner(System.in);
	   String teach = study.next();
	   System.out.println("Employee Id ");
	   int id = study.nextInt();
	   System.out.println("collage name ");
	   System.out.println("1.Engnnering collage");
	   System.out.println("2.Medical collage");
	   System.out.println("3.Polytechnic collage ");
	   int collage = study.nextInt();
	   System.out.println("book name ");
	   String name = study.next();
	   System.out.println("Employee Name: "+teach);
	   System.out.println("Employee Id :"+id);
	   System.out.println("book name :"+name);
	   switch(collage)
	   {
	   case 1 :
	   {
		   System.out.println("Engnnering collage");
		   break ;
	   }
	   case 2 :
	   {
		   System.out.println("Medical collage");
		   break;
	   }
	   case 3 :
	   {
		   System.out.println("Polytechnic collage ");
		   break ;
	   }
	   
	   
	   }
	   System.out.println("The book return after the a 3 month of the day of book Issue");
	      
  }
}
