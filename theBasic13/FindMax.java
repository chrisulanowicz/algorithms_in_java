// Find and Print Max
// Given an array, find and print its largest element.
// ex. [1,5,4] prints 5

public class FindMax {

	public static void main(String[] args) {

		int[] testArr = {1,5,4};
		int[] testArr2 = {};
		int[] testArr3 = {-2,-5,-1};

		findMax(testArr);
		findMax(testArr2);
		findMax(testArr3);

	}

	public static void findMax(int[] arr) {

		int len = arr.length;
		if(len == 0) {
			System.out.println("Array is empty");
			return;
		}
		int max = arr[0];
		for(int i=1;i<len;i++) {
			if(arr[i] > max) {
				max = arr[i];
			}
		}
		System.out.println(max);

	}

}