import java.util.Arrays;

public class Max_Scalar_Product {
    


    public void find_max_scalar_product(int[] arr1, int[] arr2, int n, int sum) {
        Arrays.sort(arr1);
        Arrays.sort(arr2);
        int i = 0;
        while (i < n) {
            sum += arr1[i] * arr2[i];
            i++;
        }
        System.out.println("Maximum Scalr Product is :" + sum);
    }
    public static void main(String[] args) {
        int[] arr1 = new int[] { 20, 10, 40, 60, 30 };
        int[] arr2 = new int[] { 20, 10, 50, 40, 30 };
        int n = arr1.length;
        int sum = 0;
        Max_Scalar_Product obj = new Max_Scalar_Product();
        obj.find_max_scalar_product(arr1, arr2, n, sum);
    }
}
