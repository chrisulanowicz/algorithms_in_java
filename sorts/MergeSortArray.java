import java.util.Arrays;

public class MergeSortArray {

	public static int[] mergeSort(int[] arr) {

		int len = arr.length;
		if(len < 2) {
			return arr;
		}
		int midIdx = len/2;
		int[] left = Arrays.copyOfRange(arr, 0, midIdx);
		int[] right = Arrays.copyOfRange(arr, midIdx, len);

		return merge(mergeSort(left), mergeSort(right));

	}

	public static int[] merge(int[] arr1, int[] arr2) {

		int len1 = arr1.length;
		int len2 = arr2.length;
		int combinedLen = len1 + len2;
		int[] merged = new int[combinedLen];
		int arr1Idx = 0;
		int arr2Idx = 0;
		for(int i=0;i<combinedLen;i++) {

			if(len1 == 0 || arr1Idx == len1) {
				merged[i] = arr2[arr2Idx];
				arr2Idx++;
			}
			else if(len2 == 0 || arr2Idx == len2) {
				merged[i] = arr1[arr1Idx];
				arr1Idx++;
			}
			else {
				if(arr1[arr1Idx] < arr2[arr2Idx]) {
					merged[i] = arr1[arr1Idx];
					arr1Idx++;
				}
				else {
					merged[i] = arr2[arr2Idx];
					arr2Idx++;
				}
			}
		}
		return merged;
	}

	public static int[] shift(int[] arr) {

		int len = arr.length-1;
		for(int i=0;i<len;i++) {
			arr[i] = arr[i+1];
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

		System.out.println(Arrays.toString(mergeSort(testArr)));
		System.out.println(Arrays.toString(mergeSort(testArr2)));
		System.out.println(Arrays.toString(mergeSort(testArr3)));
		System.out.println(Arrays.toString(mergeSort(testArr4)));
		System.out.println(Arrays.toString(mergeSort(testArr5)));
		System.out.println(Arrays.toString(mergeSort(testArr6)));

	}

}