
import java.util.Arrays;

public class GP {
    public static void main(String[] args) {
        
int[] arr=new int[]{1,2,6,8,10,18,54,162};
       Arrays.sort(arr);

       for (int i = 0; i < arr.length-2; i++) {
           for (int j = i + 1; j < arr.length-1; j++) {

               for (int k = j + 1; k < arr.length; k++) {
                   if (arr[i] *arr[k] == arr[j]*arr[j]){
                    System.out.println(arr[i] +" " +arr[j]+ " "+arr[k]);
                   }
                
               }

            
           }

        }
    }
}
