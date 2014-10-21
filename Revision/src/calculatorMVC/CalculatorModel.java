package calculatorMVC;

/**
 * This class in in charge of the data and method used for the elaboration of the calculator
 * @author Jose
 *
 */
public class CalculatorModel
{
	private int calculationValue;
	
	/*
	 * Method to add two values
	 */
	public void addTwoNumbers(int firstNumber, int secondNumber)
	{
		calculationValue=firstNumber+secondNumber;
	}
	
	//Method to return the calculation Value
	
	public int getCalculationValue()
	{
		return calculationValue;
	}
}
