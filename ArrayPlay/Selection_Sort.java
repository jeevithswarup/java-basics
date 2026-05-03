import java.util.Arrays;
public class Selection_Sort {
       
    public int[] sort(int[] arr) {
        int n = arr.length;
        int min_value = 0;
        for (int i = 0; i < n - 1; i++) {
             min_value = i;
             for (int j = i + 1; j < n; j++) {
                 if (arr[min_value] > arr[j]) {
                     min_value = j;
                 }
             }
             if (min_value != i) {
                 int temp = arr[i];
                 arr[i] = arr[min_value];
                 arr[min_value] = temp;
             }
            
        }
        return arr;
    }
     public static void main(String[] args) {
         Selection_Sort obj = new Selection_Sort();
         int[] arr = new int[] { 5, 2, 1, 6, 3 };
        System.out.println(Arrays.toString(obj.sort(arr)));
        
     }

}