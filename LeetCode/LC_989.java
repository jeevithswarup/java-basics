import java.util.Arrays;

public class LC_989 {
    
    public void AddToArray() {
        int[] arr = new int[] { 2, 3, 4 };
        int k = 123;
        int temp;
        for (int i = arr.length - 1; i >= 0; i--) {
            temp = k % 10;
            k = k / 10;
            arr[i] = temp + arr[i];
        }
        System.out.println(Arrays.toString(arr));
    }
    public static void main(String[] args) {
        LC_989 obj = new LC_989();
        obj.AddToArray();
    }
}