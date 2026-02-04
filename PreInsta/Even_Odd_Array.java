package PreInsta;
public class Even_Odd_Array {
    public void find_even_odd(int[] arr,int n) {
        int even_count = 0;
        int odd_count = 0;
        for (int i = 0; i < n; i++) {
            if (i % 2 == 0) {
                even_count++;
            } else if (i % 2 != 0) {
                odd_count++;
            }
        }
        System.out.println("Even Elements Count:"+ even_count);
        System.out.println("Odd Elements Count:" + odd_count);
}
    public static void main(String[] args) {
        int[] arr = new int[] { 101, 200, 301, 400, 501 };
        int n = arr.length;
        Even_Odd_Array obj = new Even_Odd_Array();
        obj.find_even_odd(arr, n);
    }
}
