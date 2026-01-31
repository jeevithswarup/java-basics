import java.util.Scanner;

public class HR__004{

    public static void main(String[] args) {
            Scanner sc=new Scanner(System.in);
            System.out.println("================================");
            int count;
            for (int i = 0; i < 3; i++) {
                count = 0;
                String s1=sc.next();
                int x=sc.nextInt();
                int temp=x;
                while(temp!=0){
                    int rem=temp%10;
                    temp=temp/10;
                    count++;
                }
                System.out.println(count);
                if(count < 3){
                    System.out.println(s1 + " "+ "0"+x);
                }
                else{
                    System.out.println(s1+" "+x);
                }
            }
            System.out.println("================================");

    }
}



