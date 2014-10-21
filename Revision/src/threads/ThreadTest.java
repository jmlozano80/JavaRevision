package threads;

import java.util.Random;


public class ThreadTest implements Runnable 
{
	String nameThread;
	int sleepTime;
	Random r=new Random();
	
	public ThreadTest(String name)
	{
		nameThread=name;
		sleepTime=r.nextInt(1000);
	}

	@Override
	public void run() 
	{
		
		try {
			System.out.printf("%s is sleeping for %d\n",nameThread,sleepTime);
			Thread.sleep(sleepTime);
			System.out.printf("%s is done\n",nameThread);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
	}
	
	public static void main(String[] args) {
		ThreadTest blabla = new ThreadTest("one");
		Thread t1= new Thread(blabla);
		Thread t2= new Thread(new ThreadTest("two"));
		Thread t3= new Thread(new ThreadTest("three"));
		Thread t4= new Thread(new ThreadTest("four"));
		
		t1.start();
		t2.start();
		t3.start();
		t4.start();
	}

	

}
