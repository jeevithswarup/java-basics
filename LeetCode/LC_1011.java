public class LC_1011 {


    public int shipWithinDays(int[] weights, int days) {
        int low = 0;
        int high = 0;
        for (int x : weights) {
            low = Math.max(low, x);
            high += x;
        }
        while (low <= high) {
            int capacity = (low + high) / 2;
            
        }

        return 0 ;
    }

    public boolean isValid(int[] weights, int capacity, int days) {
        int current_load = 0;
        int required_days= 1;
        for (int w : weights) {
            if (current_load + w <= capacity) {
                current_load += w;
            } else {
                required_days++;
                current_load = w;
            }
        }
        return required_days < days;
    }


    public static void main(String[] args) {
        LC_1011 obj = new LC_1011();
        int[] weights = new int[] { 1, 2, 3, 4, 5, 6, 7, 8, 9, 10 };
        int days = 5;
        obj.shipWithinDays(weights, days);
    }
}

