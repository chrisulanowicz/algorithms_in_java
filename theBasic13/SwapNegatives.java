// Given an array of numbers, replace any negative values with the string 'Dojo'.
// ex. [4,5,-6,7] returns [4,5,'Dojo',7]

import java.util.ArrayList;

public class SwapNegatives {

	public static ArrayList<Object> swapNegatives(int[] arr) {

		ArrayList<Object> newArr = new ArrayList<Object>();
		for(int val : arr) {
			if(val < 0) {
				newArr.add("Dojo");
			}
			else {
				newArr.add(val);
			}
		}
		return newArr;
	}

	public static void main(String[] args) {
		// ArrayList<> testArr = new ArrayList<>();
		int[] testArr = {4,5,-6,7};
		System.out.println(swapNegatives(testArr));
	}

}