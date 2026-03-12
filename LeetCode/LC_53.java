class LC_53 {
    public int subarray(int[] nums) {
        int sum = Integer.MIN_VALUE;
        int max_sum = 0;
        for (int i = 0; i < nums.length; i++) {
            sum = nums[i];
            if (sum > 0) {
                sum += nums[i + 1];
                if (sum > max_sum) {
                    max_sum = sum;
                }
            }

           
        }
        System.out.print(max_sum);


        return 0;
    }
    public static void main(String[] args) {
        LC_53 obj = new LC_53();
        int[] nums = new int[] {-2, -3, 4, -1, -2, 1, 5,- 3};
        obj.subarray(nums);
    }
}