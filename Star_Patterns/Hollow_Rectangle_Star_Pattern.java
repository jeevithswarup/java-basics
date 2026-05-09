
import java.util.Scanner;

public class Hollow_Rectangle_Star_Pattern {
    
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int cols = sc.nextInt();
        int rows = sc.nextInt();

        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < cols; j++) {
                if (i == 0 || i == rows - 1) {
                    System.out.print("*");
                } else if (j == 0 || j == cols - 1) {
                    System.out.print("*");
                } else {
                    System.out.print(" ");
                }
            }
            System.out.println();
        }
        sc.close();
    }
    
}
