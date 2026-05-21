import java.util.ArrayList;
import java.util.Scanner;
public class Array_List {

    

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        

        ArrayList<Integer> list = new ArrayList<>();

        for (int i = 0; i < 5; i++) {
            list.add(sc.nextInt());
        }
        System.out.println(list);
        for (int i = 0; i < list.size(); i++) {
            list.set(i, list.get(i) / 2);
        }
        System.out.println(list);
        sc.close();
    }
}
