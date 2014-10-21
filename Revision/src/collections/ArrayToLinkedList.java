package collections;

import java.util.List;
import java.util.LinkedList;

public class ArrayToLinkedList 
{
	
	
	public static void main(String[] args) {
		
		List<String> linkedList1=new LinkedList<String>();
		String array1[]={"Juan","Luis","Pedro","Antonio"};
		
		List<String> linkedList2=new LinkedList<String>();
		String array2[]={"Joe","Paul","Pedro","Perter"};
		
		for(String x:array1)
		{
			linkedList1.add(x);
		}
		
		for(String y:array2)
		{
			linkedList2.add(y);
		}
		
		linkedList1.addAll(linkedList2);
		
		linkedList2=null;
		
		printList(linkedList1);
		removeStuff(linkedList1,2,5);
		printList(linkedList1);
		reverseList(linkedList1);
	}

	private static void reverseList(List<String> linkedList1)
	{
		for(String x:linkedList1)
		{
			System.out.printf("%s\t",x);
		}
		
	}

	private static void removeStuff(List<String> linkedList1, int i, int j) {
		
		
	}

	private static void printList(List<String> linkedList1) {
	
		
	}

}
