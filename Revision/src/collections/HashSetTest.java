package collections;

import java.util.Arrays;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class HashSetTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		String array1[]={"Juan","Pedro","Luis","Juan","Jose"};
		List<String>list1=Arrays.asList(array1);
		System.out.printf("%s",list1);
		System.out.println("");
		Set set1= new HashSet<String>(list1);
		System.out.printf("%s",set1);

	}

}
