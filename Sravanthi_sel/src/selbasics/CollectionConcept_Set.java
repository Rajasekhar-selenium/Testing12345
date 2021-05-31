package selbasics;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;

public class CollectionConcept_Set 
{
	public static void main(String[] args) 
	{
		Set s = new HashSet();
		
		s.add("A");
		
		s.add("B");
		
		s.add("C");
		
		s.add(10);
		
		s.add("");
		
		s.add("");
		
        s.add("A");
		
		s.add("B");
		
		s.add("C");
		
		s.add(10);
		
		s.remove(10);
		
    System.out.println("Array values count is "+s.size());
    
    Iterator i = s.iterator();
    
    while(i.hasNext())
    {
    	System.out.println(i.next());
    	
    
    }
    
    
		
		
		
	}


}
