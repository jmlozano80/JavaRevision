import java.util.Random;


public class DiceFrequency
{
	public static void main (String args[])
	{
		Random random=new Random();
		int dice[]=new int[7];
		
		for (int roll  = 0; roll < 10; roll++) {
			
			++dice[1+random.nextInt(6)];
		}//int value= 1+random.nextInt(6);
			
		/*	switch(value)
			{
			case 1:
				dice[1]++;
				break;
			case 2:
				dice[2]++;
				break;
			case 3:
				dice[3]++;
				break;
			case 4:
				dice[4]++;
				break;
			case 5:
				dice[5]++;
				break;
			case 6:
				dice[6]++;
				break;
			}	
		}
		System.out.println("Face\tFrequency");
		
		*/
			int total=0;
			for(int n=1;n<dice.length;n++)
		{
			total=total+dice[n];
			System.out.println(n+"\t"+dice[n]);
		}
		
		System.out.println("The total of throws is "+total);
		
		
		
		
		
		
		
	}
}
