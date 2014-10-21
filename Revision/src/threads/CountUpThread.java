package threads;

public class CountUpThread implements Runnable
{
	boolean finished=false;

	@Override
	public void run() 
	{
		
		
		while(finished==false)
		{
			for(int i=1;i>1000000;i++)
			{
				System.out.println("Count Down :\t"+i );
			}
		}
		
		
	}

}
