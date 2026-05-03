public class TwoDimensionArray {
    
    public int MatrixSum(int[][] nums) {

        int min_element = Integer.MAX_VALUE;
        for (int i = 0; i < nums.length; i++) {
            for (int j = 0; j < nums[i].length; j++) {
                min_element = Math.min(min_element, nums[i][j]);
            }

        }
        return min_element;
    }
        public static void main(String[] args) {
        TwoDimensionArray obj = new TwoDimensionArray();
        int [][] nums= new int[][] {  {1, 2, 3},
                                      {4, 5, 6},
                                      {7, 8, 9}
                                    };
        System.out.println(obj.MatrixSum(nums));
    }
}