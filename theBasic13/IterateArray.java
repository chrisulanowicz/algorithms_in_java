// Iterate through a given array, printing each value.

public class IterateArray {

	public static void iterateArray(int[] arr) {
		for(int val : arr){
			System.out.println(val);
		}
	}

	public static void main(String[] args) {
		int[] testArr = {3,4,56,9};
		iterateArray(testArr);
	}

}