import java.util.Scanner;

public class Average10Numbers
{
	static boolean again =true;
	public static void average()
	{
		System.out.println("insert numbers 10 numbers");
		Scanner input = new Scanner(System.in);
		int counter=1;
		int total=0;
		while(counter<11)
		{
			int number=input.nextInt();
			total+=number;
			counter++;
		}
		
		int average = total/10;
		
		System.out.println("The average is " +average);
	}
	
	public static void main (String args[])
	{
		while(again==true)
		{
			average();
			again();
		}
		
	}
	
	public static  void again()
	{
		Scanner input = new Scanner(System.in);
		System.out.println("Do you want to do it again?? (yes or not)");
		String answer=input.nextLine();
		
		if (answer.equals("yes"))
		{
//			average();
		}
		else if(answer.equals("no"))
		{
			System.out.println("Ok bye");
			again=false;
			System.exit(0);
		}
		else
		{
			System.out.println("Sorry i could not understand");
			again();
		}
	}

}
