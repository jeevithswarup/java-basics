package PreInsta;

import java.util.Scanner;
public class Vowels {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int vowels = 0;
        int consonants = 0;

        System.out.print("Enter a String :");
        String str = sc.nextLine().toLowerCase();
        
        for (int i = 0; i < str.length(); i++) {
            char ch = str.charAt(i);
            if (ch >= 'a' && ch <= 'z') {
                if (ch == 'a' || ch == 'e' || ch == 'i' || ch == 'o' || ch == 'u') {
                    vowels++;
                } else {
                    consonants++;
                }
            }
        }
        System.out.println("Vowels  :" + vowels);
        System.out.println("Constants  :" + consonants);

        
    }
}
