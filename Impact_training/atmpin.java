
import java.util.Scanner;

public class atmpin {
    
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int actual_pin = 2027;
        String status = "blocked";
        for (int i = 0; i < 3; i++) {
           
                int pin = sc.nextInt();
                 if (status == "Active") {
                if (pin == actual_pin) {
                    System.out.println("CORRECT PIN");
                    break;
                } else {
                    System.out.println("Incorrect");
                }
            } else {
                System.out.println("Account blocked");
            
                
            
        }

    }
}
