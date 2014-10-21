package collections;

public class GenericMethod {

	public static void main(String[] args) 
	{
		Character cA[]={'J','O','S','E'};
		Integer iA[]={1,2,3,4};
		
		printArray(cA);
		System.out.println("");
		printArray(iA);

	}

	private static <T> void printArray(T[] x) 
	{
		for(T y:x)
		{
			System.out.printf("%s ",y);
		}
		
	}

}
