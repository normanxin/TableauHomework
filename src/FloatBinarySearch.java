import java.util.Arrays;


public class FloatBinarySearch {
	/**
	 * Search the float element in an array. Return the first
	 * index of the target.
	 */
	public static int search(float[] nums, float target) {
		if (nums == null || nums.length == 0) {
			return -1;
		}
		
		Arrays.sort(nums);
		
		int left = 0, right = nums.length - 1;
		while (left + 1 < right) {
			int mid = left + (right - left) / 2;
			
			// Float.compare(f1, f2)
			// return 0 if numerically f1 == f2
			// return -1 if numerically f1 < f2
			// return 1 if numerically f1 > f2
			int compare = Float.compare(nums[mid], target);
			
			if (compare == -1) {
				left = mid;
			} else {
				right = mid;
			}
		}
		
		if (Float.compare(nums[left], target) == 0) {
			return left;
		}
		
		if (Float.compare(nums[right], target) == 0) {
			return right;
		}
		
		return -1;
	}
}
