package file;

import java.util.Formatter;

import javax.swing.JOptionPane;

public class WriteIntoAFile 
{
	private Formatter file;
	
	public void openFile()
	{
		//System.out.println("Openning a file");
		
		try
		{
		file=new Formatter("C:\\Users\\Jose\\Desktop\\test1.txt");
	
		}
		catch(Exception e)
		{
			System.err.println("The file cannot be open");
		}
	}
	
	public void addToFile()
	{
		
		String age= JOptionPane.showInputDialog("Pease insert your age");
		String name=JOptionPane.showInputDialog("Pease insert your name");
		String lName=JOptionPane.showInputDialog("Pease insert your last name");
		
		file.format("%s\t%s\t%s\t"+"\n", age,name,lName);
	}
	
	public void again()
	{
		String answer= JOptionPane.showInputDialog("Do you want to insert another record??(yes or not)");
		
		switch(answer)
		{
			case "yes":
				addToFile();
				again();
				break;
			case "not":
				JOptionPane.showMessageDialog(null, "ok bye");
				//Close File
				file.close();
				break;
			default:
				JOptionPane.showMessageDialog(null, "Sorry I could not understand you");
				again();
				break;
		}
	}
}
