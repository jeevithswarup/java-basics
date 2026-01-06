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
            for (int j = i + 1; j < arr.length; j++) {
                if (arr[i] == arr[j]) {
                    count++;
                    i++;
                } else {
                    break;
                }
            }
            values[k] = arr[i];
            fre[k] = count;
            k++;
        }
        for (int i = 0; i < values.length; i++) {
            for (int j = i + 1; j < values.length; j++) {
                if (fre[i] < fre[j]) {
                    int temp = fre[j];
                    fre[j] = fre[i];
                    fre[i] = temp;

                    int buffer = values[j];
                    values[j] = values[i];
                    values[i] = buffer;
                }
            }
        }
        int r = 0;
        for (int i = 0; i < fre.length; i++) {
                for (int j = 1; j <= fre[i]; j++) {
                    arr[r] = values[i];
                    r++;
                                }
            
        }
        
        System.out.println(Arrays.toString(values));
        System.out.println(Arrays.toString(fre));
        System.out.println(Arrays.toString(arr));
    }
    public static void main(String[] args) {
        SortFrequency obj = new SortFrequency();
        obj.Frequency();
    }
}