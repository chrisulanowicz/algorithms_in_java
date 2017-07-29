// given an integer entered by user
// respond with the integer itself if it's not divisible by 5 or 3
// respond with "Fizz" if the integer is evenly divisible by 5
// respond with "Buzz" if the integer is evenly divisible by 3
// respond with "FizzBuzz" if the integer is even divisible by both 5 and 3

import java.util.Scanner;  // import Scanner so that we can get the users input

public class FizzBuzz {

	public static void main(String[] args) {

		Scanner input = new Scanner(System.in); // create our Scanner instance to get user input
		System.out.println("Enter a number:"); // ask the user for a number
		int response = input.nextInt(); // store the user's input in a variable
		if(response % 5 == 0 && response % 3 == 0) { // first check if the input is divisible by both
			System.out.println("FizzBuzz");
		}
		else if(response % 5 == 0) {  // if not then check if it's divisible by either 3 or 5
			System.out.println("Fizz");
		}
		else if(response % 3 == 0) {
			System.out.println("Buzz");
		}
		else { // if it wasn't divisible by anything previously then just respond with the integer
			System.out.println(response);
		}

	}

}