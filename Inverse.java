public class Inverse {
     public void InverseNumber(int n){
            
            int position=1;
            int inverse=0;
        while(n!=0){
           int digit=n%10;
           n=n/10;
           inverse += position * (Math.pow(10, digit - 1));
           position++;

        }

     }

    public static void main(String[] args) {
        
    }
}