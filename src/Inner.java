
public class Inner {
public static void main(String[] args) {
	outer a = new outer ();
	a.createinner();
}
}
class outer 
{
	int a=10;
	void disp1()
	{
		System.out.println(a);
	}void createinner()
	{
		inner i = new inner();
		i.disp2();
	}
	class inner 
	{
		int b=20;
		void disp2()
		{
			disp1(); // Inner class can directly access member of outer class
			System.out.println(b);
			
		}
		
	}
	}

