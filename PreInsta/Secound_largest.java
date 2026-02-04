package PreInsta;
public class Secound_largest {
    public int Check_Secound_Largest() {
        int[] arr = new int[] {1,2,1};
        int j = arr[1];
        int largest = 0;
        int area;
        int secound_largest = 0;
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] > j) {
                largest = arr[i];
                secound_largest = j;
                j = arr[i];
            } else if (arr[i] > secound_largest && arr[i] < largest) {
                secound_largest = arr[i];
            } else {
                secound_largest = arr[i];
            }
            
        }
        
        area = secound_largest * secound_largest;
        System.out.println(area);
        return area;
    }
 
    public static void main(String[] args) {
        Secound_largest obj = new Secound_largest();
        obj.Check_Secound_Largest();    
    }
}
