// Given an array, print the max, min, and average values for that array.
// ex. for [3,15,99,0,4] the max is 99, the min is 0, and the average is 24.2

public class MaxMinAvg {

	public static void maxMinAvg(int[] arr){
		int len = arr.length;
		if(len == 0){
			System.out.println("Array is empty");
			return;
		}
		double sum = arr[0];
		int max = arr[0];
		int min = arr[0];
		for(int i=1;i<len;i++){
			sum += arr[i];
			if(arr[i] > max){
				max = arr[i];
			}
			if(arr[i] < min){
				min = arr[i];
			}
		}
		System.out.format("Max is %d, Min is %d, Avg is %.2f\n", max, min, sum/len);
	}

	public static void main(String[] args) {

		int[] testArr = {3,15,99,0,4};
		maxMinAvg(testArr);

	}

}