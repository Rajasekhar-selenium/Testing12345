package selbasics;

import java.util.ArrayList;
import java.util.List;

public class CollectionsConcept_String 
{
	public static void main(String[] args) 
	{

		List<String> s = new ArrayList<>();
		
		s.add("A");
		
		s.add("B");
		
		s.add("C");
		
		s.add("");
		
        s.add("A");
		
		s.add("B");
		
		s.add("C");
		
		//s.remove(1);
		
	  
		
		
		
	System.out.println("Array values count is "+s.size());
		
		for(int i = 0; i< s.size(); i++)
		{
			System.out.println(s.get(i));
		}
		
	}
		
	}


