import java.util.Arrays;

public class LC_189 {
   
    public void Rotate(int[] nums, int k) {
        int n = nums.length;
        k = k % n;

        reverse(nums, 0, n - 1);
        
        reverse(nums, 0, k - 1);
        
        reverse(nums, n, n);
    }
    
    public void reverse(int[] nums, int start, int end) {
        while (start < end) {
            int temp = nums[start];
            nums[start] = nums[end];
            nums[end] = temp;
            start++;
            end--;
             }

    }
    public static void main(String[] args) {
        LC_189 obj = new LC_189();
        int[] nums = new int[] { 1, 2, 3, 4, 5, 6, 7 };
        int k = 3;
        obj.Rotate(nums, k);
        System.out.println(Arrays.toString(nums));
    }

}