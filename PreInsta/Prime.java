package PreInsta;
public class Prime {
    public void IsPrime(int n) {
        int i;
        if(n==0 | n==1){
             System.err.println("0 & 1 are not  prime numbers");
         } else {
             for (i = 2; i <= Math.sqrt(n); i++) {
                 if (n % i == 0) {
                     System.out.print(n + " " + "is a not a prime number");
                     break;
                 }
             }
             if (i > Math.sqrt(n)) {
                 System.out.print(n + " " + "is a prime number");
             }
         }
    }
    public static void main(String[] args) {
        Prime obj = new Prime();
        obj.IsPrime(6); 
    }
    }
    /* 
        Scanner sc = new Scanner(System.in);       //TO CHECK THE LIST NUMBERS ARE PRIME OR NOT
        int t = sc.nextInt();
        for (int i = 0; i <= t; i++) {
            int n = sc.nextInt();
            int count = 0;
            for (int div = 1; div <= n; div++) {
                if (n % div == 0) {
                    count++;
                }
            }
            if (count == 2) {
                System.out.println("Prime Number");
            } else {
                System.out.println("Not a prime number");
            }
        }
            */
        //TO FIND WHEATHER THE GIVEN NUMBER IS PRIME OR NOT
