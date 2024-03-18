package week3.day2;

import java.util.HashSet;
import java.util.Set;

public class PrintDuplicates {
	
	
	
	public static void main(String[] args) {
		
		int[] nums = {4,2,3,2,4,7,6,8,6,9,1};
		//output=[2,4,6]
		
		// declare set
		Set<Integer> unique = new HashSet<>();
		Set<Integer> duplicates = new HashSet<>();
		for (int i = 0; i < nums.length; i++) {
			boolean add = unique.add(nums[i]);
			if (!add) {
				duplicates.add(nums[i]);
			}
		}
		
		System.out.println(duplicates);
		
		
		
		
		
		
		
		
		
		
	}

}
