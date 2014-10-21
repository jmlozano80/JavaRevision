package calculatorMVC;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class SortArray 
{
		
	public static void main(String[] args) {
		
		List<Integer> list =new ArrayList<>();
		list.add(27);
		list.add(3);
		list.add(99);
		System.out.println(list);
		Collections.sort(list);
		
		System.out.println(list);
		
		Collections.reverse(list);
		
		System.out.println(list);
	}
}
