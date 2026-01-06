
import java.util.Arrays;


public class ArraySort {
    int[] arr = new int[] { 9, 54, 8, 1, 1, 1, 1, 1, 1, 1, 0, 7, 54, 24, 1, 6, 8, 9, 32, 54, 54 };

    public void Sort() {
        for (int i = 0; i < arr.length; i++) {
            for (int j = i + 1; j <= arr.length - 1; j++) {
                if (arr[i] > arr[j]) {
                    int temp = arr[j];
                    arr[j] = arr[i];
                    arr[i] = temp;
                }
            }
        }
        System.out.println(Arrays.toString(arr));
                int start = arr.length / 2;
                int end = arr.length - 1;

                while (start < end) {
                    int buffer = arr[start];
                    arr[start] = arr[end];
                    arr[end] = buffer;
                    start++;
                    end--;
                }
         System.out.println(Arrays.toString(arr));
    }

    public void Frequency() {
            

            for (int i = 0; i < arr.length; i++) {
                int count = 1;
                for (int j = i + 1; j < arr.length; j++) {
                    if (arr[i] == arr[j]) {
                        count++;
                        i++;
                    } else {       
                        break;
                    }
                }
                if (count > 1) {
                    System.out.println("The frequency of " + arr[i] + " is:" + count);
                }
        }
    }

    public static void main(String[] args) {
        ArraySort obj = new ArraySort();
        obj.Sort();
        obj.Frequency();
    }
}
