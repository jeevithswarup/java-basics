public class LC_1011 {


    public int shipWithinDays(int[] weights, int days) {
        int low = 0;
        int high = 0;
        for (int x : weights) {
            low = Math.max(low, x);
            high += x;
        }

        return 0;
    }
    public boolean 


    public static void main(String[] args) {
        LC_1011 obj = new LC_1011();
        int[] weights = new int[] { 1, 2, 3, 4, 5, 6, 7, 8, 9, 10 };
        int days = 5;
        obj.shipWithinDays(weights, days);
    }
}

