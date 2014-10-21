package calculatorMVC;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

/**
 * Manage the view and the model
 * @author Jose
 *
 */
public class CalculatorController 
{
	private CalculatorView view;
	private CalculatorModel model;	
	
	//constructor
	public CalculatorController(CalculatorView theView, CalculatorModel theModel)
	{
		view=theView;
		model=theModel;
		this.view.addCalculationListener(new CalculationListener());
	}
	
	
	public class CalculationListener implements ActionListener
	{

		@Override
		public void actionPerformed(ActionEvent arg0)
		{
			int firstNumber,secondNumber=0;
			
			try
			{
				firstNumber=view.getFirstNumber();
				secondNumber= view.getSecondNumber();
				
				model.addTwoNumbers(firstNumber, secondNumber);
				view.setCalculationSolution(model.getCalculationValue());
				
							
			}
			catch(Exception e)
			{
				view.displayErrorMessage("Enter only integers");
				System.err.println("Error");
			}
			
		}
		
	}
}
