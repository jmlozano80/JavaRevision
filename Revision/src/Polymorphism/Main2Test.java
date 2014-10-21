package Polymorphism;

public class Main2Test {

	public static void main(String[] args) {
		
		AnimalList animal=new AnimalList();
		Fish2 seaBass= new Fish2();
		Dog duende= new Dog();
		
		animal.addAnimalToList(seaBass);
		animal.addAnimalToList(duende);
	}
}
