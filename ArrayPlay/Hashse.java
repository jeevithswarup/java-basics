import java.util.HashSet;
public class Hashse {
    
    public int UniqueHash(int[] arr) {
       
        HashSet<Integer> set = new HashSet<>();
        int left = 0;
        int max_length = 0;
        for (int right = 0; right < arr.length;right++) {
            while (!set.add(arr[right])) {
                set.remove(arr[left]);
                left++;

            }
            max_length = Math.max(max_length,set.size());
        }
        return max_length;
    }
public static void main(String[] args) {
    Hashse obj = new Hashse();
    int[] arr = new int[] {1, 2, 3, 2, 4};
    System.out.println(obj.UniqueHash(arr));
}
}