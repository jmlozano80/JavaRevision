import java.util.ArrayList;
import java.util.Scanner;


public class StaticExample
{
	private String name,lastName;
	
	
	static int membership=0;
	
	static ArrayList<StaticExample> arrayList= new ArrayList<StaticExample>();
	public StaticExample(String n ,String lN)
	{
		//membership++;
		name=n;
		lastName=lN;
		
		
	}
	
	
	public static void main (String args[])
	{
		
		insetMember();
		
	}
	
	private static void display() {
		for(StaticExample obj:arrayList)
		{
			 System.out.println(obj.name+"\t"+ obj.lastName+" number of members " +membership);
		}
		
	}


	public static void insetMember()
	{
		System.out.println("Do you want to insert a member in the club?? (yes or not)");
		Scanner input =new Scanner(System.in);
		String answer= input.next();
		
		switch(answer)
		{
			case "yes":
				membership++;
				System.out.println("Please insert the name");
				String name=input.next();
				
				System.out.println("Please insert the last name");
				String lName=input.next();
				System.out.printf("%s\t %s menbers in th club %d\n",name,lName,membership);
				
				StaticExample newObject= new StaticExample(name,lName);
				arrayList.add(newObject);
				insetMember();
				break;
				
			case"not":
				System.out.println("ok bye");
				System.out.println("DISPLAYING ALL THE MEMBERS");
				display();
				System.exit(0);
				
			default:
				System.out.println("Sorry i could not understand you");
				insetMember();
		}
	}


	
}
