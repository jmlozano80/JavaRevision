import java.util.ArrayList;
import java.util.Scanner;

public class PopulateArrayList
{
	static ArrayList numbers =new ArrayList();
	
	public static void populateArrayList(int number)
	{
		for(int i=0;i<=number;i++)
		{
			numbers.add(i);
		}
	}
	
	public static void main(String args[])
	{
		populateArrayList(10);
		
		System.out.println(numbers);
		
	}
}
