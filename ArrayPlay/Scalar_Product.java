import java.util.Arrays;
import java.util.Collections;

public class Scalar_Product {
    public void find_scalar_product(int[] arr1,Integer[] arr2,int n,int sum) {
        Arrays.sort(arr1);
        Arrays.sort(arr2, Collections.reverseOrder());
        
        for (int i = 0; i < n; i++) {
            sum += arr1[i] * arr2[i];
        }
    System.out.println("Minimum Scalar Product is: " +sum);
    
 }

 public static void main(String[] args) {
     int[] arr1 = new int[] { 10, 30, 40, 20 };
     Integer[] arr2 = new Integer[]{ 2, 4, 5, 1 };
     int n = arr1.length;
     int sum = 0;
     Scalar_Product obj = new Scalar_Product();
     obj.find_scalar_product(arr1, arr2, n, sum);
    }
    
}


