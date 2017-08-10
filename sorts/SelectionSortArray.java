import java.util.Arrays;

public class SelectionSortArray {

	public static int[] selectionSort(int[] arr) {

		int min;
		int minIdx;
		int temp;
		int len = arr.length;

		for(int i=0;i<len;i++) {
			min = arr[i];
			minIdx = i;
			for(int j=i+1;j<len;j++) {
				if(arr[j] < min) {
					min = arr[j];
					minIdx = j;
				}
			}
			if(minIdx != i) {
				temp = arr[i];
				arr[i] = arr[minIdx];
				arr[minIdx] = temp;
			}
		}
		return arr;
	}

	public static void main(String[] args) {

		//test cases
		int[] testArr = {8,3,2,6,1,9};
		int[] testArr2 = {1,2,3,4,5,6};
		int[] testArr3 = {6,5,4,3,2,1};
		int[] testArr4 = {6,2,9,5,7,4,1,8,3,11,10};
		int[] testArr5 = {};
		int[] testArr6 = {8};

		System.out.println(Arrays.toString(selectionSort(testArr)));
		System.out.println(Arrays.toString(selectionSort(testArr2)));
		System.out.println(Arrays.toString(selectionSort(testArr3)));
		System.out.println(Arrays.toString(selectionSort(testArr4)));
		System.out.println(Arrays.toString(selectionSort(testArr5)));
		System.out.println(Arrays.toString(selectionSort(testArr6)));
	}
}