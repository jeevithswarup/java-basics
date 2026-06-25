
import java.util.Arrays;
import java.util.Stack;

public class NextGreaterElement {
   

    public int[] nextGreaterElement(int[] arr, int n) {
        Stack<Integer> st = new Stack<>();
        int[] res = new int[n];
        for (int i = n - 1; i >= 0; i--) {

            while (!st.isEmpty() && st.peek() <= arr[i]) {
                st.pop();
            }
                if (st.isEmpty()) {
                    res[i] = -1;
                } else {
                    res[i] = st.peek();
                }
                st.push(arr[i]);

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



// -------------------------------------------Bruteforce
//  int[] res = new int[n];
//         Arrays.fill(res, -1);
//         for (int i = 0; i < n; i++) {
//             int nextGreaternumber = -1;
//             for (int j = i + 1; j < n; j++) {
//                 if (arr[i] < arr[j]) {
//                     nextGreaternumber = arr[j];
//                     res[i] = nextGreaternumber;
//                     break;
//                 } else {
//                     res[i] = nextGreaternumber;
//                 }
//             }
//         }