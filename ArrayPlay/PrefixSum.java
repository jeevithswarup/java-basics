public class PrefixSum{
    public int[] Prefix(int[] arr) {
        int[] pre = new int[arr.length];
        pre[0] = arr[0];
        int L = 0;
        int R = 3;
        for (int i = 1; i < arr.length; i++) {
            pre[i] = pre[i - 1] + arr[i];
        }
        if (L == 0) {
            System.out.println(pre[R]);
        } else {
        System.out.println(pre[R]-pre[L-1]);
    }


        return pre;
    }
    public static void main(String[] args) {
        PrefixSum obj = new PrefixSum();
        int[] arr = new int[] { 2, 4, 6, 1, 8 };
        obj.Prefix(arr);

    }
}