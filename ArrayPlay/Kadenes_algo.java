public class Kadenes_algo {
    
    public int find_index(int[] nums) {
        int sum = 0;
        int max_sum = Integer.MIN_VALUE;
        int start = 0;
        int end = 0;
        for (int i = 0; i < nums.length; i++) {
            sum += nums[i];
            if (sum > max_sum) {
                max_sum = sum;
                end = i;
            }
            if (sum < 0) {
                sum = 0;
                start = i + 1;
            }

        }
        System.out.println(start + " " + end);
        return 0;
    }
    public static void main(String[] args) {
        Kadenes_algo new=
    }
}
