package test;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JPasswordField;
import javax.swing.JTextField;

import java.awt.Color;
import java.awt.FlowLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class GUITest extends JFrame 
{
	private JLabel			jLabelName,jLabelPass;
	private JPasswordField 	password;
	private JTextField		nameText;
	private JPanel 			panel;
	private JButton			sendBtn;
	public GUITest()
	{
		
		super("This is the title");
		
		//Initialise  components
			jLabelName=new JLabel("name");
			nameText=new JTextField("  enter name");
			jLabelPass=new JLabel("password");	
			password=new JPasswordField();
			panel= new JPanel();
			
			sendBtn = new JButton("send");
			
			
			panel.setLayout(null);
		
	
			//set size
			setSize(290,190);
			jLabelName.setSize(100, 20);
			nameText.setSize(100, 20);
			jLabelPass.setSize(100, 20);
			password.setSize(100, 20);
			sendBtn.setSize(100,30);
			
		//appears in the center of the screen
		panel.setBackground(Color.WHITE);
		//when you press the x to close
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
		
		//set location
		jLabelName.setLocation(14, 20);
		nameText.setLocation(140, 20);
		jLabelPass.setLocation(12,60);
		password.setLocation(140,60);
		sendBtn.setLocation(100, 110);
		//jLabelName.setSize(100, 100);
		jLabelName.setToolTipText("enter the name");	
		jLabelPass.setToolTipText("enter password");
		
		//add components to panel
		panel.add(jLabelName);
		panel.add(nameText);
		panel.add(jLabelPass);
		panel.add(sendBtn);
		panel.add(password);
		//add components
		add(panel);

		
		//add(nameText);
		panel.setVisible(true);
		setVisible(true);
		
	
		//action to the button
		sendBtn.addActionListener(new ActionListener() {
 
            public void actionPerformed(ActionEvent e)
            {
                //Execute when button is pressed
            	String name= nameText.getText();
            	
            	String pasword=new String(password.getPassword());
            	
            	JOptionPane.showMessageDialog(null, "The name is "+name+" the password "+pasword);
                System.out.println("You clicked the button");
            }
        });      
 
		
		System.out.println(this.getClass().getName());
		
	}
	


	


	public static void main(String args[])
	{
		
		GUITest gui=new GUITest();
	}

}
