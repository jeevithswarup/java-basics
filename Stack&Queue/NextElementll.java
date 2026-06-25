import java.util.Arrays;
public class NextElementll {


    public int[] nextElementCircular(int[] arr,int n) {
        int[] res = new int[n];
        Arrays.fill(res, -1);

        for (int i = 0; i < arr.length ; i++) {
            boolean check = false;
            for (int j = i + 1; j < arr.length ; j++) {
                if (arr[i] < arr[j]) {
                    res[i]= arr[j];
                    check = true;
                    break;
                }
            }
            if (!check) {
                for (int j = 0; j < i; j++) {
                    if (arr[i] < arr[j]) {
                        res[i] = arr[j];
                        break;
                    }
                }
            }
        }


        return res;
    }
    
    public static void main(String[] args) {
        NextElementll obj = new NextElementll();
        int[] arr = new int[] { 2, 10, 12, 1, 11 };
        int n=arr.length;
        System.out.println(Arrays.toString(obj.nextElementCircular(arr, n)));
    }
}
