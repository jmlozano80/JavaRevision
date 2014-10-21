package file;

import java.util.Formatter;

public class CreateFile 
{

	
	public static void main(String[] args) {
		
		Formatter x;
	try 
	{
		x=new Formatter("C:\\Users\\Jose\\Desktop\\test1.txt");
		
		System.out.println("You created a file  " );
	}
	catch(Exception e )
	{
		System.err.println("Error creating the file");
	}
	}
	
}
