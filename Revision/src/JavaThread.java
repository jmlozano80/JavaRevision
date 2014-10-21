import java.util.Random;


public class JavaThread extends Thread 
{
	
	String message;
	
	public JavaThread(String message)
	{
		this.message=message;
	}
	public void run()
	{
		for(int i=1;i<11;i++)
		{
			
			try {
				
				Random random = new Random();
				// Maximum sleep in ms
				int maxSleep = 1200;
				
				// Minimum sleep in ms
				int minSleep = 300;
				
				// Calculate random sleep
				int randomSleep = random.nextInt((maxSleep - minSleep) + minSleep);
				sleep(randomSleep);
				
				System.err.println("This is " + i+" message = "+message);
				
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
	}
	
	
	

}
