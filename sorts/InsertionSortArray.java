import java.util.Arrays;

public class InsertionSortArray {

	public static int[] insertionSort(int[] arr) {

		int len = arr.length;
		for(int i=1;i<len;i++){
			if(arr[i] < arr[i-1]) {
				int temp = arr[i];
				int index = i-1;
				for(int j=i-1;j>=0;j--) {
					if(temp < arr[j]) {
						arr[j+1] = arr[j];
						index = j;
					}
					else {
						break;
					}
				}
				arr[index] = temp;
			}
		}
		return arr;
	}

	public static void main(String[] args) {
		// test cases
		int[] testArr = {8,3,2,6,1,9};
		int[] testArr2 = {1,2,3,4,5,6};
		int[] testArr3 = {6,5,4,3,2,1};
		int[] testArr4 = {6,2,9,5,7,4,1,8,3,11,10};
		int[] testArr5 = {};
		int[] testArr6 = {8};
		System.out.println(Arrays.toString(insertionSort(testArr)));
		System.out.println(Arrays.toString(insertionSort(testArr2)));
		System.out.println(Arrays.toString(insertionSort(testArr3)));
		System.out.println(Arrays.toString(insertionSort(testArr4)));
		System.out.println(Arrays.toString(insertionSort(testArr5)));
		System.out.println(Arrays.toString(insertionSort(testArr6)));
	}

}
