import java.util.ArrayList;
import java.util.Scanner;

public class ArrayListOfCars 
{
	 static ArrayList<Car> cars= new ArrayList<Car>();
	static Scanner input= new Scanner(System.in);
	static Car car = new Car();
	
	public static void main (String args[])
	{
		addCar();
		
		
	}
	
	public static void addCar()
	{
		System.out.println("Do you want to add a new car?? (yes or not)");
		
		String answer =input.nextLine();
		if(answer.equals("yes"))
		{
			System.out.println("Color of the car???");
			String color=input.nextLine();
			car.setColor(color);
		
			System.out.println("Model of the car???");
			String model=input.nextLine();
			car.setModel(model);
			
			cars.add(car);
			addCar();
		}
		
		else if (answer.equals("not"))
		{
			System.out.println("The lists of cars:::::::::::");
			printGarage();
			System.exit(0);
		}
		else
		{
			System.out.println("Sorry, I could not understand ");
			addCar();
		}
	}
	
	public static void printGarage()
	{
		System.out.println("The size is "+cars.size());
		for(int i=0;i<cars.size();i++)
		{
			
			System.out.println("The car number "+(i+1)+" is a "+ cars.get(i).getModel()+" "+" with color "+cars.get(i).getColor());
		}
	}
}
