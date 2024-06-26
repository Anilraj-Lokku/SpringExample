// Definition for ArrayReader interface.
interface ArrayReader {
    int get(int index);
}

public class Problem702 {
    public int search(ArrayReader reader, int target) {
        int index = 0;

        // Iterate through the array using linear search
        while (true) {
            int value = reader.get(index);
            
            // Check if the current value matches the target
            if (value == target) {
                return index; // Target found, return the index
            } else if (value == Integer.MAX_VALUE || value > target) {
                return -1; // Reached the end of the array or passed the target, return -1
            }
            
            index++;
        }
    }
    
    public static void main(String[] args) {
        // Example usage
        int[] arr = {-12, -15, 6, 7, 8, 9, 11, 18, 23, 45, 67, 69};
        ArrayReader reader = new ArrayReaderImpl(arr);
        Problem702 solution = new Problem702();
        int target = 11;
        int result = solution.search(reader, target);
        System.out.println("Index of target " + target + ": " + result);
    }
}

// Implementation of ArrayReader interface for testing purposes
class ArrayReaderImpl implements ArrayReader {
    private int[] arr;
    
    public ArrayReaderImpl(int[] arr) {
        this.arr = arr;
    }
    
    @Override
    public int get(int index) {
        if (index < 0 || index >= arr.length) {
            return Integer.MAX_VALUE;
        }
        return arr[index];
    }
}