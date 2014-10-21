package test;


import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.Icon;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JCheckBox;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JTextField;

public class GUI2 extends JFrame
{
	private JPanel panel;
	private JButton btn;
	private JLabel jlabel1;
	private JCheckBox checkBox1, checkBox2;
	private JTextField jText1;
	
	private Icon icon1,icon2;
	
	
	public GUI2()
	{
		super("This is the title");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
		//instantiate elements
		panel = new JPanel();
		icon1 = new ImageIcon(getClass().getResource("facebook.png"));
		icon2 = new ImageIcon(getClass().getResource("email.png"));
		btn=new JButton("press",icon1);
		btn.setRolloverIcon(icon2);
		checkBox1= new JCheckBox("bold");
		checkBox2= new JCheckBox("italic");
		jlabel1= new JLabel("This is a jLabel1");
		jText1= new JTextField();
		
		
		panel.setLayout(null);
		
		
		//set size
		super.setSize(800, 600);
		panel.setSize(290,290);
		btn.setSize(150,50);
		jlabel1.setSize(150,15);
		checkBox1.setSize(70, 15);
		checkBox2.setSize(70, 15);
		jText1.setSize(120,25 );
		//set Location
		
		panel.setLocation(1,1);
		btn.setLocation(300, 30);
		jlabel1.setLocation(325,90);
		jlabel1.setLocation(325,90);
		checkBox1.setLocation(300, 120);
		checkBox2.setLocation(370, 120);
		jText1.setLocation(300, 140);
		
		
		//add elements to panel and JFrame
		
		panel.add(btn);
		panel.add(jlabel1);
		panel.add(checkBox1);
		panel.add(checkBox2);
		panel.add(jText1);
		add(panel);
		
		
		//add action to the btn
		
		btn.addActionListener(new ActionListener()
		{

			@Override
			public void actionPerformed(ActionEvent e) {
				JOptionPane.showMessageDialog(null,"you pressed the btn");
				
			}
			
		});
		
		checkBox1.addActionListener(new ActionListener()
		{

			@Override
			public void actionPerformed(ActionEvent arg0) {
				// TODO Auto-generated method stub
			
				Font font=null;
				if(checkBox1.isSelected()==true && checkBox2.isSelected()==true)
				{
					font = new Font("Serif",Font.BOLD + Font.ITALIC,14);
					jText1.setFont(font);
				}
				else if (checkBox1.isSelected()==true)
				{
					font = new Font("Serif",Font.BOLD,14);
					jText1.setFont(font);
				}
				else if (checkBox2.isSelected()==true)
				{
					font = new Font("Serif",Font.ITALIC,14);
					jText1.setFont(font);
				}
				else
				{
					font = new Font("Serif",Font.PLAIN,14);
					jText1.setFont(font);
				}
			}
			
			
		});
		
		
		checkBox2.addActionListener(new ActionListener()
		{

			@Override
			public void actionPerformed(ActionEvent arg0) {
				// TODO Auto-generated method stub
			
				Font font=null;
				if(checkBox1.isSelected()==true && checkBox2.isSelected()==true)
				{
					font = new Font("Serif",Font.BOLD + Font.ITALIC,14);
					jText1.setFont(font);
				}
				else if (checkBox1.isSelected()==true)
				{
					font = new Font("Serif",Font.BOLD,14);
					jText1.setFont(font);
				}
				else if (checkBox2.isSelected()==true)
				{
					font = new Font("Serif",Font.ITALIC,14);
					jText1.setFont(font);
				}
				else
				{
					font = new Font("Serif",Font.PLAIN,14);
					jText1.setFont(font);
				}
			}
			
			
		});
		
		
		//set visible
		panel.setVisible(true);
		setVisible(true);
		
		
	}
	
	public static void main(String[] args) {
		GUI2 gui= new GUI2();
	}
}
