public class LC_074 {

    public boolean searchMatrix(int[][] matrix, int target) {

        for (int i = 0; i < matrix.length; i++) {
            if (matrix[i][0] <= target && target <= matrix[i][matrix[i].length - 1])

                if (binarySearch(matrix[i], target)) {
                    return true;
                }
        }
        return false;
    }

    public boolean binarySearch(int[] matrix, int target) {
        int low = 0;
        int high = matrix.length-1;
        while (low <= high) {
            int mid = low + (high - low) / 2;

            if (matrix[mid] == target) {
                return true;
            } else if (matrix[mid] > target) {
                high = mid - 1;
            } else {
                low = mid + 1;
            }
        }

        return false;

    }

    public static void main(String[] args) {
        LC_074 obj = new LC_074();
        int[][] matrix = new int[][] {
                { 1, 2, 3 },
                { 4, 5, 6 },
                { 7, 8, 9 }
        };
        int target = 8;
        System.out.println(obj.searchMatrix(matrix, target));
    }
}
