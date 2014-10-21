import java.util.Random;
import java.util.Scanner;
public class Dice {
	
	private static boolean again=true;
	
	public static void main(String args[])
	{
		while (again==true){
		
		again();
		}
	}
	
	
	public static void throwDice()
	{
		Random dice= new Random();
		int result;
		result=1+dice.nextInt(6);
		System.out.println("The result is " + result);
	}
	
	public static void again()
	{
		Scanner input = new Scanner(System.in);
		
		System.out.println("Do you want to roll the dice ??? (yes or not)");
		
		String result=input.nextLine();
		
		switch(result)
		{
			case "yes": 
				
				System.out.println("ok here we go again");
				throwDice();
				break;
			
			case "not":
				System.out.println("BYE");
				System.exit(0);
			
			default:
				System.out.println("Sorry i could not understand ");
				again();
				break;
		}
		
	}

}
