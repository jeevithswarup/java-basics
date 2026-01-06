import java.util.Arrays;

public class Repeating {

    public void Repeated() {
        int[] arr = new int[] { 10, 30, 20, 10, 10, 30, 3 };
        Arrays.sort(arr);
        //{3,10,10,10,20,30,30}
        for (int i = 0; i < arr.length; i++) {
            if ((i > 0 && arr[i] == arr[i - 1]) || (i < arr.length - 1 && arr[i] == arr[i + 1])) {
                continue;
            }
            System.out.println(arr[i]);
        }
    }

    public static void main(String[] args) {
        Repeating obj = new Repeating();
        obj.Repeated();
        
    }
}

