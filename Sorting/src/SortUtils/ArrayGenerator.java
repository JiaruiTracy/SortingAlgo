package SortUtils;

import java.util.Arrays;

/*
 * singleton used to generate the array*/

public class ArrayGenerator {
	
	public static int[] getArray(){
		int[] arr = new int[8];
		for(int i=0;i<8;i++){
			arr[i] = (int)(Math.random()*100);
		}
		return arr;
	}
	
	public static void printArray(int[] arr){
		System.out.println(Arrays.toString(arr));
	}
	
}
