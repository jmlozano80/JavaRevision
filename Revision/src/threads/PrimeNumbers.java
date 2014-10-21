package threads;

import java.awt.BorderLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JScrollPane;
import javax.swing.JTextArea;
import javax.swing.JTextField;

public class PrimeNumbers extends JFrame implements Runnable , ActionListener
{

	//Global variables
	Thread t;
	JLabel label= new JLabel("Number of Prime Numbers ");
	JTextField amount=new JTextField("5",10);
	JButton btn1= new JButton("Show Primes");
	JTextArea primes= new JTextArea(8,40);
	
	
	
	//constructor
	public PrimeNumbers()
	{
		super("Show primes");
		setSize(420,300);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		BorderLayout bLayout= new BorderLayout();
		setLayout(bLayout);
		
		amount.setEnabled(true);
		//Two panel in the frame
		
		JPanel topPanel= new JPanel();
		topPanel.add(label);
		topPanel.add(amount);
		topPanel.add(btn1);
		add(topPanel,BorderLayout.NORTH);
		
		//Show the prime numbers in different lines
		JScrollPane showResult=new JScrollPane(primes);
		primes.setLineWrap(true);
		add(showResult,BorderLayout.CENTER);
		
		//add action to btn
		btn1.addActionListener(this);
		
		setVisible(true);
		
		
		
	}
	
	@Override
	public void run() {
		
		int amountOfPrimeNumbers=Integer.parseInt(amount.getText());
		
		System.out.println("Inside Run" +amountOfPrimeNumbers);
		int counter=0;
		int candidate=2;
		primes.append("The first "+amountOfPrimeNumbers+" prime numbers are: ");
		while(counter<amountOfPrimeNumbers)
		{
			if(isPrime(candidate)==true)
			{
				primes.append(candidate+" ");
				counter++;
			}
			candidate++;
		}
		
	}
	
	
	private boolean isPrime(int candidate) {
		
		for (int i=2;i<candidate;i++)
		{
			if(candidate%i==0)
			{
				return false;
			}
		}
		return true;
		
	}

	public static void main(String[] args) {
		PrimeNumbers pN= new PrimeNumbers();
		
	}

	@Override
	public void actionPerformed(ActionEvent e) {
		// TODO Auto-generated method stub
		if(t==null)
		{
			t= new Thread(this);
			t.start();
		}
		
	}

}
