public class LC_303 {
   
    public int[] NumArray(int[] nums) {
        int[] prefix = new int[nums.length];
        int prefixSum = 0;
        for (int i=0;i<nums.length;i++){
            prefix[i] = prefixSum + nums[i];
        }
        return prefix;
    }
    
    public int sumRange(int left, int right) {
        return 0;
    }

    public static void main(String[] args) {
        LC_303 obj = new LC_303();
    int[] nums = new int[] { -2, 0, 3, -5, 2, -1 };
    int left=0;
    int right=2;
    obj.NumArray(nums);
    obj.sumRange(left, right);

}
}
