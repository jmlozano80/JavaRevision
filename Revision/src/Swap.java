
public class Swap {
	
	static String first = "first";
	static String second = "second";
	
	public static void main(String[] args) {
	
		first = first + second; //firstsecond
		second = first.substring(0, first.indexOf(second)); // first
											// 5
		first = first.replaceAll(second, "");
				/*first.substring(first., first.length()-1);*/
		
		
		System.out.println("The first " + first + "  The second " + second);
	}
	
}
