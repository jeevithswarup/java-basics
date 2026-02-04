package PreInsta;
import java.util.Arrays;
public class SortFrequency {
    int[] arr = new int[] { 30, 20, 30, 10, 20, 20 };
    int[] values = new int[arr.length];
    int[] fre = new int[arr.length];
   int k=0; 
    public void Frequency() {
        Arrays.sort(arr);
        System.out.println(Arrays.toString(arr));
        for (int i = 0; i < arr.length; i++) {
            int count = 1;