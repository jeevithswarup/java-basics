import java.util.Arrays;
public class LC_1480{
    
    public int []runningSum(int[] nums) {
        for (int i = 0; i < nums.length - 1; i++) {
            nums[i + 1] += nums[i];
        }
        return nums;

    }
public static void main(String[] args) {
    LC_1480 obj = new LC_1480();
    int [] nums=new int[]{3,1,2,10,1};

    System.out.println(Arrays.toString(obj.runningSum(nums)));
}

}
