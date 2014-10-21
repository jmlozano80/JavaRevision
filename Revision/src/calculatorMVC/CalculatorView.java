package calculatorMVC;

import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JTextField;

public class CalculatorView extends JFrame
{
	private JTextField firstNumber= new JTextField(10);
	private JLabel additionLabel=new JLabel("+");
	private JTextField secondNumber= new JTextField(10);
	private JButton calculateBtn=new JButton("Calculate");
	private JTextField calculationSolution= new JTextField(10);
	private JPanel calcPanel= new JPanel();
	
	//constructor
	public CalculatorView()
	{
		super("Simple Sum calculator MVC");
		this.setDefaultCloseOperation(EXIT_ON_CLOSE);
		this.setSize(600,200);
		
		//add Elements
		calcPanel.add(firstNumber);
		calcPanel.add(additionLabel);
		calcPanel.add(secondNumber);
		calcPanel.add(calculateBtn);
		calcPanel.add(calculationSolution);
		
		this.add(calcPanel);
		
		
		
		
	}
	
	//get the text from the JTextField firstNumber
	
	public int getFirstNumber()
	{
		return Integer.parseInt(firstNumber.getText());
	}
	
	//get the text from the JTextField firstNumber
	
	public int getSecondNumber()
	{
		return Integer.parseInt(secondNumber.getText());
	}
	
	//get the text from the JTextField firstNumber
	
	public int getCalculationSolution()
	{
			return Integer.parseInt(calculationSolution.getText());
	}
	
	
	//set calculation solution text
	
	public void setCalculationSolution(int solution)
	{
		calculationSolution.setText(Integer.toString(solution));
	}
	
	
	public void addCalculationListener(ActionListener listenForCalcButton)
	{
		
		calculateBtn.addActionListener(listenForCalcButton);
		
	}
	
	public void displayErrorMessage(String errorMessage)
	{
		JOptionPane.showMessageDialog(this, errorMessage);
	}

}
