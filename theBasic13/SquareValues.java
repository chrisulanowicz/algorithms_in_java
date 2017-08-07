// Square each value in a given array, returning that same array with changed values.
// ex. [4,5,6,7] returns [16,25,36,49]

import java.util.Arrays;

public class SquareValues {

	public static int[] squareValues(int[] arr) {
		int len = arr.length;
		for(int i=0;i<len;i++) {
			arr[i] *= arr[i];
		}
		return arr;
	}

	public static void main(String[] args) {
		int[] testArr = {4,5,6,7};
		System.out.println(Arrays.toString(squareValues(testArr)));
	}

}