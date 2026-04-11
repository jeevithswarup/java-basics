public class LC_1482 {
    
    public int minDays(int[] bloomDay, int m, int k) {
        int n = bloomDay.length;
        int min = Integer.MAX_VALUE;
        int max = Integer.MIN_VALUE;
        for (int x : bloomDay) {
            min = Math.min(min, x);
            max=Math
        }
        if (n > m * k) {
            return -1;
        }

    }
    public static void main(String[] args) {
        LC_1482 obj = new LC_1482();
        int[] bloomDay = new int[] { 1, 10, 3, 10, 2 };
        int m = 3;
        int k = 1;
        obj.minDays(bloomDay, m, k);
    }
}
