package file;

import java.io.File;

public class FileExist 
{
	static File file = new File ("C:\\Users\\Jose\\Desktop\\test.txt");
	
	public static void main(String[] args) {
		
		if(file.exists()==true)
		{
			System.out.println("The file "+file.getName()+" exists in the directory "+file.getAbsolutePath());
		}
		else
		{
			System.err.println("I cannot find the file");
		}
	}
}
