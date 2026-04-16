public class LC_004 {
    

    public double findMedianSortedArrays(int[] nums1, int[] nums2) {
        int m = nums1.length;
        int n = nums2.length;
        double[] merged = new double[m + n];
        int i = 0;
        int j = 0;
        int k = 0;
        while (i < m && j < n) {

            if (nums1[i] < nums2[j]) {
                merged[k] = nums1[i];
                i++;
                k++;
            } else {
                merged[k] = nums2[j];
                j++;
                k++;
            }
        }
        while (i < m) {
            merged[i++] = nums1[i];
        }
        while (j < n) {
            merged[j++] = nums2[j];
        }
        return 0;
    }
public static void main(String[] args) {
    LC_004 obj = new LC_004();
    int[] nums1 = new int[] { 1, 3 };
    int[] nums2 = new int[] { 2 };
    System.out.println(obj.);
}
    
}
