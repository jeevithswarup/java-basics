import java.util.*;
public class Non_Duplicate {
    public void Remove_Duplicate() {
        int[] arr = new int[] { 23, 10, 20, 30, 10, 56, 10, 30, 20, 30 };
        //{10,10,10,20,20,23,30,30,30,56}
Arrays.sort(arr);
        for (int i = 0; i < arr.length; i++) {
            if ((i < arr.length - 1 && arr[i] == arr[i + 1]) || (i == arr.length - 1)) {
                continue;
            }
            System.out.println(arr[i]);
        }
    }

    public static void main(String[] args) {
        Non_Duplicate obj = new Non_Duplicate();
        obj.Remove_Duplicate();
    }
}
