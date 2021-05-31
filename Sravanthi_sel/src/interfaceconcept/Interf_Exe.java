package interfaceconcept;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Interf_Exe extends Interf
{
	public static void main(String[] args) 
	{
		Inter a = new Interf_Exe();
		
		WebDriver d = new ChromeDriver();
		
		a.bike();
		
		a.colour();
		
		a.gears();
		
		
	}

}
