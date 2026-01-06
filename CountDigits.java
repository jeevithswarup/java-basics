import java.util.Scanner;
public class CountDigits {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a numbers : ");
        long n = sc.nextLong();
        long temp = n;
        long digits = 0;
        while (temp != 0) { //To Count Number of digits
            temp = temp / 10;
            digits++;
        }
        long div = (long) Math.pow(10, digits-1);
        while (div !=0) {
            long q = (n / div);
            System.out.println(q);

            n = n % div;
            div = div / 10;
        }

    }
}
