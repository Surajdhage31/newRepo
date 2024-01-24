package Practices;

public class variable_Length {
	public static void main(String[] args) {
		
	}

	
	}

	class Var {
	public static void value(int...num ) //variable length argument no limit of value
	{
	//int i;
	double sum =0 ,avg ;
	for(int a:num)
	{
		sum += num [a] ;
		
	}
	
	avg = sum /num.length;
	System.out.println("averge is :" +avg  );
	
	
	
	}
	}

