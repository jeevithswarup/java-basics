public class Kadenes_algo {
    
    public int find_index(int[] nums) {
        int sum = 0;
        int max_sum = Integer.MIN_VALUE;
        int start = 0;
        int end = 0;
        int temp_start = 0;
        for (int i = 0; i < nums.length; i++) {
            sum += nums[i];
            if (sum > max_sum) {
                max_sum = sum;
                start = temp_start;
                end = i;
            }
            if (sum < 0) {
                sum = 0;
                temp_start = i + 1;
            }

        }
        System.out.println(start + " " + end);
        return max_sum;
    }
    public static void main(String[] args) {
        Kadenes_algo obj = new Kadenes_algo();
        int[] nums = new int[] { -2, -3, 4, -1, -2, 1, 5, -3 };
        obj.find_index(nums);
    }
}
