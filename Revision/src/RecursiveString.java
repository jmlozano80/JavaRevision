
public class RecursiveString {
	
	private static String reversed = "";
	
	
	
	public static void main(String[] args) {
		String someReversedCrap = reverseString("Jo53somehardercrap");
	System.out.println(someReversedCrap);
		
	}
	
	public static String reverseString(String input) {
		
		// break point
		if (input.length() == 0) return reversed;
		
		
		reversed += input.charAt(input.length()-1);
		// Delete last index from String
		input = input.substring(0, (input.length()-1));
		
		
		return reverseString(input);
	}
}
