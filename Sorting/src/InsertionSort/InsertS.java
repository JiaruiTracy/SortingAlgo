package InsertionSort;

import java.util.Arrays;

import SortUtils.ArrayGenerator;
import SortUtils.SwapUtil;

public class InsertS {

	public static int[] insertionSort(int[] arr) {
		for (int i = 1; i < arr.length; i++) {
			for (int j = i; j > 0; j--) {
				if (arr[j - 1] > arr[j]) {
					SwapUtil.swap(arr, j - 1, j);
				}
			}
		}
		return arr;
	}


	public static void main(String[] args) {
		ArrayGenerator.printArray(insertionSort(ArrayGenerator.getArray()));
	}
}
