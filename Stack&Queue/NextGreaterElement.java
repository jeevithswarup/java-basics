
import java.util.Arrays;

public class NextGreaterElement {
   

    public int[] nextGreaterElement(int[] arr, int n) {
        int[] res = new int[n];
        Arrays.fill(res, -1);
        for (int i = 0; i < n; i++) {
            int nextGreaternumber = -1;
            for (int j = i + 1; j < n; j++) {
                if (arr[i] < arr[j]) {
                    nextGreaternumber = arr[j];
                    res[i] = nextGreaternumber;
                    break;
                } else {
                    res[i] = nextGreaternumber;
                }
            }
        }
     
        return res;
    }



    public static void main(String[] args) {
        NextGreaterElement obj = new NextGreaterElement();
        int[] arr = new int[] { 6, 0, 8, 1, 3 };
        int n = arr.length;
        System.out.println(Arrays.toString(obj.nextGreaterElement(arr, n)));

}
}

