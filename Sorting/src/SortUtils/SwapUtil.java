package SortUtils;

public class SwapUtil {
	public static void swap(int[] arr, int l, int n){
		int temp = arr[l];
		arr[l] = arr[n];
		arr[n] = temp;
	}
}
