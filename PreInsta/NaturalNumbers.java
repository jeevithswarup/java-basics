package PreInsta;

import java.util.Scanner;

public class NaturalNumbers {
    void Natural() {

        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int i = 1;
        int SumOf = 0;
        do {
            SumOf += i;
            i++;
        } while (i <= n);
        System.out.println(SumOf);
        sc.close();
    }

    public static void main(String[] args) {

        NaturalNumbers obj = new NaturalNumbers();
        obj.Natural();
    }

}
