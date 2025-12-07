import java.util.Arrays;

public class MergeArrays {
    public static void main(String[] args) {
        int[] arr1={2,5,1,7,6,4};
        int[] arr2={1,6,9,9,8,2,4};
        int[] merged = new int[arr1.length + arr2.length];


        for (int i = 0; i <= arr1.length - 1; i++) {
            merged[i] = arr1[i];
        }
        for(int i= 0; i < arr2.length - 1;i++){
            merged[arr1.length + i] = arr2[i];
        }

        System.out.println("Merged Array" + Arrays.toString(merged) );
    }
    
}
