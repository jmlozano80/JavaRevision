import java.util.Scanner;


public class TimeClass
{
	static int seconds,minutes,hours;
	static String time,timeReg;
	public static void setTime()
	{
		Scanner input= new Scanner(System.in);
		try{
		System.out.println("Please insert the hour");
		hours=input.nextInt();
		if(hours>23||hours<0)
		{
			System.err.println("Please remember the hours only goes from 0 to 23");
			setTime();
		}
		
		System.out.println("Please insert the minnutes");
		minutes=input.nextInt();
		if(minutes>59||minutes<0)
		{
			System.err.println("Please remember the minutes only goes from 0 to 59");
			setTime();
		}
		
		
		System.out.println("Please insert the seconds");
		seconds=input.nextInt();
		
		if(seconds>59||seconds<0)
		{
			System.err.println("Please remember the seconds only goes from 0 to 59");
			setTime();
		}
		}
		catch(Exception e)
		{
			System.out.println("Please remember to input only integers");
			setTime();
			
		}
	}
	
	public static String displayTime(int h,int m, int s)
	{
		
		time=String.format("%02d:%02d:%02d", h,m,s);
		return time;
	}
	
	public static void again()
	{
		Scanner inputAgain= new Scanner(System.in);
		
		System.out.println("Do you want to try again?? (yes or not)");
		String answer=inputAgain.next();
		switch(answer)
		{
		case "yes":
			setTime();
			System.out.println(displayTime(hours,minutes,seconds));
			System.out.println(displayRegularTime(hours,minutes,seconds));
			again();
			break;
		case"not":
			System.err.println("ok Bye Bye remember your las hours set up was: "+time );
			System.exit(0);
			default:
				System.out.println("Sorry i could not understand you" );
				again();
				break;
		}
	}
	
	
	public static void main(String args[])
	{
		setTime();
		System.out.println(displayTime(hours,minutes,seconds));
		System.out.println("*******");
		System.out.println(displayRegularTime(hours,minutes,seconds));
		again();
	}
	
	public static String displayRegularTime(int h,int m, int s)
	{
		int hour;
		
		hour=h;
		
		if(hour==0||hour==12)
		{
			hour=12;
			
		}
		else{hour=hour%12;}
		String amOrPm="Am";
		
		if(h>12){amOrPm="PM";}
		
		timeReg=String.format("%d:%02d:%02d %s", hour,m,s,amOrPm);
		return timeReg;
	}
}
