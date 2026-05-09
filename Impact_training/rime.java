public class rime {
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
  