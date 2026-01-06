public class ArrayFrequency {
    int[] arr = new int[] { 9, 54, 8, 8, 8, 1, 1, 1, 0, 7, 54, 24, 1, 6, 8, 9, 32 };
    boolean[] visited = new boolean[arr.length];
        
    public void UnsortedFrequency() {
        for (int i = 0; i < arr.length; i++) {
            int count = 1;
            if (visited[i] == true) {
                continue;
            }
            for (int j = i + 1; j < arr.length; j++) {
                if (arr[i] == arr[j]) {
                    count++;
                }
            }
            if (count > 1) {
                System.out.println("The frequency of " + arr[i] + " is:" + count);
               
            } 
        }
        }
    
    public static void main(String[] args) {
        ArrayFrequency obj = new ArrayFrequency();
        // obj.SortedFrequency();
        obj.UnsortedFrequency();

    }
    
}
