package collections;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class CopyList 
{
	public static void main(String[] args) {

		Character c[]={'A','B','C'};
		
		List<Character> listOfCharacter=Arrays.asList(c);
		
		System.out.println("This is the listOfCharacter");
		
		for(Character x:listOfCharacter)
		{
			System.out.printf("%s ",x);
		}
		System.out.println(" ");
		System.out.println("This is the reverse listOfCharacter");
		
		Collections.reverse(listOfCharacter);
		for(Character y:listOfCharacter)
		{
			System.out.printf("%s ",y);
		}
		
		System.out.println(" ");
		System.out.println("This is a copyy of the reverse listOfCharacter");
		
		Character copyOfc[]=new Character[3];
		
		List<Character>copyOfList=Arrays.asList(copyOfc);
		
		Collections.copy(copyOfList, listOfCharacter);
		
		for(Character s:copyOfList)
		{
			System.out.printf("%s ",s);
		}
		
	}

}