package selbasics;

public class Final_Methods_EXE extends Final_methods
{
	public void one1()
	{
		System.out.println("Three");
	}
	
	public void two()
	{
		System.out.println("Four");
	}
	
	public static void main(String[] args) 
	{
		Final_Methods_EXE a = new Final_Methods_EXE();
		
		a.one();
		
		a.two();
		
		a.one();
		
		a.two();
	}

}
