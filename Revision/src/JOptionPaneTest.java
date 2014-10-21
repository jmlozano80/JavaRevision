import javax.swing.JOptionPane;
public class JOptionPaneTest
{
	public static void main(String args[])
	{
		calculateSum();
	}
	
	public static void calculateSum()
	{
		System.out.println();
		String answer=JOptionPane.showInputDialog("Do you want to sum two numbers??(yes or not)");
		
		switch(answer)
		{
			case "yes":
				
				String firstnumber=JOptionPane.showInputDialog("please enter first number");
				String secondnumber=JOptionPane.showInputDialog("please enter second number");
				
				try
				{
					int fN=Integer.parseInt(firstnumber);
					int sN=Integer.parseInt(secondnumber);
					int sum= fN+sN;
					JOptionPane.showMessageDialog(null,"The sum of the numbers  "+fN +" and "+sN+" is "+ sum,"Solution",JOptionPane.INFORMATION_MESSAGE );
					
					
				}
				catch(Exception e)
				{
					System.out.println("catch the exception");
					JOptionPane.showMessageDialog(null, "I only can calculate the sum of integers");
					calculateSum();
				}
				calculateSum();
				break;
			case "not":
				
				JOptionPane.showMessageDialog(null, "ok bye");
				System.exit(0);
			default:
				JOptionPane.showMessageDialog(null, "sorry i could not understand you, (yes or not)");
				calculateSum();
		}
	}
}
