import java.util.Scanner;

public class UserInput
{
	
	static Scanner sc = null;
	
	public static void main (String args[])
	{
		/*Scanner sc = new Scanner(System.in);
		System.out.println("The input is " + sc.nextLine());
		
		System.out.println("Do you want to input something else??? (yes or no)" );
		
		Scanner scTemp = new Scanner(System.in);
		 
		if(scTemp.nextLine().equals("yes"))
		{
				System.out.println("yes");
		}
		if (scTemp.nextLine().equals("no"))
		{
			System.out.println("ok so, good bye" );
		}
		else
		{
		   System.out.println("Sorry I only understand (yes or no)" );
		}*/
		spicyRecursion("VCASE");
	}
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	public static String spicyRecursion(String input)
	{
		if (!input.equals("VCASE")) System.out.println("The input is " + input);
		if (input.equals("no")) return null;
		
		sc = new Scanner(System.in);
		
		System.out.println("Do you want to input something else??? (yes or no)" );
		
		return spicyRecursion(sc.nextLine());
	}


}

