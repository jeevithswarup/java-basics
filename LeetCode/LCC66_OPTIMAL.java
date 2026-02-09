public class LCC66_OPTIMAL {
    

    public int[] PLusOne(int[] digits) {
        for (int i = digits.length - 1; i >= 0; i--) {
            if (digits[i] < 9) {
                digits[i]++;
                return PLusOne(digits);
            }
            digits[i] = 0;
        }
        int[] result = new int[digits.length+1];
        result[0] = 1;
        return result;
    }

    public static void main(String[] args) {
        int[] digits = new int[]{9,9,9};
        LCC66_OPTIMAL obj = new LCC66_OPTIMAL();
        obj.PLusOne(digits);
    }
}
