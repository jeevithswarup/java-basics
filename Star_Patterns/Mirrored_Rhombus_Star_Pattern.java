
import java.util.Scanner;

public class Mirrored_Rhombus_Star_Pattern {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int cols = sc.nextInt();
        int rows = sc.nextInt();

        for (int i = 0; i < rows; i++) {
            
            for (int j = cols; j > i; j--) {
                System.out.print(" ");
            }
            for (int j = 0; j < cols; j++) {
                System.out.print("*");
            }
            System.out.println();
        }
    }

}
