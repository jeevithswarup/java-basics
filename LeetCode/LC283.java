import java.util.Arrays; 
public class LC283{
  
    public void MoveZero() {
        int[] nums = new int[] { 0, 1, 0, 3, 2 };
        int k = 0;
        for (int i = 0; i < nums.length; i++) {
            if (nums[i] != 0) {
                nums[k] = nums[i];
                k++;
            }
        }
        while (k < nums.length) {
            nums[k] = 0;
            k++;
        }
        System.out.println(Arrays.toString(nums));

    }
    public static void main(String[] args) {
        LC283 obj = new LC283();
        obj.MoveZero();
    }

}
