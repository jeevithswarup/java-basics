public class LC_1572 {
    public int diagonalSum(int[][] mat) {
        int sum=0;
        for (int i = 0; i < mat.length; i++) {
            
            sum += mat[i][i] + mat[i][mat[i].length - i-1];
        }

        return sum;
    }
    public static void main(String[] args) {
        LC_1572 obj = new LC_1572();
        int[][] mat=new int[][]{{1,2,3},
                                {4,5,6},
                                {7,8,9}
        };
     System.out.println(obj.diagonalSum(mat));
    }
}
