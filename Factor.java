
import java.util.Scanner;

public class Factor {
    public void Factors() {
        Scanner sc = new Scanner(System.in);
        int Number = sc.nextInt();
        int temp = (int) Math.sqrt(Number);
        System.out.println(temp);
        for (int i = 1; i <= temp; i++) {
            if (temp % i == 0) {
                System.out.print(i + ",");
            }
     sc.close();
        }
    }
    
    public static void main(String[] args) {
        Factor obj = new Factor();
        obj.Factors();
       
    }
}
