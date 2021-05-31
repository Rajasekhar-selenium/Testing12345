package basic2;

import basic.First;

public class Outsidepackage 
{
	public static void main(String[] args) 
	{
		
	
	First aa = new First();
	
	System.out.println(aa.a);
	System.out.println(aa.name);
	aa.one();
	aa.two();
	
	}
}
