public class OrderAgnosticBinarySearch {
    static int orderAgnosticBinarySearch(int[] arr, int target) {
        int start = 0;
        int end = arr.length - 1;
        boolean isAscending = arr[start] < arr[end]; // Check if array is sorted in ascending order

        while (start <= end) {
            int mid = start + (end - start) / 2;

            if (arr[mid] == target)
                return mid;

            if (isAscending) {
                if (arr[mid] < target)
                    start = mid + 1;
                else
                    end = mid - 1;
            } else {
                if (arr[mid] < target)
                    end = mid - 1;
                else
                    start = mid + 1;
            }
        }

        return -1; // Element not found
    }

    public static void main(String[] args) {
        int[] arr = { 4, 6, 10, 15, 18, 20, 22 };
        int target = 15;
        int result = orderAgnosticBinarySearch(arr, target);
        if (result != -1)
            System.out.println("Element found at index: " + result);
        else
            System.out.println("Element not found");
    }
}
