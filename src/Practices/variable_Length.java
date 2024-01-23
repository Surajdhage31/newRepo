package Practices;

public class variable_Length {
	public static void main(String[] args) {
		value(12,13,22);
	}

	private static void value(int i, int j, int k) {
		
		
	}

	class Var {
	public static void value(int...num ) //variable lenth argument no limit of value
	{
	int i;
	double sum =0 ,avg ;
	for(int a:num)
	{
		sum += num [a] ;
		
	}
	
	avg = sum /num.length;
	System.out.println("averge is :" +avg  );
	
	
	
	}
	}
}
