package Polymorphism;

public class AnimalList 
{
	private Animal[] animalArray= new Animal[5];
	
	private int i=0;
	
	
	public void addAnimalToList(Animal a)
	{
		if(i<animalArray.length)
		{
			animalArray[i]=a;
			System.out.println("A new Animal was added to the list");
			i++;
			
		}
	}

}
