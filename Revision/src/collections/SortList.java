package collections;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class SortList 
{
	public static void main(String[] args) {
	
		String array1[]={"Juan","Pedro","Wesley","Antonio","Luis","Zape","Laslo"};
		List<String> list1=Arrays.asList(array1);
		
		Collections.sort(list1);
		
		System.out.println(list1);
		
		Collections.reverse(list1);
		
		System.out.println(list1);
		
	}
	
	
	

}
