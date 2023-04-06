package mypkg;

public class Mycls {
	
	public int sum (int a , int b)
	{
		return (a+b);
	}
	public int diff (int a , int b)
	{
		return (a-b);
	}
	public int mul (int a , int b)
	{
		return (a*b);
	}
	public int div (int a , int b)
	{
		return (a/b);
	}

	public static void main(String[] args) {
		
		Mycls obj = new Mycls();
		
		{System.out.println( obj.sum (10,2));}
		{System.out.println( obj.diff (5,2));}
		{System.out.println( obj.mul(5,3));}
		{System.out.println( obj.div (4,2));}
			
			
	}

}
