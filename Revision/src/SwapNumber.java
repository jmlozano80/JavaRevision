
public class SwapNumber
{
	static int first=1;
	
	static int second=2;
	public static void main(String[] args)
	{
		first=first+second;
		second= first-second;
		first= first-second;
	
		System.out.println(" the first= " +first + " the second " +second);
	}
	

}
