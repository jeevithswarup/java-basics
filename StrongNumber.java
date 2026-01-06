import java.util.Scanner;

public class StrongNumber {

    public void CheckStrong(int n) {
    int temp = n;
    int strong=0;
    while(temp!=0)
    {

        int res = temp % 10;
        temp = temp / 10;
        int fact = 1;
        for (int i = 1; i <= res; i++) {
            fact = fact * i;
        }
        strong += fact;
    }
    if (n == strong) {
        System.out.print("It is Strong Number");
    }
       System.out.print("It is not Strong Number");
}

public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    System.out.print("Enter a Number: ");
    int n = sc.nextInt();
    StrongNumber obj = new StrongNumber();
    obj.CheckStrong(n);
}
    }


