package interfaceconcept;

public class Interf implements Inter

{

	@Override
	public void bike() {
		System.out.println("FZ");
		
	}

	@Override
	public void gears() 
	{
		System.out.println("5");
	}

	@Override
	public void colour() {
		System.out.println("red and black");
	}
	
	public void colour11() {
		System.out.println("red and black");
	}
	
	public static void main(String[] args)
	{
		Interf a = new Interf();
		
		a.bike();
		
		a.gears();
		
		a.colour();
		
	}
	

}
