package selbasics;

public class Superkeyword_EXE extends SuperKeyword
{
	int a = 20;
	
	public void data()
	{
		System.out.println("value of a "+super.a);
		System.out.println("value of a "+a);
	}
	
  public static void main(String[] args)
  {
	  
	  Superkeyword_EXE ss = new Superkeyword_EXE();
	  
	  ss.data();
	
}

}
