
import java.util.Scanner;


public class prac {

   public void evenOdd(int a, int b) {

      if ((a + b) % 2 == 0) {
         System.out.println("Sum is Even");
      } else {
         System.out.println("Sum is odd");
      }
   }

   public void GroupAllocations(int members) {

      if (members % 2 == 0 ) {
         System.out.println("Group Allowed");
      } else if (members == 15) {
         System.out.println("Group Allowed");
      } else {
         System.out.println("Not Aloowed");
      }
      
   }

   public static void main(String[] args) {
      prac obj = new prac();
      int a = 2;
      int b = 10;
     obj.evenOdd(a, b);
      Scanner sc = new Scanner(System.in);

      String s = sc.nextLine();

      if (s.equals("Jeevith")) {
         System.out.println("Verfied");
      } else {
         System.out.println("Invalid Name");
      }
     }
}
