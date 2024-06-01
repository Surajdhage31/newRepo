package libraryManagementSystem;
import java.util.Scanner;
public class Book {

	public static void main(String[] args) {
		
	}
	static void book () {
	    System.out.println("Select who want to book Issue");
	    System.out.println("1.Student \n2.Teacher");
	    Scanner page = new Scanner(System.in);
	    int num = page.nextInt();
	    switch (num)
	    {
	    case 1 :
	    {
		School s = new School();
		s.Student(); // the use of method 
		break ;
		
	    }
	    case 2 :
	    {
		Lecturer b = new Lecturer();
		b.teacher();
		
	    }
	    }
	}

}
