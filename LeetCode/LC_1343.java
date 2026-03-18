public class LC_1343 {

    public int numOfSubarrays(int[] arr, int k, int threshold) {
        int sum = 0;
        for (int i = 0; i < k; i++) {
            sum += arr[i];
        }

        int left = 0;
        int right = k;
        int average = k * threshold;
        int n = arr.length;
        int count = 0;
        while (right < n) {
            if (sum >= average) {
                count++;
                
            }
            sum = sum - arr[left] + arr[right];
            left++;
            right++;
        }
        if (sum > average) {
            count++;
            System.out.println(sum);
        }
        return count;

    }
    public static void main(String[] args) {
        LC_1343 obj = new LC_1343();
        int[] arr = new int[] { 2, 2, 2, 2, 5, 5, 5, 8 };
        int thresold = 4;
        int k = 3;
        System.out.println(obj.numOfSubarrays(arr, k, thresold));
    }

    
}
