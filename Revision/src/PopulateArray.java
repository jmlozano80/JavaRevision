import java.util.Arrays;


public class PopulateArray
{
	public static void main(String args[])
	{
		int arrayOfIntegers[] = new int[10];
		String array="";
		for(int i =0;i<=9;i++)
		{
			arrayOfIntegers[i]=i*2;
			System.out.println("The values of the array at the index " +i+" is " + arrayOfIntegers[i]);
			int tempInt=arrayOfIntegers[i];
			String tempStr=String.valueOf(tempInt); 
			System.out.println(tempStr);
			array=array.concat(" ,"+tempStr);
		}
		
		System.out.println(Arrays.toString(arrayOfIntegers));

	}
}
