public class LC_1482 {
    
    public int minDays(int[] bloomDay, int m, int k) {
        int n = bloomDay.length;

        if (n < m * k) {
            return -1;
        }

        int min = Integer.MAX_VALUE;
        int max = Integer.MIN_VALUE;

        for (int x : bloomDay) {
            min = Math.min(min, x);
            max = Math.max(max, x);
        }

        return findDay(bloomDay, min, max, m, k);
    }

    public boolean isBloom(int[] bloomDay, int day, int m, int k) {
        int count = 0;
        int bouquets = 0;

        for (int i = 0; i < bloomDay.length; i++) {
            if (bloomDay[i] <= day) {
                count++;
            } else {
                bouquets += (count / k);
                count = 0;
            }
        }

        bouquets += (count / k);

        return bouquets >= m;
    }

    public int findDay(int[] bloomDay, int min, int max, int m, int k) {
        int low = min;
        int high = max;

        while (low <= high) {
            int mid = (low + high) / 2;

            if (isBloom(bloomDay, mid, m, k)) {
                high = mid - 1;
            } else {
                low = mid + 1;  
            }
        }

        return low;
    }

    public static void main(String[] args) {
        LC_1482 obj = new LC_1482();
        int[] bloomDay = {1, 10, 3, 10, 2};
        int m = 3;
        int k = 1;

        System.out.println(obj.minDays(bloomDay, m, k));
    }
}