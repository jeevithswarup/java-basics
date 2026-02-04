import java.util.Scanner;

class Armstrong {
    
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter First Number: ");
        int fn = sc.nextInt();
        System.out.print("Enter Last Number: ");
        int ln=sc.nextInt();
        for (int j = fn; j <= ln; j++) {

            int temp = j;

            int count = 0;
            while (temp != 0) {
                temp = temp / 10;
                count++;
            }
            temp = j;
            int sum = 0;
            while (temp != 0) {
                int result = temp % 10;
                temp = temp / 10;
                sum += (int) Math.pow(result, count);
            }
            if (sum == j) {
                System.out.println(j + " is a armstrong number");
            } 
        }
    }
    }
