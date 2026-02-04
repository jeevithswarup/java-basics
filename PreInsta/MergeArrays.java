package PreInsta;
import java.util.Arrays;

public class MergeArrays {
    public static void main(String[] args) {
        int[] arr1={2,5,1,7,6,4};
        int[] arr2={1,6,9,8,2,4};
        double[] merged = new double[arr1.length + arr2.length];
        for(int i:arr1){
            merged[i] = arr1[i];
        }
        for (int i = 0; i <= arr2.length - 1; i++) {
            merged[arr1.length + i] = arr2[i];
        }
        Arrays.sort(merged);   
        int n = merged.length;
        if (n % 2 != 0) {
            double result = merged[(n/2)];
            System.out.println(result);
        } else {
            double result = (merged[(n/2)-1] + merged[n/2])/2;
            System.out.println(result);
           
        }
    }
    
}
