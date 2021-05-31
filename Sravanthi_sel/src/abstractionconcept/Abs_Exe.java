package abstractionconcept;

public class Abs_Exe extends Abs
{

	@Override
	public void water() {
		System.out.println("water");
	}
     @Override
	public void one() {
		System.out.println("one");
	}

	@Override
	public void two() {
		System.out.println("two");
	}
	
	public static void main(String[] args) 
	{
		Abs_Exe a = new Abs_Exe();
	      
	      a.land();
	      
	      a.water();
	      
	      a.one();
		
	}
	

	
}