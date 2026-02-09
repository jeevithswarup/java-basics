import java.util.Arrays;
public class LC66 {
     public int[] plusOne() {
        int[] arr = new int[]{9};
        int[] arr2 = new int[arr.length + 1];
        int count = 0;

        if (arr.length == 1 && arr[0] < 9) {
            arr[0] += 1;
            return arr;
        }
        else if (arr[arr.length - 1] == 9) {
            for (int i = 0; i < arr.length; i++) {
                if (arr[i] == 9) count++;
            }
            if (count == arr.length) {
                int j = arr.length;
                int temp = (int) Math.pow(10, count);

                while (j >= 0) {
                    arr2[j] = temp % 10;
                    temp /= 10;
                    j--;
                }
                return arr2;   
            }

            else {
                for (int i = arr.length - 2; i >= 0; i--) {
                    if (arr[i] < 9) {
                        arr[i]++;
                        arr[i + 1] = 0;
                        break;
                    } else {
                        arr[i + 1] = 0;
                    }
                }
                return arr;   
            }
        }

        else {
            arr[arr.length - 1]++;
            return arr;
        }
    }
    public static void main(String[] args) {
        LC66 obj = new LC66();
        System.out.println(Arrays.toString(obj.plusOne()));
    }
}

