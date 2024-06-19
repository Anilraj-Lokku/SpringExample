
public class Ceiling {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] arr = {2,3,5,9,14,16,18};
		int target =15;
		int res = ceilingNumber(arr, target);
		System.out.println("The Ceil Off The Number is Found At Index of" + " "+res);

	}
	static int ceilingNumber(int[] arr, int target) {
		if(target >arr[arr.length-1]) {
			return -1;
		}
		int start=0;
		int end =arr.length-1;
		
		while(start<= end) {
			//Find The Middle Element
			int mid =start+(end-start)/2;
			
			if(target<arr[mid]) {
				end=mid-1;
			}
			else if(target>arr[mid]){
				start=mid+1;
			}
			else {
				return mid;
			}
		}
		return start;
	}

}
