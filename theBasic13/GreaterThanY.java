// Given an array and a value Y, count and print the number of array values greater than Y.
// ex. arr=[1, 3, 5] and Y=2 should count 2

public class GreaterThanY {

	public static void greaterThanY(int[] arr, int y) {

		int count = 0;
		for(int val : arr) {
			if(val > y) {
				count++;
			}
		}
		System.out.println("There are " + count + " values greater than " + y);

	}

	public static void main(String[] args) {

		int[] testArr = {1,3,5};
		greaterThanY(testArr, 2);

	}

}