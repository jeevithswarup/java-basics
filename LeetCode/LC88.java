
public class LC88 {

    public void merge(int nums1[], int nums2[], int m, int n) {
        for (int i = m - 1; i >= 0; i--) {
            for (int j = n - 1; j >= 0; j--) {
                if (nums1[i] < nums2[j]) {
                    nums1[i + j + 1] = nums1[j];
                } else {
                
               }

            }
        }
    }
    

    public static void main(String[] args) {
        LC88 obj = new LC88();
        int[] nums1 = new int[] { 1, 2, 9, 0, 0, 0 };
        int[] nums2 = new int[] { 2, 5, 6 }; 
        int m = 3;
        int n = 3;
        obj.merge(nums1, nums2, m, n);
    }
}

