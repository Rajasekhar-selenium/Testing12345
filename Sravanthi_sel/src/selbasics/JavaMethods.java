package selbasics;

public class JavaMethods 
{
	
	public static void main(String[] args) 
	{
		JavaMethods a = new JavaMethods();
		
		/*a.one();
		
		a.test(10, 10);
		
		System.out.println(a.test1(100, 100));*/
		
		a.sample("testing", "hyd");
		
	}
	
	public void one()
	{
		System.out.println("Java Methods");
	}
	
	
	public void test(int i, int j)
	{
		int x = i; int y = j;
		
		int z = x + y;
		
		System.out.println(z);
	}
	
	public int test1(int c, int d)
	{
		
		int s = c+d; 
		
		return s;
	}
	
	public void sample(String m, String n)
	{
		System.out.println(m);
		
		System.out.println(n);
		
		System.out.println(m+" "+n);
		
		
	}
	
	
	
	
	
	
	
	

}
