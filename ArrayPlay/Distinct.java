import java.util.Arrays;
public class Distinct {
    public void Check() {
        int count = 1;
        int[] arr = new int[] { 10, 10, 10, 23, 23, 23, 23, 31, 46, 85, 54, 78, 67, 2, 3, 97, 23, 23, 23, 10, 10 };
        Arrays.sort(arr);
        for (int i = 1; i < arr.length; i++) {
            if (arr[i] != arr[i -1]) {
                count++;
            }
        }
            System.out.println(count);   
    }
    public static void main(String[] args) {
        Distinct obj = new Distinct();
        obj.Check();
        
    }
}
