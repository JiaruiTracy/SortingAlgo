package BucketSort;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class BucketS {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] nums = { 33, 9, 16, 12, 28, 98, 58, 76, 3, 54, 67, 62, 72, 18 };
		nums = bucketSort(nums);
		for(int ns:nums){
			System.out.print(ns+",");
		}
	}

	private static int[] bucketSort(int[] nums) {
		List<Integer>[] bucket = new ArrayList[10];
		for (int n : nums) {
			int index = n/10;
			if (bucket[index] == null) {
				bucket[index] = new ArrayList<Integer>();
			}
			bucket[index].add(n);
		}
		
		for(int i=0,j=0;i<bucket.length;i++){
			if(bucket[i]!=null){
				Collections.sort(bucket[i]);
				for(Object bt:bucket[i].toArray()){
					nums[j] = Integer.valueOf(bt.toString());
					j++;
				}
			}
			
		}
		
//		for(int i=0;i<bucket.length;i++){
//			//re-organize
//			
//		}
		
		return nums;
	}

}
