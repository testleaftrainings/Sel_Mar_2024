package week3.day1;

public class FindDuplicates {
	
	public static void main(String[] args) {
		int[] nums = {2, 5, 7, 7, 5, 9, 2, 3};
//		//Method 1:
//		// Sort the array
//		Arrays.sort(nums);
//		for (int i = 0; i < nums.length-1; i++) {
//			if (nums[i]==nums[i+1]) {
//				System.out.println(nums[i]);
//				
//			}
//		}
		
		//Method-2:
		for (int i = 0; i < nums.length; i++) {
			for (int j = i+1; j < nums.length; j++) {
				if (nums[i]==nums[j]) {
					System.out.println(nums[i]);
				}
				
			}
			
		}
		
		

	}

}
