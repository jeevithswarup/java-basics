import java.util.Arrays;

public class Non_Repeating {

    public void remove_duplicate() {
        int[] arr = new int[] { 10, 20, 40, 30, 50, 20, 10, 20 };

        boolean visited[] = new boolean[arr.length];
        Arrays.fill(visited, false);
       
        for (int i = 0; i < arr.length; i++) {

            if(visited[i]==true)
                continue;
            int count = 1;
            for (int j = i + 1; j < arr.length; j++) {
                if (arr[i] == arr[j]) {
                    visited[j] = true;
                    count++;
                }
            }
            if (count == 1) {
                System.out.println(arr[i]);
            }
        }
    }
    public static void main(String[] args) {
        Non_Repeating obj = new Non_Repeating();
        obj.remove_duplicate();        
    }
    }
