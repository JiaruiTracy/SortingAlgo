package MergeSort;

public class MergeS {

	public static int[] array;

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] arr = { 1, 4, 2, 3, 9, 8, 5, 7, 0 };
		array = new int[arr.length];
		sort(arr, 0, arr.length - 1);
	}

	private static void merge(int[] arr, int lo, int mid, int hi) {
		int i = lo;//first start point
		int j = mid + 1;//second start point
		
		
	}

	private static void sort(int[] arr, int lo, int hi) {
		if (hi == lo) {
			return;
		}
		int mid = lo + (hi - lo) / 2;
		sort(arr, lo, mid);
		sort(arr, mid + 1, hi);
		merge(arr, lo, mid, hi);
	}

}
