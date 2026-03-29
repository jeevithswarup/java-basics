public class LC_11 {
     
    
    public int Max_Area(int arr[]) {
        int left = 0;
        int right = arr.length - 1;
        int max_area = 0;

        while (left < right) {
            int min_height = Math.min(arr[left], arr[right]);
            int width = right - left;
            int area = min_height * width;
            max_area = Math.max(max_area, area);
            if (arr[left] < arr[right]) {
                left++;
            } else {
                right--;
            }
        }
        return max_area;
    }
    public static void main(String[] args) {
        LC_11 obj = new LC_11();
        int[] arr = new int[] { 1, 8, 6, 2, 5, 4, 8, 3, 7 };
        System.out.println(obj.Max_Area(arr));
    }
}