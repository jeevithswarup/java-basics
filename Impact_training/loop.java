

public class loop {
    public static void main(String[] args) {
        
        for (int i = 50; i >= 1; i--) {
            if (i % 3 == 0) {
                System.out.println(i +" "+"divisible by 3");
            } else if (i % 2 == 0) {
                System.out.println(i +" "+"divisible by 2");
            } else {
                System.out.println("None");
            }
        }
 }   
}
