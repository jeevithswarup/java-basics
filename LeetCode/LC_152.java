public class LC_152 {
    
    public int Max_Product(int[] arr) {
        int product = 1;
        int max_product = Integer.MIN_VALUE;
        int left = 0;
        for (int right = 0; right < arr.length; right++) {
            product *= arr[right];
            max_product = Math.max(max_product, product);
            while (product < 0) {
                product /= arr[left];
                left++;
            }
            
        }
        return max_product;
    }
public static void main(String[] args) {
    LC_152 obj = new LC_152();
    int[] nums = new int[] { -2, 3, -4 };
   System.out.println(obj.Max_Product(nums));
}
}