import java.util.Scanner;

public class Month {
     public static void main(String[] args) {
         Scanner sc = new Scanner(System.in);
  
         int n = sc.nextInt();
         int sum = 0;
         if (n != 0) {
             for (int i = 1; i <= n; i++) {
                 sum *= i;

             }
         } else {
             sum = 1;
         }
     }
}