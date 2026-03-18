import java.util.HashSet;
public class Hashse {
    
    public int UniqueHash(int[] arr) {
       
        HashSet<Integer> set = new HashSet<>();
        for (int i : arr) {
            if (!set.add(i))
                return i;

        }
        return -1;
    }
public static void main(String[] args) {
    Hashse obj = new Hashse();
    int[] arr = new int[] { 1, 2, 2, 3, 4, 4 };
    System.out.println(obj.UniqueHash(arr));
}
}