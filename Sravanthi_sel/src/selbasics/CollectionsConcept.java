package selbasics;

import java.util.ArrayList;
import java.util.List;

public class CollectionsConcept 
{
	/*Iterable (I)
	
	Collection(I)
	
	list(I)             Set(I) 
	
	Arraylist(c)      Hashset(c)
	
	Linketlist(c)     linkedHashset(c)*/
	
	
	public static void main(String[] args) 
	{
		List s = new ArrayList();
		
		s.add("A");
		
		s.add("B");
		
		s.add("C");
		
		s.add(10);
		
		s.add("");
		
        s.add("A");
		
		s.add("B");
		
		s.add("C");
		
		s.add(10);
		
		//s.remove(1);
		
		s.set(3, 500);
		
		
		
	System.out.println("Array values count is "+s.size());
		
		for(int i = 0; i< s.size(); i++)
		{
			System.out.println(s.get(i));
		}
		
	}

	
	
}
