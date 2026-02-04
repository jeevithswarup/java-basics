package PreInsta;

import java.util.Scanner;
 
class Prep {
    
    public void divisibilty(int a, int b, int n) {
        for (int i = a; i <= b; i++) {
            if (i % n == 0) {
                System.out.println(i + " is divisble by "+n);
            }
            a++;
        }
    }
        public static void main(String[] args){

        Scanner sc = new Scanner(System.in);
        
        int a = sc.nextInt();
        int b = sc.nextInt();
        int n = sc.nextInt();

        Prep obj = new Prep();
        obj.divisibilty(a,b,n);

}
}
