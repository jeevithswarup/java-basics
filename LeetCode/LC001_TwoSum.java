package LeetCode;
import java.util.Arrays;
import java.util.Scanner;

public class LC001_TwoSum {
    
    public int[] twosum(int[] nums, int target) {
        for (int i = 0; i < nums.length; i++) {
            for (int j = i + 1; j < nums.length; j++) {
                if (nums[i] + nums[j] == target) {
                    return new int[] { i, j };
                }
            }
        }

        return new int[] { -1, -1 };

    }

   public static void main(String[] args) {
       Scanner sc = new Scanner(System.in);
       int n = sc.nextInt();
       int[] nums = new int[n];
              for (int i = 0; i < n; i++) {
           nums[i] = sc.nextInt();
       }
       int target = sc.nextInt();
     
       LC001_TwoSum obj = new LC001_TwoSum();
       int[] result = obj.twosum(nums, target);
        System.out.print(Arrays.toString(result));
} 
   
}
