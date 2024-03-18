package week3.day2;

import java.util.HashSet;
import java.util.Set;

public class RemoveDuplicates {
	
	/**
	 * Set - sub interface of Collection
	 * Set wont allow duplicate values
	 * Implementation classes:
	 * HashSet - Random order
	 * LinkedHashSet - Insertion order
	 * TreeSet  - Sorted order
	 * add() - to add each item into the set
	 * remove() - to remove an element from the set
	 * get() -> Set do not have get()
	 * 
	 */
	
	public static void main(String[] args) {
		
		int[] nums = {4,2,3,2,4,7,6,8,6,9,1};
		// output = [4,2,3,7,6,8,9,1]
		//output = [1,2,3,4,6,7,8,9]
		
		// declare set
		Set<Integer> unique = new HashSet<>();
		for (int i = 0; i < nums.length; i++) {
			unique.add(nums[i]);
		}
		
		System.out.println(unique);
		
		
		
		
		
		
		
		
		
		
	}

}
