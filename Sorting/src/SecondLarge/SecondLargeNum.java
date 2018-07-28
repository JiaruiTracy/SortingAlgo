package SecondLarge;

import java.util.Arrays;

import SortUtils.ArrayGenerator;

public class SecondLargeNum {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
//		int[] arr = second(ArrayGenerator.getArray());
		second(ArrayGenerator.getArray());
//		System.out.println(Arrays.toString(arr));
	}

	private static void second(int[] arr){
		System.out.println(Arrays.toString(arr));
		int first,second;
		first = arr[0]>arr[1]?arr[0]:arr[1];
		second = arr[0]>arr[1]?arr[1]:arr[0];
		for(int i=2;i<arr.length;i++){
			if(arr[i]>=first){
				second = first;
				first = arr[i];
			}else if(arr[i]<first&&arr[i]>=second){
				second = arr[i];
			}
		}
		System.out.println(first+","+second);
//		return arr;
	}
	
}
