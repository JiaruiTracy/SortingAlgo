package BubbleSort;

import java.util.Arrays;

import SortUtils.ArrayGenerator;
import SortUtils.SwapUtil;

public class BubbleSort {

	public static int[] bubbleSort(int[] arr){
		for(int i=0;i<arr.length-1;i++){
			for(int j =i+1;j<arr.length;j++){
				if(arr[i]>arr[j]){
					SwapUtil.swap(arr, i, j);
				}
			}
		}
		return arr;
	}

	public static void main(String[] args) {
		ArrayGenerator.printArray(bubbleSort(ArrayGenerator.getArray()));
	}

}
