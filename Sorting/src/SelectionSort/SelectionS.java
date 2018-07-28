package SelectionSort;

import java.util.Arrays;

import SortUtils.ArrayGenerator;
import SortUtils.SwapUtil;

public class SelectionS {

	
	
	public static void main(String[] args) {
//		ArrayGenerator.printArray(selectionSort(ArrayGenerator.getArray()));
		int[] arr = selectionSort(ArrayGenerator.getArray());
		System.out.println(Arrays.toString(arr));
	}

	private static int[] selectionSort(int[] array) {
		for(int i=0;i<array.length;i++){
			int minIndex = getMin(array,i+1,array.length);
			if(array[i]>array[minIndex]){
				SwapUtil.swap(array, i, minIndex);
			}
		}
		return array;
	}
	
	private static int getMin(int[] arr, int s, int n){
		if(s == n-1){
			return s;
		} 
		
		return Math.min(arr[getMin(arr,s+1,n)], arr[s]);
	}

}
