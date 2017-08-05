// Analyze an array's values and print the average.
// ex. [3,5,4] prints 4

public class PrintAverage {

	public static void main(String[] args) {
		// test cases
		int[] testArr = {3,5,4};
		int[] testArr2 = {-2,0,4,5};
		getAverage(testArr);
		getAverage(testArr2);
	}

	public static void getAverage(int[] arr) {
		double sum = 0;
		for(int val : arr) {
			sum += val;
		}
		System.out.println(sum/arr.length);
	}

}