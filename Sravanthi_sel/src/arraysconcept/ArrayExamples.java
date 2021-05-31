package arraysconcept;

public class ArrayExamples 
{
	public static void main(String[] args) 
	{
		//int i = 1;
		
		
	/*	//System.out.println(i);
		
	int[]	j = {10, 9, 11, 8, 20};
	
	System.out.println(j[0]);
	
	System.out.println(j[1]);
	
	System.out.println(j[2]);
	
	System.out.println(j[3]);
	
	System.out.println(j[4]);
	
	for(int a = 0; a < j.length; a++)
	{
		System.out.println("value of index is "+j[a]);
	}
	*/
		
		String str[][] = {{"aa", "bb", "cc"}, {"ee", "ff", "gg"}, {"hh", "ii", "jj"}};
		
		System.out.println(str.length);
		
		
		for(int i = 0; i < str.length; i++)
		{
			for(int j = 0; j < str.length; j++)
			{
				System.out.print(str[i][j]+" ");
				
				
			}
			
			
		}
	
	
	
		
		
		
	}

}
