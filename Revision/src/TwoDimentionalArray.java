
public class TwoDimentionalArray {

	static int doubleArray [][]={{2,3,33},{3,3,3},{8,8,8}};
	
	public static void main(String args[])
	{
		System.err.println("\t"+"column1\t"+"column2\t"+"column3\t");	
		for(int row=0;row<doubleArray.length;row++)
		{
			System.out.print("row "+row+"\t");	
			for(int column=0;column<doubleArray.length;column++)
			{
							
				System.out.print(doubleArray[row][column]+"\t");
			}
			System.out.println("");
		}
	}
}
