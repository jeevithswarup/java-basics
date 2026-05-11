import java.util.Scanner;

public class work {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int rows = sc.nextInt();

        for (int i = 1; i <= rows; i++) {
            for (int j = 1; j <= rows - i; j++) {
                System.out.print(" ");
            }
            for (int j = 1; j <= (2 * i - 1); j++) {
                System.out.print("*");
            }
            System.out.println();
        }
       for(int i=rows;i>=1;i--){
            
            for(int k=1;k<=rows-i;k++){
                System.out.print(" ");
            }
            for(int j=1;j<=(i*2)-1;j++){
            
                System.out.print("*");
                
            }
            System.out.println();
        }
    }


}
