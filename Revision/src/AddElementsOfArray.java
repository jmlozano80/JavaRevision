
import java.util.Random;
import java.util.Scanner;
public class AddElementsOfArray
{
	static int numberOfElements;
	static int arrayOfIntegers [];
	
	
	public static void main(String args[])
	{
		numberOfElements();
		for (int i =0; i<arrayOfIntegers.length;i++)
		{
			addElemnetsToArray(i);
		}
		printArray();
		System.out.println("********************");
		totalIndexSum();
	}

	private static void numberOfElements() {
		System.out.println("How many elements do you want in the array");
		Scanner input= new Scanner(System.in);
		try{
		numberOfElements=input.nextInt();
		arrayOfIntegers=new int [numberOfElements];
		System.out.println("arraylength\t "+arrayOfIntegers.length);
		}
		catch(Exception e)
		{
			System.out.println("Please ensure that you type an integer");
			numberOfElements();
		}
	}

	private static void totalIndexSum() {
		int total=0;
		for(int i=0;i<arrayOfIntegers.length;i++){
			total=total+arrayOfIntegers[i];
		}
		System.out.println("The total is "+ total);
		
	}

	private static void printArray() {
		System.out.println("Index\t" + "Value");
		for(int i=0;i<arrayOfIntegers.length;i++)
		{
			System.out.println(i+"\t"+arrayOfIntegers[i]);
		}
		
	}

	public  static void addElemnetsToArray(int index)
	{
		Random random= new Random();
		
		int max=10;
		int min=0;
		int element=random.nextInt((max-min)+min);
		arrayOfIntegers[index]=element;
		
	}
}
