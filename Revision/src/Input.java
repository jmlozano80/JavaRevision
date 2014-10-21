
import java.util.Scanner;

public class Input 
{

	private static boolean again=true;
	
	
	public static  void main(String args[])
	{
		while (again==true)
		{
			type();
		}
	}
	
	public static void type ()
	{
		System.out.println("Do you want to type??? (yes or not)");
		Scanner sc = new Scanner(System.in);
		String response=sc.nextLine();
		if(response.equals("yes"))
		{
			System.out.println("Please type");
			System.out.println(" You tiped " + sc.nextLine());
			
		}

		else if (response.equals("not"))
		{
			System.out.println("ok see you soon");
			again=false;
		}
		else
		{
			System.out.println("Sorry I cannot understand");
			type();
		}
		
		
		
	}
	
	
}
