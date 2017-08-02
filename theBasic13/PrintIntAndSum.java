// Print integers from 0 to 255, and with each integer print the sum so far.
// ex. Current integer: 2. Running sum: 3.

public class PrintIntAndSum {

	public static void main(String[] args) {

		int sum = 0;
		for(int i=0; i<256; i++) {
			sum += i;
			System.out.format("Current integer: %d. Running sum: %d.\n", i, sum);
		}

	}

}