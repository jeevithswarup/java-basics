import java.util.Scanner;
public class Prime {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a Number :");
        int n = sc.nextInt();
        int i;
        for (i = 2; i < Math.sqrt(n); i++) {
            if (n % i == 0) {
                System.out.print(n + " " + "is a not a prime number");
                break;
            }
        }
        if (i > Math.sqrt(n)) {
            System.out.print(n + " " + "is a prime number");
        }
    }
}