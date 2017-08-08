import java.util.Arrays; // required to print array structure for test case

public class BubbleSortArray {

		public static int[] bubbleSort(int[] arr) {

			int len = arr.length;
			for(int i=len;i>0;i--) {
				for(int j=0;j<i-1;j++) {
					if(arr[j] > arr[j+1]) {
						int temp = arr[j];
						arr[j] = arr[j+1];
						arr[j+1] = temp;
					}
				}
			}
			return arr;

		}

		public static void main(String[] args) {

			int[] testArr = {4,5,2,44,8,1,77};
			System.out.println(Arrays.toString(bubbleSort(testArr)));
		}

}