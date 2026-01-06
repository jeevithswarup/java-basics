
import java.util.Scanner;

public class GCD {
    int c;
    int temp1;
    int temp2;

    public void Gcd(int a, int b) {
        temp1 = a;
        temp2 = b;
        while (temp1 % temp2 != 0) {
            c = temp1 % temp2;
            temp1 = temp2;
            temp2 = c;
    
        }
        System.out.println("Gcd is: " + temp2);
    }

    public void Lcm(int a, int b) {
        int lcm = (a * b) / temp2;
       
        System.out.println(lcm);
    }
    public static void main(String[] args) {
        GCD obj = new GCD();
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int b = sc.nextInt();
        obj.Gcd(a, b);
        obj.Lcm(a, b);
    }  
    
}
