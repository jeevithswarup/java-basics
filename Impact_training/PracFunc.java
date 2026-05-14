import java.util.Scanner;

public class PracFunc {

//display result and name
    public void result(String name, int s1_marks, int s2_marks, int s3_marks) {
        double avg = fetchResult(s1_marks, s2_marks, s3_marks);
        System.out.println(name + " " + avg);
    }
// calculate the average marks
    public double fetchResult(int s1_marks, int s2_marks, int s3_marks) {
        return (s1_marks+s2_marks+s3_marks)/3;

    }
    


    public static void main(String[] args) {
        PracFunc obj = new PracFunc();
        Scanner sc = new Scanner(System.in);
        String name = sc.nextLine();
        int s1_marks = sc.nextInt();
        int s2_marks = sc.nextInt();
        int s3_marks = sc.nextInt();
        obj.result(name, s1_marks,s2_marks,s3_marks);
        obj.fetchResult(s1_marks, s2_marks, s3_marks);
        sc.close();
    }
}
