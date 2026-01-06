
import java.util.Scanner;

public class PrintNumbers {
    int n;
    int a;

    public void Print(int a, int n) {
        System.out.print("Series is :");
        for (int i = a; i <= n; i++) {
            System.out.print(i + ",");
        }
        a++;  
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the Starting Number: ");
        int a = sc.nextInt();
        System.out.print("Enter the Ending Number: ");
        int n = sc.nextInt();
        PrintNumbers obj = new PrintNumbers();
        obj.Print(a,n);
    }
}
