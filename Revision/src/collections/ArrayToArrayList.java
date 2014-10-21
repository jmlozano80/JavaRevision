package collections;

import java.util.ArrayList;
import java.util.Iterator;

public class ArrayToArrayList 
{
	public static void main(String[] args) 
	{
		String array1 []={"Jose","Pepe","Luis","Leonardo"};
		ArrayList<String> arrayList1= new ArrayList();
		
		String array2[]= {"Jose","Pepe"};
		ArrayList<String> arrayList2= new ArrayList();
		
		//pass from array to arrayList
		
		System.out.println("The ArrayList1");
		for(String x :array1)
		{
			arrayList1.add(x);
			
			System.out.print(x+" ");
		}
		System.out.print(" \n");
		System.out.println("The ArrayList2");
		for(String x :array2)
		{
			arrayList2.add(x);
			System.out.print(x+" ");
			System.out.print(" ");
		}
		
		//this method compares the arrayList and delete the records that are equal on arrayList1
		compareArrayLists(arrayList1, arrayList2);
		System.out.print(" ");
		System.out.print(" \n");
		System.out.println("ArrayList1 afeter comparing and removing duplicates ");
		for(int i =0;i<arrayList1.size();i++)
		{
			System.out.print(arrayList1.get(i)+"  ");
		}
	}

	private static void compareArrayLists(ArrayList<String> arrayList1,
			ArrayList<String> arrayList2) {
		
		Iterator<String> iT= arrayList1.iterator();
		
		while(iT.hasNext())
		{
			if(arrayList2.contains(iT.next()))
			{
				iT.remove();
			}
			
			
		}
		
		
	}
}
