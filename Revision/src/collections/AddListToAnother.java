package collections;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class AddListToAnother 
{
	public static void main(String[] args) {
		
		
		String g[]={"Perro","Gato","Pajaro"};
		List<String> arrayList1=Arrays.asList(g);
		
		List<String> arrayList2=new ArrayList<String>();
		arrayList2.add("Palmera");
		arrayList2.add("Girasol");
		arrayList2.add("Tulipan");
		
		System.out.println("This is arrayList1 :");
		for(String x:arrayList1)
		{
			System.out.printf("%s ",x);
		}
		System.out.println(" ");
		System.out.println("This is arrayList2 :");
		
		for(String y:arrayList2)
		{
			System.out.printf("%s ",y);
		}
		
		System.out.println(" ");
		System.out.println("This is arrayList2 added to arrayList1 :");
		Collections.addAll(arrayList2,g);
		
		for(String a:arrayList2)
		{
			System.out.printf("%s ",a);
		}
		
		
	System.err.println(Collections.frequency(arrayList2, "Palmera"));
	}
}
