package file;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class ReadFromFile
{
	String URL="C:\\Users\\Jose\\Desktop\\test1.txt";
	Scanner outPut;
	File file = new File(URL);
	
	public void readFile()
	{
		
		int counter=0;
		try 
		{
			outPut = new Scanner(file);
			if(file.exists())
			{
				System.out.printf("%s\t%s\t%s\t \n","age","name","lName");
				while(outPut.hasNext())
				{	counter++;
					String age=outPut.next();
					String name=outPut.next();
					String lName=outPut.next();
					
					System.out.printf("%s\t%s\t%s\t\n",age,name,lName);
					
				}
				System.err.println(counter+" records in the file");
			}
		} 
		catch (FileNotFoundException e) 
		{
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		
	}
	
	public void closeFile()
	{
		outPut.close();
	}
	

}
