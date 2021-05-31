package polyconcept;

public class OverR2 extends OverR
{
	public void add()
	{
		/*int a = 1000; int b = 2000; 
		
		System.out.println(a+b);*/
		
		System.out.println("Over Riding concept");
	}
	public void sub()
	{
		int a = 1000; int b = 2000; 
		
		System.out.println(b-a);
	}
	

	public static void main(String[] args)
	{
		
		OverR2 ss = new OverR2();
		
		ss.add();
		
		ss.add();
		
		ss.sub();
		
		ss.sub();
		
	}
}
