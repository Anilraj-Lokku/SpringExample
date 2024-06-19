public class LinearSearc {

	public static void main(String[] args) {
		int[] nums = {2, 3, 6, 12, 34, 56, 13, 19, -1};
		int target = 34;
		int result = linearSearch(nums, target);
		System.out.println("Index Found At " +result);
	}
	
	static int linearSearch(int[] arr, int target) {
		if (arr.length == 0) {
			return -1;
		}
		for (int index = 0; index < arr.length; index++) {
			int element = arr[index];
			if (element == target) {
				return index;
			}
		}
		// Return -1 if the target element is not found
		return -1;
	}
}
