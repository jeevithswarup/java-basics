package PreInsta;
import java.util.Scanner;
public class Rotate {
    int Number;
    int Rotations;
    int count;
    
    public void Backward_Rotation() {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a Number: ");
        Number = sc.nextInt();
        System.out.print("Enter number of rotation: ");
        Rotations = sc.nextInt();

        int temp = Number;
        count = 0;
        while (temp != 0) {
            temp /= 10;
            count++;
        }
        
        int k= Rotations % count;
    int power = (int) Math.pow(10,k);
       
    int right_part = Number % power;
        int left_part = Number / power;
    int result = (right_part * (int) Math.pow(10, count-k)) + left_part;
        System.out.println("Backward_Rotation is: " + result);
    }
    public void Forward_rotation() {
        int temp = Number;
         
        int k= Rotations % count; 
        int power = (int) Math.pow(10, count -k);
        int left_part = Number / power;
        int right_part = Number % power;
        
        int result = right_part * (int) Math.pow(10,k) + left_part;
        
        System.out.println("Forward_Rotation is: "+result);
        
    }
    public static void main(String[] args) {
        Rotate obj = new Rotate();
        obj.Backward_Rotation();
        obj.Forward_rotation();


    }
    }
 