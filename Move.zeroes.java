import java.util.Scanner;

public class MoveZeroes {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        int n = scanner.nextInt();
        int[] nums = new int[n];
        
        for (int i = 0; i < n; i++) {
            nums[i] = scanner.nextInt();
        }
        
        moveZeroes(nums);
        
        for (int num : nums) {
            System.out.print(num + " ");
        }
        
        scanner.close();
    }

    public static void moveZeroes(int[] nums) {
        int insertPos = 0;
        
        for (int num : nums) {
            if (num != 0) {
                nums[insertPos++] = num;
            }
        }
        
        while (insertPos < nums.length) {
            nums[insertPos++] = 0;
        }
    }
}
