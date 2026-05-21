public class hieghtstarts {
    



public static void main(String[] args) {
    int[] arr = new int[] { 2, 5, 2, 3, 5, 7 };
     
    int max = 7;

    for (int i = max; i >=1; i--) {

        for (int j = 0; j < arr.length; j++) {
            if (arr[j] >= i) {
                System.out.print("* ");
            } else {
                System.out.print("  ");
            }
        }
        System.out.println();
        
    }
    
}
}
