public class LC003_height {
     
    int[] arr = new int[] { 8, 3, 4, 2, 8, 5, 1, 7 };
    int largest;
    int second_larget;

    public void Fetch() {
        for (int i = 0; i < arr.length; i++) {
            int j=i+1;
            if (arr[i] > arr[j]) {
                largest = arr[i];
                second_larget = arr[j];
            }
            
        }
        
     }
    
}