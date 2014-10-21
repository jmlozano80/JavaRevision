import java.util.Scanner;

public class PrimeNumbers {
	public static void main(String argrs[]) {
		Scanner input = new Scanner(System.in);
		System.out
				.println("You want to find the primes number from 1 to ... (please insert the limit number)");
	
		int limitNumber = input.nextInt();

		for (int i = 1; i <= limitNumber; i++) {
			int counter = 0;
			for (int j = 1; j <= i; j++) {
				if (i % j == 0) {
					
					counter++; 
				}
			}
			if (counter <= 2) {
				System.out.println(i);
			}
		}
	}

}