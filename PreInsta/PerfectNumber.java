package PreInsta;

import java.util.Scanner;

public class PerfectNumber {
    

    public void CheckNumber(int n) {
        int sum = 1;
        int temp =(int)Math.sqrt(n);
        for (int i = 2; i <= temp; i++) {
            if (n % i == 0) {
                sum += i;
                int other=n / i;
                if (i != other) {
                    sum += n/i;
                }
            }
        }
        if (n == sum && n!=1) {
            System.out.print("It is a Perfect Number.");
        } else {
            System.out.print("It's not PerfectNumber");
        }
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a Number: ");
        int n = sc.nextInt();
        PerfectNumber obj = new PerfectNumber();
        obj.CheckNumber(n);

    }
    
}
