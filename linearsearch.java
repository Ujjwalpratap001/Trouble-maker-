public class LinearSearch {
    public static int search(int[] arr, int target) {
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] == target) {
                return i; 
            }
        }
        return -1;
    }
    public static void main(String[] args) {
        int[] numbers = {12, 45, 67, 89, 23, 90, 54};
        int targetValue = 23;
        
        int resultIndex = search(numbers, targetValue);
        
        if (resultIndex != -1) {
            System.out.println("Element found at index: " + resultIndex);
        } else {
            System.out.println("Element not found in the array.");
        }
    }
}
