// Given an array, move all values forward by one index, dropping the first and leaving a '0' value at the end.
// ex. [4,5,6,7] becomes [5,6,7,0]

import java.util.Arrays;

public class ShiftArray {

	public static int[] shiftValues(int[] arr) {
		int len = arr.length;
		int i;
		for(i=0;i<len-1;i++) {
			arr[i] = arr[i+1];
		}
		if(len > 0) {
			arr[i] = 0;
		}
		return arr;
	}

	public static void main(String[] args) {
		int[] testArr = {4,5,6,7};
		System.out.println(Arrays.toString(shiftValues(testArr)));
	}

}