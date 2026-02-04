package PreInsta;
import java.util.Scanner;
public class PrintReverseOrder {
    int s=0;
    int e=0;
    public void ReverseOrder(int s, int e) {
        System.out.print("Reverse Order of the Given Range : ");
        while (e >= s) {
            System.out.print(e + ",");
            e--;
        }
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter Starting Number: ");
        int s = sc.nextInt();
        System.out.print("Enter Ending Number: ");
        int e = sc.nextInt();
        PrintReverseOrder obj = new PrintReverseOrder();
        obj.ReverseOrder(s, e);
    }
}
