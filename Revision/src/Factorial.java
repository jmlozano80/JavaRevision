import java.util.Scanner;


public class Factorial 
{
	public static void main(String args[])
	{
		
		factorial();
	}

	public static void factorial()
	{
		System.out.println("Please write a number to factorise");
		Scanner input = new Scanner(System.in);
		int number= input.nextInt();
		try
		{
			int result=calculations(number);
			System.out.printf("The factorial of %d is %d", number,result);
			again();
		}
		catch(Exception e)
		{
			System.err.println("eEmember only integers");
			factorial();
		}
	}

	
	private static void again() {
		System.out.println("Do you want to try again");
		Scanner input1 = new Scanner(System.in);
		String answer=input1.next();
		switch(answer)
		{
		case "yes":
			factorial();
			break;
		case "not":
			System.out.println("ok bye");
			System.exit(0);
		default:
			System.out.println("no te entiendo");
			again();
		}
	}

	public static int calculations(int n)
	{
		if(n<=1){ return 1;}
		else{return n*calculations(n-1);}
	}	
}
