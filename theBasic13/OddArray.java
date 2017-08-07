// Create an array with all the odd integer between 1 and 255 (inclusive).

import java.util.ArrayList;

public class OddArray {

	public static ArrayList<Integer> oddArray() {
		ArrayList<Integer> arr = new ArrayList<>();
		for(int i=1;i<256;i+=2) {
			arr.add(i);
		}
		return arr;
	}

	public static void main(String[] args) {
		ArrayList arrayOfOdds = oddArray();
		System.out.println(arrayOfOdds);
	}
}