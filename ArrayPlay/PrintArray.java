
import java.util.Arrays;
import java.util.Scanner;

public class PrintArray {
    Scanner sc = new Scanner(System.in);
    int n = sc.nextInt();
    int[] a = new int[n];

    public void Prints() {
        for (int i = 0; i < n; i++) {
            a[i] = sc.nextInt();
        }
        System.out.println(Arrays.toString(a));
        // for (int j = 0; j < n; j++) {
        //     System.out.print(a[j] + " ");
        // }
    }

    public void ReverseArray() {
        System.out.print("Reverse order Numbers are:");
        for (int j = n - 1; j >= 0; j--) {
            System.out.print(a[j] + " ");
        }
        System.out.println();
    }

    public void EvenOddArray() {
        System.out.println("Even Index Numbers are:");
        for (int e = 0; e < n; e += 2) {
            System.out.print(a[e] + " ");
        }
        System.out.println();
        System.out.println("Odd Index Numbers are:");
        for (int o = 1; o < n; o += 2) {

            System.out.print(a[o] + " ");
        }
        System.out.println();
    }

    public void PrimeArray() {
        System.out.print("Prime Number Index :");
        for (int p = 0; p < n; p++) {
            if (p <= 1)
                continue;
            int count = 0;
            for (int c = 2; c <= p / 2; c++) {
                if (p % c == 0) {
                    count++;
                    break;
                }
            }
            if (count == 0) {
                System.out.print(a[p] + " ");
            }

        }
     System.out.println();
    }

    public void skip() {
        System.out.print("Numbers without first & Last index: ");
        for (int i = 0; i < n; i++) {
            if (i == 0 || i == n - 1)
                continue;
            System.out.print(a[i] + " ");
        }
        System.out.println();
    }

    public void IndexArray() {
        for (int j = 0; j < n; j++) {
            System.out.println(j + "---------->" + " " + a[j]);
        }
        System.out.println();
    }

    public void RecursionArray(int index) {
        
        if (index < n - 1)
            return;
        System.out.print(a[index] + " ");
       
        RecursionArray(index+1);
    }

    public void Length() {
        
        int[] arr = new int[] { 36, 25, 85, 97, 45, 25, 14 };
        int count = 0;
        for (int i : arr) {
            count++;
        }
         System.out.print("Length of array :"+count);
    }
        public static void main(String[] args) {
        PrintArray obj = new PrintArray();
        obj.Prints();
        obj.ReverseArray();
        obj.EvenOddArray();
        obj.PrimeArray();
        obj.skip();
        obj.IndexArray();
        obj.Length();
        obj.RecursionArray(0);
    }
}

