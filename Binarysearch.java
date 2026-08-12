import java.util.Arrays;

public class BuiltInBinarySearch {
    public static void main(String[] args) {
        int[] numbers = {10, 23, 35, 47, 59, 68, 72, 81};
        int target = 47;
        
        // The array MUST be sorted before calling this method
        int index = Arrays.binarySearch(numbers, target);
        
        if (index >= 0) {
            System.out.println("Element found at index: " + index);
        } else {
            System.out.println("Element not found.");
        }
    }
}
