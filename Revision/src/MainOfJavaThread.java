
public class MainOfJavaThread {
	
	public static void main(String args[])
	{
		JavaThread thread1=new JavaThread("Thread 1");
		JavaThread thread2=new JavaThread("Thread 2");
		
		thread1.start();
		thread2.start();
		
	}
}