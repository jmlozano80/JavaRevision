import java.util.Scanner;

public class PrintEvenNumbersTo100 {
	
	private static  boolean again = true;
	
	public static void main(String args[])
	{	
		
		while(again==true)
		{
		Scanner input= new Scanner(System.in);
		System.out.println("Please enter a number");
		
		
	try{
		int number=input.nextInt();
		System.out.println("The even number from 0 to " + number+" are :");
		
		for(int i=0;i<=number;i++)
		{
			if(i%2==0)
			{
				System.out.println(i);
			}
			
		}
		again=false;
	}
	
	catch(Exception e )
	{
		System.out.println("You entered a non valid integer format");
	}
}
}
}