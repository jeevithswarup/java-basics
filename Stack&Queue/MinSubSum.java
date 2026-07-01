public class MinSubSum {
    
    public int sumSubarrayMins(int[] arr) {
        int sum=0;
        for (int i = 0; i < arr.length; i++) {
            int min=Integer.MAX_VALUE;
            for (int j = i; j <arr.length; j++) {
                min = Math.min(min, arr[j]);
                sum += min;
            }  
        }
             return sum;
    }
    public static void main(String[] args) {
        MinSubSum solution = new MinSubSum();
        int[] arr = {3, 1, 2, 4};
        System.out.println(solution.sumSubarrayMins(arr));
    }
}
