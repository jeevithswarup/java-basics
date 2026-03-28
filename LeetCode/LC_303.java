
public class LC_303 {
   
    public int[] NumArray(int[] nums) {
        int[] prefix = new int[nums.length];
        int prefixSum = 0;
        for (int i = 0; i < nums.length; i++) {
            prefixSum += nums[i];
            prefix[i] = prefixSum;
        }
        return prefix;
    }
    
    public int sumRange(int[] prefix, int left, int right) {
        if (left == 0) {
            return prefix[right];
        }else{
            return prefix[right]-prefix[left-1];
        }
    }

    public static void main(String[] args) {
        LC_303 obj = new LC_303();
    int[] nums = new int[] { -2, 0, 3, -5, 2, -1 };
    int left=0;
    int right=2;
   
   System.out.println(obj.sumRange( obj.NumArray(nums),left, right));

}
}
