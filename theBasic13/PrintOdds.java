// Print Odds 1 - 255
// Print all odd integers from 1 to 255.

public class PrintOdds {

	public static void main(String[] args) {

		for(int i=1;i<256;i+=2) { // standard for loop that starts at 1 and increments by 2 thus getting each odd number
			System.out.println(i); // since i is incremented by 2 it'll always be an odd number
		}

		// this can also be done with the modulus operator but is not as efficient
		// for(int i=1;i<256;i++) { // create the for loop
		// 	if(i % 2 != 0) { // check if i mod 2 returns a remainder meaning it's not evenly divisible by 2 and is therefore an odd number
		// 		System.out.println(i); // if the check passes print i
		// 	}
		// }

	}

}
