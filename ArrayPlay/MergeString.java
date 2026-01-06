
import java.util.Scanner;

public class MergeString {
    public void merge() {
        String str = new String();
        Scanner sc = new Scanner(System.in);
        str = sc.nextLine().toLowerCase();
        int n = str.length();
        int vowels = 0;
        int cons = 0;
        for (int i = 0; i < n; i++) {
            if (str.charAt(i) == 'a' || str.charAt(i) == 'e' || str.charAt(i) == 'i' || str.charAt(i) == 'o'|| str.charAt(i) == 'u') {
                vowels++;
            } else {
                cons++;
            }
        }
        System.out.println("Vowels:"+vowels);
        System.out.println("Consonants"+cons); 
    }
    public static void main(String[] args) {
        MergeString obj = new MergeString();
        obj.merge();
    }
}
