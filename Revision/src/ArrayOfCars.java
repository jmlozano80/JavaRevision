import java.util.Scanner;
import java.util.Arrays;
public class ArrayOfCars 
{
	static Car[] cars= new Car[3];
	
	public static void main(String args[])
	{
		Scanner input=new Scanner(System.in);
		for(int i=0;i<cars.length;i++)
		{
			System.out.println("Please insert the model of the car "+(i+1));
			String model=input.nextLine();
			System.out.println("Please insert the color of the car "+(i+1));
			String color = input.nextLine();
			cars[i]= new Car();
			cars[i].setModel(model);
			cars[i].setColor(color);
			System.out.println("The model of the car "+(i+1)+" is "+cars[i].getModel());
			System.out.println("The color of the car "+(i+1)+" is "+cars[i].getColor());
			
		}
		
		System.out.println("The garage is formed by:");
		System.out.println(Arrays.toString(cars));
		int counter=1;
		for(Car car:cars){
		
			
			System.out.println("The car " +counter + " model is "+ car.getModel() +" the color is "+car.getColor());
			counter++;
		}
	}

}
