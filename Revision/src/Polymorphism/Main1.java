package Polymorphism;

public class Main1 
{	
	public static void main (String args[])
	{
		Food menu[]=new Food[2];
		Food food= new Food();
		menu[1]= new Fish();
		menu[0]= new Cake();
		for (int i = 0; i < menu.length; i++) {
			menu[i].eat();
		}
		
		 System.out.println("");
		//from person fat
		Person p = new Person();
		p.digest(menu[1]);
		p.digest(food);
		p.digest(menu[0]);
		
	}
}
