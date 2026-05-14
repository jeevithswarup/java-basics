public class rotate {

    public static void main(String[] args) {
        int N = 12345;
        int k = 2;
        int temp = N;
        int rev = 0;
        

            rev = (rev + temp % (int) Math.pow(10, k + 1))*(int)Math.pow(10,k) +temp / (int) Math.pow(10, k + 1);
            System.out.println(rev);
        

    }
}
