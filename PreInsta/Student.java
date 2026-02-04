package PreInsta;

import java.util.Scanner;
public class Student {

    int Roll_Number;
    String Name;
    static String college_name= "Parul University";

    public void Student_details(int Roll_Number,String Name,String college_name) {
        System.out.println("Name : " + Name);
        System.out.println("Roll-Number : " + Roll_Number);
        System.out.println("College :" + college_name);
       }
    public static void main(String[] args) {
         Scanner sc = new Scanner(System.in);
         Scanner bc = new Scanner(System.in);
         int Roll_Number=sc.nextInt();
         String Name= bc.nextLine();
        Student obj = new Student();
       // Student obj1 = new Student();
        obj.Student_details(Roll_Number,Name,college_name);

    //     obj.Roll_Number = 45;
    //     System.out.println(obj.Roll_Number);
    //     System.out.println(obj1.Roll_Number);

    //     obj1.college_name = "jntu";
    //     System.out.println(obj.college_name);
    //    System.out.println(obj1.college_name); 


        

        
    }
    
}
