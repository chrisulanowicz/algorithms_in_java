// Return the given array, after setting any negative values to zero.
// ex. [4,5,-6,7] returns [4,5,0,7]

import java.util.Arrays;

public class ZeroNegatives {

	public static int[] zeroNegatives(int[] arr) {
		int len = arr.length;
		for(int i=0;i<len;i++) {
			if(arr[i] < 0) {
				arr[i] = 0;
			}
		}
		return arr;
	}

	public static void main(String[] args) {
		int[] testArr = {4,5,-6,7};
		System.out.println(Arrays.toString(zeroNegatives(testArr)));
	}

}